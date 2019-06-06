package org.learn.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.learn.shoppingbackend.dao.CategoryDAO;
import org.learn.shoppingbackend.dto.Category;
import org.springframework.stereotype.Repository;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>(); 
	
	static {
		Category category = new Category();
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is a TV");
		category.setImageURL("Cat_1.png");
		
		categories.add(category);
		
		category = new Category();
		category.setId(2);
		category.setName("Phones");
		category.setDescription("This is a SmartPhones");
		category.setImageURL("phone_1.png");
		
		categories.add(category);
		
		category = new Category();
		category.setId(3);
		category.setName("Laptops");
		category.setDescription("This is a Laptop Section");
		category.setImageURL("laptop_1.png");
		
		categories.add(category);
	}
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		// TODO Auto-generated method stub
		for(Category cat: categories) {
			if(cat.getId() == id)
				return cat;
		}
		return null;
	}

}
