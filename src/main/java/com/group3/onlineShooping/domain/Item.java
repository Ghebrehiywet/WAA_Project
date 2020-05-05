package com.group3.onlineShooping.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.Objects;
import com.group3.onlineShooping.domain.Product;

@Entity
public class Item {
    @Id
    @GeneratedValue
    private Long id ;
    private double itemPrice;
    private Long quantity ;

    @OneToOne
    private Product product ;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", itemPrice=" + itemPrice + ", quantity=" + quantity + ", product=" + product + "]";
	}


    

   
}
