package com.vu.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.vu.model.entity.Product;

@Controller
public class UrlAttributeController {
	private static List<Product> products = new ArrayList<Product>();
	
	public UrlAttributeController() {
		Product pro01 = new Product(1, "T-Shirt", 250);
		Product pro02 = new Product(2, "Jean", 350);
		Product pro03 = new Product(3, "Jacket", 280);
		
		products.add(pro01);
		products.add(pro02);
		products.add(pro03);
	}

	@GetMapping("/url-attribute")
	public String getUrlAttribute(Model model) {
		return "attribute/url";
	}
	
	@GetMapping("/url-pass-param")
	public String getUrlPassParam(Model model) {
		
		
		model.addAttribute("products", products);
		return "attribute/url-pass-param";
	}
	
	@GetMapping("/url-pass-param/product")
	public String getUrlPassParamProduct(Model model, 
										@RequestParam("id") Integer id) {
		if (id != null) {
			for (Product product : products) {
				if (product.getId() == id) {
					model.addAttribute("product", product);
					break;
				}
			}
		}
		
		return "attribute/url-pass-param-product";
	}
	
	@GetMapping("/url-pass-param/product/edit/{id}")
	public String getUrlPassParamEditProduct(Model model, 
											@PathVariable("id") Integer id) {
		if (id != null) {
			for (Product product : products) {
				if (product.getId() == id) {
					model.addAttribute("product", product);
					break;
				}
			}
		}
		
		return "attribute/url-pass-param-product-edit";
	}
}
