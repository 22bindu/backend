package com.niit;

//import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.CategoryDAO;
import com.niit.models.Category;

public class CategoryTest {

public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		CategoryDAO categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
		Category category = (Category) context.getBean("category");
		category.setId("TAB_002");
		category.setName("microphone");
		category.setDescription("Tablet product2");
		categoryDAO.saveOrUpdate(category);
		
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
