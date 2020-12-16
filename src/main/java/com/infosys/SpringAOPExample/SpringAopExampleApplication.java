package com.infosys.SpringAOPExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.AbstractApplicationContext;

import com.infosys.SpringAOPExample.service.CustomerServiceImpl;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class SpringAopExampleApplication {

	public static void main(String[] args) {
		CustomerServiceImpl service = null;
		AbstractApplicationContext context = (AbstractApplicationContext)SpringApplication.run(SpringAopExampleApplication.class, args);
		service = (CustomerServiceImpl) context.getBean("customerService");
		System.out.print(service.fetchCustomer());
		context.close();
	}

}
