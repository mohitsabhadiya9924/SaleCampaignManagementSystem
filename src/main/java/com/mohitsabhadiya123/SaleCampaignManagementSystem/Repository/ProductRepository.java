package com.mohitsabhadiya123.SaleCampaignManagementSystem.Repository;

import com.mohitsabhadiya123.SaleCampaignManagementSystem.Models_Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
