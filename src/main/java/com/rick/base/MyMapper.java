package com.rick.base;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * mysql自定义类
 *
 * @author daiyongjun
 * @version 1.0
 * @date 2019/1/2 9:39
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {

}
