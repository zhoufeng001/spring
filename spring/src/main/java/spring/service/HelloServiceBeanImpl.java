package spring.service;
public class HelloServiceBeanImpl implements HelloServiceBean{
	
	public HelloServiceBeanImpl() {
		System.out.println("HelloServiceBeanImpl 构造方法");  
	}

	public void sayHello() {
		System.out.println("Hello World!"); 
	}

}


