package cn.itcast.constructor;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstanceTest1 {
	@Test
	public void test1(){
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("cn/itcast/constructor/beans1.xml");
		System.out.println(applicationContext.getBean("bean1"));
	}

}
