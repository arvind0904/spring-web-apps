package demo.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;

public class Test {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Resource obj = new ClassPathResource("applicationContext.xml");
		BeanFactory bean = new XmlBeanFactory(obj);
		
		Product product =  (Product)bean.getBean("product");
		product.product_details();
		
		
	}

}
