package com.example.mpec;

import com.example.mpec.entity.Student;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MpecApplication {

	public static void main(String[] args) {

		// Cách 2 lấy bean:
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(new ClassPathResource("application.xml"));

		Student studentB = (Student) factory.getBean("studentB");
		System.out.println(studentB.getName());
		System.out.println(studentB.getAdress());
		System.out.println(studentB.getDiaChi().get(1).getThanhPho());
		System.out.println(studentB.getDiaChi().get(1).getQuanHuyen());



//		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
//		Student a = (Student) context.getBean("studentB");
//
//		System.out.println(a.getId());
//		System.out.println(a.getName());
//		System.out.println(a.getAdress());
	}

}
