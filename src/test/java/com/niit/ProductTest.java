package com.niit;

//import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.ProductDAO;
import com.niit.models.Product;

public class ProductTest {

public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		ProductDAO productDAO = (ProductDAO) context.getBean("productDAO");
		Product product = (Product) context.getBean("product");
		product.setId("TAB_002");
		product.setName("videocon");
		product.setDescription("Tablet product2");
		productDAO.saveOrUpdate(product);
		
	/*	categoryDAO.delete("CAT_1");
		categoryDAO.get("CAT_1");
	
		List<Category>  list =    categoryDAO.list();
		
		for(Category cat : list)
		{
			System.out.println(cat.getId()  + ":" +  cat.getName()  + ":"+  cat.getDescription());
		}
			
			
		context.close();
	*/	
	}
}
