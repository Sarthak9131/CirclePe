package com.example.Intergalaxy.shipment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

	
@Repository
public interface ShipmentRepository extends JpaRepository<ShipmentInfo, Long> {
}

