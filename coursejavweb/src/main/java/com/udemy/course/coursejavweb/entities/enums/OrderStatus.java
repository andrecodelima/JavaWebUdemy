package com.udemy.course.coursejavweb.entities.enums;

public enum OrderStatus {
	
	//Cada atributo desses acima ocupa uma posição automaticamente, para termos uma boa
	// manutenção do código em caso de mudanças ou adições de atributos,
	// nós explicitamos essas posições.
	
	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	

	// Para tornar viável a explicitação dessas posicoes precisaremos criar um construtor como abaixo:
	
	private int code;
	
	private OrderStatus(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	
	// Metodo para converter valor numero para o tipo enumerado
	public static OrderStatus valueOf(int code) { // Se passa 1 vai retornar waiiting_payment e assim por diante
		for(OrderStatus value : OrderStatus.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		//execção
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}
	

}
