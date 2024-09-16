package com.example.Intergalaxy.shipment;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "shipment_tabel")
public class ShipmentInfo {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
    @Column(name = "order_status", nullable = false)
    private String order_status	;
    
    @Column(name = "trnx_id", nullable = false)
    private int trnx_id;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	
	public int getTrnx_id() {
		return trnx_id;
	}

	public void setTrnx_id(int trnx_id) {
		this.trnx_id = trnx_id;
	}
	public String getOrder_status() {
		return order_status;
	}
	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}

    
}
