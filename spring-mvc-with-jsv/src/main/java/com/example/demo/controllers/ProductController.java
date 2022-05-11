package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Product;
import com.example.demo.repos.ProductRepository;

@Controller
public class ProductController {
	
	@Autowired
	private Product entity;
	
	@Autowired
	private ProductRepository repo;
	
	@RequestMapping(value = "/product",method = RequestMethod.GET)
	
	public String inItForm(Model model)
	{
		model.addAttribute("title","Add Products");
		model.addAttribute("command",entity);
		
		return "addProduct";
	}
	
	@RequestMapping(value ="/product",method=RequestMethod.POST)
	public String submitForm(@ModelAttribute("command") Product entity) {
		
		int rowAdded;
		
		try {
			rowAdded = this.repo.add(entity);
			return "success";
		} catch (Exception e) {
			
			e.printStackTrace();
			return "failure";
		}
		
	
		}
	@RequestMapping(value= "/product/srch", method = RequestMethod.GET)
	public String initSearchForm(Model model) {
			
			model.addAttribute("title","searchProducts");
			
			return "searched";
		}
	@RequestMapping(value= "/product/srch", method = RequestMethod.POST)
		
		public String searchProduct(@RequestParam("id") int id,Model model) {
			
			Product entity = repo.findById(id);
			model.addAttribute("found",entity);
			return "showproduct";
		}
	@RequestMapping(value="/product/del",method= RequestMethod.GET)
	public String intDelForm(Model model)
	{
		model.addAttribute("title","Delete Product");
		
		return "deletedproduct";
	}
	@RequestMapping(value="/product/del",method= RequestMethod.POST)
	public String deleteProduct(@RequestParam("id") int id,Model model) {
		int entity = repo.deleteById(id);
		model.addAttribute("delete",entity);
		return "afterdelproducts";
	}
	@RequestMapping(value = "/",method=RequestMethod.GET)
	public String initIndexPage(Model model) {

	model.addAttribute("title","Product Management");

		return "index";
	}
		
		}



