package com.penn.spring.transaction.service.impl;

import com.penn.spring.transaction.entity.TOrder;
import com.penn.spring.transaction.entity.TUser;
import com.penn.spring.transaction.service.ISpringTransactionService;
import com.penn.spring.transaction.service.ITOrderService;
import com.penn.spring.transaction.service.ITUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

/**
 * @author penn
 * @since 2019/12/23
 */
@Service
public class SpringTransactionServiceImpl implements ISpringTransactionService {

    @Autowired
    private ITOrderService itOrderService;

    @Autowired
    private ITUserService itUserService;


    /**
     * 如果User有异常，则order和user都回滚
     * 如果User没有异常，则order和user都保存
     * @throws Exception 抛异常
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void transactionRequired() throws Exception {
        itOrderService.save(getOrder());
        itUserService.save(getUser());
    }

    /**
     * 如果Order或User有事务，则添加事务，如果没有事务，那就没事务。
     * 所以，如果User没有事务，即使抛出异常，仍然有两条数据；
     * 反之，如果User有事务，则抛出异常后，User回滚，但是Order会保存。
     * 这个例子上，Order和User都没有事务，所有抛出异常后，数据都会保存。
     * @throws Exception
     */
    @Override
    @Transactional(propagation = Propagation.SUPPORTS, rollbackFor = Exception.class)
    public void transactionSupports() throws Exception {
        itOrderService.save(getOrder());
        itUserService.save(getUser());
    }

    @Override
    @Transactional(propagation = Propagation.MANDATORY, rollbackFor = Exception.class)
    public void transactionMandatory() throws Exception {
        itOrderService.save(getOrder());
        itUserService.save(getUser());
    }

    @Override
    public void transactionRequiresNew() {

    }

    @Override
    public void transactionNotSupported() {

    }

    @Override
    public void transactionNever() {

    }

    @Override
    public void transactionNested() {

    }

    private TOrder getOrder(){
        TOrder order = new TOrder();
        order.setId(1L);
        order.setOrderNo(UUID.randomUUID().toString());
        order.setPrice(10000);
        return order;
    }

    private TUser getUser(){
        TUser user = new TUser();
        user.setId(1L);
        user.setUserName("joy.john");
        user.setAge(30);
        return user;
    }
}
