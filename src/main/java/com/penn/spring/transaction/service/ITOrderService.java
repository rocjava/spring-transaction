package com.penn.spring.transaction.service;

import com.penn.spring.transaction.entity.TOrder;

/**
 *  服务实现类
 *
 * @author Penn.Zhang
 * @since 2019-12-23
 */
public interface ITOrderService {
    /**
     * 通过主键获取数据
     * @param id 主键
     * @return 实体
     */
    TOrder getById(Long id);

    /**
     * 根据主键更新
     */
    Integer updateById(TOrder tOrder);

    /**
     * 保存
     *
     * @param entity 实体对象
     * @return 主键
     */
    Long save(TOrder entity);
    
}