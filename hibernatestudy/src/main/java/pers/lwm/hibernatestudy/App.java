package pers.lwm.hibernatestudy;

import java.sql.Timestamp;

import pers.lwm.hibernatestudy.domain.Customer;
import pers.lwm.hibernatestudy.service.BusinessService;

/**
 * 使用hibernate api 与 xml映射文件
 * 
 * @author liuwma 2017/04/11
 */
public class App {

	public static void main(String[] args) {
		test();
		System.out.println("--end--");
	}

	public static void test() {
		Customer customer = new Customer();
		customer.setEmail("lwm@163.com");
		customer.setName("lwm");
		customer.setRegisteredTime(new Timestamp(System.currentTimeMillis()));

		BusinessService businessService = new BusinessService();

		businessService.saveCustomer(customer);
	}
}
