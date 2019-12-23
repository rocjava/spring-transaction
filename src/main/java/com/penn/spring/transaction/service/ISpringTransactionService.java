package com.penn.spring.transaction.service;

/**
 * @author penn
 * @since 2019/12/23
 */
public interface ISpringTransactionService {
    /**
     * 默认事务传播行为
     * Propagation.REQUIRED
     */
    void  transactionRequired() throws Exception;

    /**
     * Propagation.SUPPORTS
     */
    void transactionSupports() throws Exception;

    /**
     * Propagation.MANDATORY
     */
    void transactionMandatory() throws Exception;

    /**
     * Propagation.REQUIRES_NEW
     */
    void transactionRequiresNew();

    /**
     * Propagation.NOT_SUPPORTED
     */
    void transactionNotSupported();

    /**
     * Propagation.NEVER
     */
    void transactionNever();

    /**
     * Propagation.NESTED
     */
    void transactionNested();
}
