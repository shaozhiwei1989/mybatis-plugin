package com.nicomama.strategy;


import com.nicomama.parser.SqlParam;

public class TypeShardStrategy implements ShardStrategy {
    static final int _SHARD_NUM = 3;

    @Override
    public String parse(SqlParam sqlParam) {
        Long id = (Long) sqlParam.get("id");
        return "_" + id % _SHARD_NUM;//返回分表的后缀
    }

}
