package com.nicomama.service.impl;

import com.nicomama.dao.TypeConfigDao;
import com.nicomama.model.TypeConfig;
import com.nicomama.service.TypeConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class TypeConfigServiceImpl implements TypeConfigService {
    @Autowired
    private TypeConfigDao typeConfigDao;

    @Override
    public void insert(TypeConfig config) {
        typeConfigDao.insert(config);
    }

    @Override
    public void update(TypeConfig config) {
        typeConfigDao.update(config);
    }

    @Override
    public void delete(Long id) {
        typeConfigDao.delete(id, "name:" + id);
    }


    @Override
    public List<TypeConfig> list(Map<String, Object> params) {
        return typeConfigDao.listType(params);
    }
}
