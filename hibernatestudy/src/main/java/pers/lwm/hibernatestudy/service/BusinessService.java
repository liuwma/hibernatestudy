package pers.lwm.hibernatestudy.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pers.lwm.hibernatestudy.domain.Customer;

public class BusinessService {

	public static SessionFactory sessionFactory;

	static {
		// 根据默认位置的Hibernate配置文件，创建一个Configuration实例
		Configuration config = new Configuration();
		// 加载Customer类的对像关系映射文件
		//config.addClass(Customer.class);
		// 创建sessionFactory实例
		sessionFactory = config.configure().buildSessionFactory();
	}

	public void findAllCustomers() {

	}

	public void saveCustomer(Customer customer) {
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(customer);
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null) {
				tx.rollback();
			}
		} finally {
			session.close();
		}
	}
}
