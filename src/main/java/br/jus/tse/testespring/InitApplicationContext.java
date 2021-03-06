package br.jus.tse.testespring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.jus.tse.testespring.beans.controller.EleicaoController;

public class InitApplicationContext {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
        
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/applicationContext.xml");
        
        EleicaoController eleicaoController = applicationContext.getBean(EleicaoController.class);
        
        eleicaoController.divulgarResultados();
        
    }
	
}
