package com.mateus.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.mateus.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
