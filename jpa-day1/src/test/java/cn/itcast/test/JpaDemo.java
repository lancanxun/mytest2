package cn.itcast.test;

import cn.itcast.domain.Customer;
import cn.itcast.utils.JpaUtils;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class JpaDemo {

    //持久化机制
    //对持久化对象的操作会更新数据库
    //如何辨别对象是否进入持久化状态
    @Test
    public void test(){
        EntityManager em = JpaUtils.getEntityManager();
        EntityTransaction t = em.getTransaction();
        t.begin();
        //Customer C = em.find(Customer.class, 3L);
        Customer C = new Customer();
        System.out.println(C.getCustId());
        em.persist(C);
        System.out.println(C.getCustId());
        //C.setCustName("京东");
        //em.merge(C);
        System.out.println("断点调试");
        t.commit();
        C.setCustName("京东");
        //id
        em.close();
    }
}
