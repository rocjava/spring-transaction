package com.penn.spring.transaction.mapper;

import com.penn.spring.transaction.entity.TUser;
import org.apache.ibatis.annotations.Mapper;

/**
 *  Mapper 接口
 *
 * @author Penn.Zhang
 * @since 2019-12-23
 */
@Mapper
public interface TUserMapper {

    /**
     * 根据主键查询
     */
    TUser selectById(Long id);

    /**
     * 根据主键更新
     */
    int updateById(TUser tUser);

    /**
     * 插入数据
     */
    int insert(TUser tUser);

}