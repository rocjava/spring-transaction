package com.penn.spring.transaction.service;

import com.penn.spring.transaction.entity.TUser;

/**
 *  服务实现类
 *
 * @author Penn.Zhang
 * @since 2019-12-23
 */
public interface ITUserService {
    /**
     * 通过主键获取数据
     * @param id 主键
     * @return 实体
     */
    TUser getById(Long id);

    /**
     * 根据主键更新
     */
    Integer updateById(TUser tUser);

    /**
     * 保存
     *
     * @param entity 实体对象
     * @return 主键
     */
    Long save(TUser entity) throws Exception;

    
}