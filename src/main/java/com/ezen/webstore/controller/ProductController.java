package com.ezen.webstore.controller;

import java.math.BigDecimal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ezen.webstore.domain.Product;

@Controller
public class ProductController {
	@RequestMapping("/products") 
	public String list(Model model) { 
		Product iphone = new Product("P1234", "������ 6s", 
				new BigDecimal(500)); 
		iphone.setDescription("���� ������ 6s ����Ʈ�� "
				+ "���÷��� �԰�: 4.00-inch 640x1136, "
				+ "�Ĺ� ī�޶�: 8-megapixel");
		iphone.setCategory("Smartphone"); 
		iphone.setManufacturer("Apple"); 
		iphone.setUnitsInStock(1000); 
		model.addAttribute("product", iphone); // �𵨿� �߰�
		return "products"; // �� �̸� ��ȯ
	} 
}
