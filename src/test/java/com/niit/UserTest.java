package com.niit;

//import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.UserDAO;
import com.niit.models.User;

public class UserTest {

public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		UserDAO userDAO = (UserDAO) context.getBean("UserDAO");
		User user = (User) context.getBean("user");
		user.setId("TAB_004");
		user.setName("lenovo");
		user.setDescription("Tablet user3");
		userDAO.saveOrUpdate(user);
		
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
