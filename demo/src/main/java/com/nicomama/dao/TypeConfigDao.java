package com.nicomama.dao;

import com.nicomama.annotation.DataSource;
import com.nicomama.model.TypeConfig;
import com.nicomama.strategy.DataSourceStrategyImpl;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface TypeConfigDao {
    /**
     * 添加
     *
     * @param config
     */
    @DataSource(strategy = DataSourceStrategyImpl.class)
    void insert(TypeConfig config);

    /**
     * 更新
     *
     * @param config
     */
    @DataSource(strategy = DataSourceStrategyImpl.class)
    void update(TypeConfig config);

    /**
     * 删除
     *
     * @param id
     */
    @DataSource(strategy = DataSourceStrategyImpl.class)
    void delete(@Param("id") Long id, @Param("name") String name);

    /**
     * 查询类别
     *
     * @return
     */
    @DataSource(strategy = DataSourceStrategyImpl.class)
    List<TypeConfig> listType(Map<String, Object> params);
}
