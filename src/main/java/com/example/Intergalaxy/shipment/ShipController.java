package com.example.Intergalaxy.shipment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Shipment")
public class ShipController {
	
    @Autowired
    private ShipService shipmentService;
	
    @GetMapping("/test")
    public ResponseEntity<String> getResource() {
        return ResponseEntity.ok("Resource found");
    }
    
    @GetMapping("/{id}")
    public ShipmentInfo getUserById(@PathVariable Long id) {
        return shipmentService.getShipmentInfoById(id);
    }

    @PostMapping("/add")
    public void createShipmentInfo(@RequestBody ShipmentInfo shipment) {
        shipmentService.saveShipmentInfo(shipment);
        
    }
    
//    @PutMapping("/{id}")
//    public ShipmentInfo updateShipmentInfo(@PathVariable Long id, @RequestBody ShipmentInfo userDetails) {
//        ShipmentInfo shipss = ShipmentRepository.findById(id).get();
//        if (shipss != null) {
//            shipss.setOrder_status(userDetails.getOrder_status());
//        }
//        return null;
//    }
    
} 