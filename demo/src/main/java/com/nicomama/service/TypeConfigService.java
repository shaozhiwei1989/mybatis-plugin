package com.nicomama.service;

import com.nicomama.model.TypeConfig;

import java.util.List;
import java.util.Map;

public interface TypeConfigService {
    /**
     * 添加
     *
     * @param config
     */
    void insert(TypeConfig config);

    /**
     * 更新
     *
     * @param config
     */
    void update(TypeConfig config);

    /**
     * 删除
     *
     * @param id
     */
    void delete(Long id);

    List<TypeConfig> list(Map<String, Object> params);
}
