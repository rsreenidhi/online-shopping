package org.learn.onlineshopping.controllers;

import org.learn.shoppingbackend.dao.CategoryDAO;
import org.learn.shoppingbackend.daoimpl.CategoryDAOImpl;
import org.learn.shoppingbackend.dto.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@Autowired
	private CategoryDAO categoryDAO;
	
	@RequestMapping(value = {"/", "/home", "/index"})
	public ModelAndView index() {
		
		ModelAndView mv = new ModelAndView("page");
		
		//passing list of categories
		mv.addObject("categories", categoryDAO.list()); 
		
		
		mv.addObject("title", "HOME");
		mv.addObject("userClickHome", true);
		return mv;
	}
	

	@RequestMapping(value ="/about")
	public ModelAndView about() {
		
		ModelAndView mv = new ModelAndView("page");
		
		mv.addObject("title", "About Us");
		mv.addObject("userClickAbout", true);
		return mv;
	}

	@RequestMapping(value ="/contact")
	public ModelAndView contact() {
		
		ModelAndView mv = new ModelAndView("page");
		
		mv.addObject("title", "Contact Us");
		mv.addObject("userClickContact", true);
		return mv;
	}
	
	/*
	 * Methods to load ALl products based on category
	 */
	@RequestMapping(value="/products")
	public ModelAndView showAllProducts() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "All Products");
		mv.addObject("categories", categoryDAO.list());
		mv.addObject("userClickAllProducts", true);
		return mv;
	}
	
	@RequestMapping(value="/products/{categoryId}")
	public ModelAndView showCategoryProducts(@PathVariable("categoryId")int categoryId) {
		ModelAndView mv = new ModelAndView("page");
		
		//categoryDAO to fetch single category
		
		Category category;
		category = categoryDAO.get(categoryId);
		
		
		mv.addObject("title", category.getName());
		mv.addObject("categories", categoryDAO.list());
		mv.addObject("category", category);
		mv.addObject("userClickCategoryProducts", true);
		return mv;
	}
}
