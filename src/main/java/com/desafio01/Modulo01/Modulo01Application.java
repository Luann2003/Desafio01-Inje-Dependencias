package com.desafio01.Modulo01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.desafio01.Modulo01.entities.Order;
import com.desafio01.Modulo01.services.OrderService;

@SpringBootApplication
public class Modulo01Application implements CommandLineRunner {

	
	
	@Autowired
	private OrderService orderService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(Modulo01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Order order1 = new Order(1034, 150.00, 20.0);
 		Order order2 = new Order(2282, 800.0, 10.0);
 		Order order3 = new Order(1309, 95.90, 0.0);
 		
 		System.out.println();
 		System.out.print("Pedido código: "  + order1.getCode());
 		System.out.print("\nValor total: " + "R$: " +orderService.total(order1));
 		System.out.println();
 		
 		System.out.print("\nPedido código: "  + order2.getCode());
		System.out.print("\nValor total: " + "R$: " +orderService.total(order2));
		System.out.println();
		
		System.out.print("\nPedido código: "  + order3.getCode());
		System.out.print("\nValor total: " + "R$: " +orderService.total(order3) );
		System.out.println();
	}

}
