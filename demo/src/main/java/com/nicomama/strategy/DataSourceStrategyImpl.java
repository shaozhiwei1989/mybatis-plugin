package com.nicomama.strategy;


import com.nicomama.parser.DSParam;

public class DataSourceStrategyImpl implements DataSourceStrategy {
    static final int _SHARD_NUM = 2;

    @Override
    public String parse(DSParam dsParam) {
        Long id = (Long) dsParam.get("id");
        if (id == null) {
            return null;
        }
        return "dataSource_" + id % _SHARD_NUM;//返回分表的后缀
    }

}
