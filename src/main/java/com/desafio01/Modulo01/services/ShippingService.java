package com.desafio01.Modulo01.services;

import org.springframework.stereotype.Service;

import com.desafio01.Modulo01.entities.Order;

@Service
public class ShippingService {

	public double shipment(Order order) {
		if(order.getBasic() < 100) {
			double payment = order.getBasic() + 0;
			return payment;
		}else if(order.getBasic() < 200) {
			double payment =  order.getBasic() + 12;
			return payment;
		}
		else {
			double payment = order.getBasic() + 0;
			return payment;
		}
	}
	
}
