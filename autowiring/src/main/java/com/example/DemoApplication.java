package com.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DemoApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource obj = new ClassPathResource("applicationContext.xml");
		BeanFactory bean = new XmlBeanFactory(obj);
		Profile profile = (Profile)bean.getBean("profile");
		profile.setId(01);
		profile.setSkill("Java Springs");
		User user = (User)bean.getBean("user");
//		profile.setUser(user);
		profile.getProfileDetails();
	}

}
