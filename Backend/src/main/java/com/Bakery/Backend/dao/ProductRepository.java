package com.Bakery.Backend.dao;

import java.util.List;

import com.Bakery.Backend.model.Product;

public interface ProductRepository 
	{
	public boolean addProduct(Product product);
	public boolean updateProduct(Product product);
	public boolean deleteProduct(int ProductId);
	public List<Product> getAllProduct();
	public Product getProductId(int ProductId);

}
