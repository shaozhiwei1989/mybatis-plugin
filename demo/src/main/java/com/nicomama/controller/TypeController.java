package com.nicomama.controller;

import com.nicomama.model.TypeConfig;
import com.nicomama.service.TypeConfigService;
import com.nicomama.vo.PageData;
import com.nicomama.vo.RespData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Controller
@RequestMapping("/typeconfig")
public class TypeController {
    @Autowired
    private TypeConfigService typeConfigService;

    AtomicLong id = new AtomicLong(15);

    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public RespData<String> add(@RequestBody TypeConfig config) {
        try {
            typeConfigService.insert(config);
            return new RespData<String>(200, "添加成功!", "添加成功!");
        } catch (Exception e) {
            e.getMessage();
            return new RespData<String>(200, e.getMessage(), null);
        }
    }

    @ResponseBody
    @RequestMapping(value = "/modify", method = RequestMethod.POST)
    public RespData<String> modify(@RequestBody TypeConfig config) {
        try {
            typeConfigService.update(config);
            return new RespData<String>(200, "修改成功!", "修改成功!");
        } catch (Exception e) {
            e.getMessage();
            return new RespData<String>(200, e.getMessage(), null);
        }
    }

    @ResponseBody
    @RequestMapping("/delete")
    public RespData<String> delete(Long id) {
        try {
            typeConfigService.delete(id);
            return new RespData<String>(200, "删除成功!", "删除成功!");
        } catch (Exception e) {
            e.getMessage();
            return new RespData<String>(200, e.getMessage(), null);
        }
    }

    @ResponseBody
    @RequestMapping("/list")
    public PageData<TypeConfig> list() {
        try {
            Map<String, Object> params = new HashMap<>();
            params.put("id", 5L);
            List<TypeConfig> types = typeConfigService.list(params);
            return new PageData<TypeConfig>(200, types, -1, -1);
        } catch (Exception e) {
            e.printStackTrace();
            return new PageData<TypeConfig>(500, e.getMessage(), null, -1, -1);
        }
    }

    @ResponseBody
    @RequestMapping("/test")
    public RespData<TypeConfig> test() {
        try {

            TypeConfig config = new TypeConfig();
            config.setId(id.incrementAndGet());
            config.setName("name:" + config.getId());
            config.setOrder(1);
            typeConfigService.insert(config);
            return new RespData<TypeConfig>(200, config);
        } catch (Exception e) {
            e.printStackTrace();
            return new RespData<>(500, e.getMessage(), null);
        }
    }
}
