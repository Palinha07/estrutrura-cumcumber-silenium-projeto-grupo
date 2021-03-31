package io.cucumber.grupo;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.grupo.configuracao.Configuracao;
import io.cucumber.java.pt.*;

public class CasoDeTeste2Steps {
	public WebDriver browser;

	String[] menuElements;
	int counter = 0;

	@Quando("clico no menu servicos")
	public void clico_no_menu_servicos() throws InterruptedException {
		Configuracao.seletorQueryCss("div[data-id='primaryLink2_Servios']").click();
		Thread.sleep(2000);
	}

	@Entao("devo ver os itens de servicos")
	public void devo_ver_os_itens_de_servicos(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
			Thread.sleep(5000);
		    //Busca dentro da div primaryLink2_Servios o elemento <ul></ul>
	    	By mySelector = By.xpath("//*[@id=\"primaryLink2_Servios\"]/div/div/ul");

			//Através deste mySelector (<ul></ul>), identifica a quantidade de (<li></li>)
			// Montando uma lista (myElements) com a quantidade de <li></li>
			//String[] menuElements - Array
	    	List<WebElement> myElements = Configuracao.browser.findElements(mySelector);  

    
			// Através da Lista myElements, percorre todos os itens (<li></li>) (22)
	    	for(WebElement e : myElements) {
				//Para cada item da lista (<li></li>)
				
				//Armazena dentro da variavel (textLine) o text (ex: Accenture Strategy / Business Process Services / ....)
	    		String textLine = e.getText(); 
				
				//escreve a mensagem no console.
	    		System.out.println(textLine);
	    	
				//a funcao split, faz a quebra da linha onde tiver espaço (\n)
				//e alimenta o array (menuElements)
				//(ex: Accenture Strategy / Business Process Services / ....)
				//fica assim
				//Accenture Strategy
				//Business Process Services
	    		menuElements = textLine.split("\n");	    		
	    	}
	    
			int contador;
			//Percorre todos os itens do array String[] menuElements	
	    	for (int i = 0; i < menuElements.length; i++) {
	    		String linha = dataTable.row(i).get(0);
	    		
				
				
				//Compara os itens da dataTable com os elementos do array 
	    		if(menuElements[i].equals(linha)) {
					//Se forem iguais, alimenta a variavel contador com cada item
	    			contador++;
	    		}
			}
		    //valida se a variavel contador é (igual) = 22 e retorna true.
	    	assertEquals(22, contador);
	    	Configuracao.fechar();
	}
}

	@E("clico no item do menu cloud")
	public void clico_no_clico_no_item_do_menu_cloud() throws InterruptedException {
		Thread.sleep(2000);
		Configuracao.seletorQueryCss("a[href='/br-pt/services/cloud-index']").click();
	}

	@Entao("devo encontrar o titulo de {string}")
	public void devo_encontrar_o_titulo_de(String string) {
		String textoElement = Configuracao.seletorQueryCss("h1[class='rte-inline col-xs-12 page-title ']").getText();
		assertEquals("Serviços de Cloud", textoElement);
		Configuracao.fechar();
	}

}