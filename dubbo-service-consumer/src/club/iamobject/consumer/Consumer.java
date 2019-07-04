package club.iamobject.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import club.iamobject.provider.DemoService;

public class Consumer {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-consumer.xml");
		context.start();
		DemoService demoService = (DemoService)context.getBean("demoService"); // 
	    String hello = demoService.sayHello("world"); //ִ
	    System.out.println(hello);
	}
}
