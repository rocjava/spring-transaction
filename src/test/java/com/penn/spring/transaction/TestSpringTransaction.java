package com.penn.spring.transaction;

import com.penn.spring.transaction.service.ISpringTransactionService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author penn
 * @since 2019/12/23
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestSpringTransaction {

    @Autowired
    private ISpringTransactionService iSpringTransactionService;

    @Test
    public void testDefault() throws Exception {
        iSpringTransactionService.transactionRequired();
    }

    @Test
    public void testSupports() throws Exception {
        iSpringTransactionService.transactionSupports();
    }

    @Test
    public void testMandatory() throws Exception {
        iSpringTransactionService.transactionMandatory();
    }
}
