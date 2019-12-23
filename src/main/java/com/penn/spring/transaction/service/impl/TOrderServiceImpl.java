package com.penn.spring.transaction.service.impl;

import com.penn.spring.transaction.entity.TOrder;
import com.penn.spring.transaction.mapper.TOrderMapper;
import com.penn.spring.transaction.service.ITOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *  服务实现类
 *
 * @author Penn.Zhang
 * @since 2019-12-23
 */
@Service
public class TOrderServiceImpl implements ITOrderService {
    @Autowired
    private TOrderMapper tOrderMapper;

    /**
     * 通过主键获取数据
     * @param id 主键
     * @return 实体
     */
    @Override
    public TOrder getById(Long id) {
        return tOrderMapper.selectById(id);
    }

    /**
     * 根据主键更新
     */
    @Override
    public Integer updateById(TOrder tOrder) {
        return tOrderMapper.updateById(tOrder);
    }

    /**
     * 保存
     *
     * @param entity 实体对象
     * @return 主键
     */
    @Override
    public Long save(TOrder entity) {
        tOrderMapper.insert(entity);
        return entity.getId();
    }

}