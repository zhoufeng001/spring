package spring.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import spring.service.HelloServiceBean;

public class Test01 {
	
	public static void main(String[] args) throws Exception {  
		
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml")) ;  
		
		for (int i = 0; i < 10 ; i++) {
			HelloServiceBean helloService = beanFactory.getBean(HelloServiceBean.class) ;
			helloService.sayHello(); 
		}
	}

}


