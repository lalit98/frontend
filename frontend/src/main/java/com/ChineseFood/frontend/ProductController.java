package com.ChineseFood.frontend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Bakery.Backend.dao.CategoryRepository;
import com.Bakery.Backend.dao.ProductRepository;
import com.Bakery.Backend.model.Category;
import com.Bakery.Backend.model.Product;

@Controller
public class ProductController {
	
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	CategoryRepository categoryRepository;
	
	@RequestMapping("/product")
	public String productPage(Model model)
	{
		List<Product>AllProduct=productRepository.getAllProduct();
		List<Category> AllCategory= categoryRepository.getAllCategory();
		
		model.addAttribute("dat",new Product());
		model.addAttribute("productList",AllProduct);
		model.addAttribute("categoryList",AllCategory);
		
		return "Product";
	}
	
	@RequestMapping(value="/addProduct",method=RequestMethod.POST)
	
		public String productAdd(@ModelAttribute("dat") Product product)
		{
			if(product.getProductId()==0)
			{
				if(productRepository.addProduct(product))
				{
					
				}
				
			}
			else
			{
					productRepository.updateProduct(product);
			}
				return "redirect:/Product";
		
		}

			@RequestMapping("/deleteProduct/{id}")
			public String productDelete(@PathVariable("id")int productId)
					{
						productRepository.deleteProduct(productId);
						return "redirect:/Product";
					}
				

							@RequestMapping("/editProduct/{id}")
							
							public String product(@PathVariable("id")int ProductId,Model model)
							{
								Product productData=productRepository.getProductId(ProductId);
								model.addAttribute("dat",productData);
								List<Product>allProduct=productRepository.getAllProduct();
								model.addAttribute("productList",allProduct);
								return "Product";
							}
							

}
