package com.example.demo;

public class ErrorExamples {
	
	/*Erro de chaves em lugar errado{}*/
    public void testeEmptyBlock()
    {}

    /* Não permitir Exception genérico */
    /* Não permitir blocos em branco*/
    public void testeCatchBlock() {
    	try {
    		
    	} catch(Exception ex) {
    		
    	}
    }
    
    public void magicNumbers() {
    	int a = 10 + 5;
    }
    
    public void nestedIfs() {
    	if( "teste".equals("teste")) {
    		if( "teste".equals("teste")) {
    			if( "teste".equals("teste")) {
    				
    			}
    		}
    	}
    }
    
    public void Indentacao() {
    			System.out.println("Erro de indentação");
    }
}
