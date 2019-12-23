package com.penn.spring.transaction.mapper;

import com.penn.spring.transaction.entity.TOrder;
import org.apache.ibatis.annotations.Mapper;

/**
 *  Mapper 接口
 *
 * @author Penn.Zhang
 * @since 2019-12-23
 */
@Mapper
public interface TOrderMapper {

    /**
     * 根据主键查询
     */
    TOrder selectById(Long id);

    /**
     * 根据主键更新
     */
    int updateById(TOrder tOrder);

    /**
     * 插入数据
     */
    int insert(TOrder tOrder);

}