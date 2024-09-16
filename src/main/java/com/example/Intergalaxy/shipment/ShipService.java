package com.example.Intergalaxy.shipment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@EntityScan(basePackages = "com.example.Intergalaxy.shipment")
public class ShipService {
	
    @Autowired
    private ShipmentRepository shipRepository;
    
    public ShipmentInfo getById(Long id) {
        return shipRepository.findById(id).orElse(null);
    }
    
    public ShipmentInfo saveShipmentInfo(ShipmentInfo shipment) {
        return shipRepository.save(shipment);
    }

	public ShipmentInfo getShipmentInfoById(Long id) {
		
		return null;
	}

}