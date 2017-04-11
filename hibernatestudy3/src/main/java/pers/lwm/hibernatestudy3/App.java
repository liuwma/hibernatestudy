package pers.lwm.hibernatestudy3;

import java.sql.Date;

import pers.lwm.hibernatestudy3.domain.Customer;
import pers.lwm.hibernatestudy3.service.BusinessService;

/**
 * 使用hibernate api 与 注解映射
 * 
 * @author liuwma 2017/04/11
 */
public class App {
	public static void main(String[] args) {
		test();
        System.out.println( "--end--" );
    }
    
    
    public static void test(){
    	Customer customer = new Customer();
    	customer.setEmail("lwm3@163.com");
    	customer.setName("lwm3");
    	customer.setRegisteredTime(new Date(System.currentTimeMillis()));
    	
    	BusinessService businessService = new BusinessService();
    	
    	businessService.saveCustomer(customer);
    }
}
