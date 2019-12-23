package com.penn.spring.transaction.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.penn.spring.transaction.mapper.TUserMapper;
import com.penn.spring.transaction.entity.TUser;
import com.penn.spring.transaction.service.ITUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *  服务实现类
 *
 * @author Penn.Zhang
 * @since 2019-12-23
 */
@Service
public class TUserServiceImpl implements ITUserService {
    @Autowired
    private TUserMapper tUserMapper;

    /**
     * 通过主键获取数据
     * @param id 主键
     * @return 实体
     */
    @Override
    public TUser getById(Long id) {
        return tUserMapper.selectById(id);
    }


    /**
     * 根据主键更新
     */
    @Override
    public Integer updateById(TUser tUser) {
        return tUserMapper.updateById(tUser);
    }

    /**
     * 保存
     *
     * @param entity 实体对象
     * @return 主键
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public Long save(TUser entity) throws Exception {
        tUserMapper.insert(entity);
        return entity.getId();
    }

}