#####事务的特性  
1.原子性  
2.一致性  
3.隔离性  
4.持久性  
****
#####事务的隔离级别  
1.读未提交read-uncommitted  
2.读已提交read-committed  
3.可重复读repeatable_read  
4.序列化serializable  
****
#####不同事务隔离级别带来的一些问题  
1.读未提交----脏读、不可重复读、幻读  
2.读已提交----不可重复读、幻读    
3.可重复读----幻读  
4.序列化化----无  
****
#####spring事务传播行为  
1.Propagation.REQUIRED,如果当前存在事务，则加入该事务，如果当前不存在事务，则创建一个新的事务,它是spring事务默认传播行为;  
2.Propagation.SUPPORTS,如果当前存在事务，则加入该事务；如果当前不存在事务，则以非事务的方式继续运行;  
3.Propagation.MANDATORY,强制的，如果当前存在事务，则加入该事务；如果当前不存在事务，则抛出异常;  
4.Propagation.REQUIRES_NEW,重新创建一个新的事务，如果当前存在事务，延缓当前的事务;  
5.Propagation.NOT_SUPPORTS,以非事务的方式运行，如果当前存在事务，暂停当前的事务;  
6.Propagation.NEVER,以非事务的方式运行，如果当前存在事务，则抛出异常;  
7.Propagation.NESTED,如果没有，就新建一个事务；如果有，就在当前事务中嵌套其他事务。  