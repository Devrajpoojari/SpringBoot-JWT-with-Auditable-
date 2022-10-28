package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.entity.OmsSchemaOmsqtorderDatesXf;

@Repository
public interface OmsSchemaOmsqtorderDatesXfRepository extends JpaRepository<OmsSchemaOmsqtorderDatesXf, Integer> {
	/*
	 * @Query("select p from Product p where p.pname=?1 " ) public Product
	 * getProduct() {
	 * 
	 * }
	 */

}
