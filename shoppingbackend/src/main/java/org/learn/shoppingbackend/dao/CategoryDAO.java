package org.learn.shoppingbackend.dao;

import java.util.List;

import org.learn.shoppingbackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();
	Category get(int id);
}
