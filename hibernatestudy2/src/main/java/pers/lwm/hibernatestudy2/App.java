package pers.lwm.hibernatestudy2;

import java.sql.Date;

import pers.lwm.hibernatestudy2.domain.Customer;
import pers.lwm.hibernatestudy2.service.BusinessService;

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
    	customer.setEmail("lwm2@163.com");
    	customer.setName("lwm2");
    	customer.setRegisteredTime(new Date(System.currentTimeMillis()));
    	
    	BusinessService businessService = new BusinessService();
    	
    	businessService.saveCustomer(customer);
    }
}
