package cn.itcast.static_factory;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstanceTest2 {
	@Test
	public void test2(){
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("cn/itcast/static_factory/beans2.xml");
	    System.out.println(applicationContext.getBean("bean2"));
	}

}
