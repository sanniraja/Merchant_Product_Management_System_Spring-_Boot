package org.jsp.merchant_app.repository;

import java.util.List;

import org.jsp.merchant_app.dto.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepository extends JpaRepository<Product, Integer> 
{
	@Query("select p from Product p where p.merchant.id=?1")
	public List<Product> findByMerchantId(int merchant_id);

}
