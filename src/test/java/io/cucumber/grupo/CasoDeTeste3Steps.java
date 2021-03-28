package io.cucumber.grupo;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.grupo.configuracao.Configuracao;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class CasoDeTeste3Steps {
	public WebDriver browser; 
	
	@Dado("aceito os termos LGPD para teste")
	public void aceito_os_termos_LGPD() throws InterruptedException {
		Configuracao.seletorQueryCss("#onetrust-pc-btn-handler").click();
		Thread.sleep(5000);
		Configuracao.seletorQueryCss(".save-preference-btn-handler.onetrust-close-btn-handler").click();
	}
	
	@Dado("clico no menu carreiras")
	public void clico_no_menu_carreiras() throws Exception {
		Thread.sleep(3000);
		Configuracao.seletorQueryCss("div[data-id='primaryLink4_Carreiras'] span").click();
			    
	}
	
	@Dado("clico no item do menu vagas em tecnologia que mostra o destaque carreiras em tecnologia")
	public void clico_no_item_do_menu_vagas_em_tecnologia_que_mostra_o_destaque_carreiras_em_tecnologia() throws InterruptedException {
		Thread.sleep(3000);
		Configuracao.seletorQueryCss
		("#primaryLink4_Carreiras .secondary-nav-menu li a[href='/br-pt/careers/explore-careers/area-of-interest/technology-careers']").click();
		Thread.sleep(3000);
	}
	
	@Dado("clico no botao pesquisa")
	public void clico_no_botao_pesquisa() {
	   Configuracao.seletorQueryCss(".ion-ios-search.serp").click();
	}

	@Dado("digito no campo de busca {string}")
	public void digito_no_campo_de_busca(String string) {
		document.getElementById("#search-form-label").value = "DESENVOLVEDOR";
	}

	@Dado("clico no botao procurar")
	public void clico_no_botao_procurar() {
	    Configuracao.seletorQueryCss(".search-text").click();
	}

	@Entao("devo encontrar vagas para programadoresprogramadores")
	public void devo_encontrar_vagas_para_programadoresprogramadores() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
}