package com.example.Intergalaxy.usertest;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transaction_ID;

    @Column(name = "address", nullable = false)
    private String Origin;

    @Column(name = "destinaton", nullable = false)
    private String Destination;

    @Column(name = "cost", nullable = false)
    private Float Cost;
    
    @Column(name = "payment", nullable = false)
    private Boolean Payment;
   

	public Long getTransaction_ID() {
		return transaction_ID;
	}

	public void setTransaction_ID(Long transaction_ID) {
		this.transaction_ID = transaction_ID;
	}

	public String getOrigin() {
		return Origin;
	}

	public void setOrigin(String origin) {
		Origin = origin;
	}

	public String getDestination() {
		return Destination;
	}

	public void setDestination(String destination) {
		Destination = destination;
	}

	public Float getCost() {
		return Cost;
	}

	public void setCost(Float cost) {
		Cost = cost;
	}

	public Boolean getPayment() {
		return Payment;
	}

	public void setPayment(Boolean payment) {
		Payment = payment;
	}
    
}


