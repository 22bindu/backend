package com.niit;
//import java.util.List;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.SupplierDAO;
import com.niit.models.Supplier;


public class SupplierTest {
	
	
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		SupplierDAO supplierDAO = (SupplierDAO) context.getBean("SupplierDAO");
		Supplier supplier = (Supplier) context.getBean("supplier");
		supplier.setId("TAB_001");
		supplier.setName("Air pad");
		supplier.setDescription("Tablet product1");
		supplierDAO.saveOrUpdate(supplier);
		
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

