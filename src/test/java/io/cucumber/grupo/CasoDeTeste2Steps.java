package io.cucumber.grupo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.grupo.configuracao.Configuracao;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

public class CasoDeTeste2Steps {
	public WebDriver browser;
	@Entao("clico no menu servicos devo ver os servicos disponiveis")
	public void clico_no_menu_servicos_devo_ver_os_servi_os_disponiveis() throws InterruptedException {
		Configuracao.browser.findElement(By.xpath("//*[@id=\"navigation-menu\"]/div[2]/div[1]")).click();
		Thread.sleep(2000);
	}

	@Dado("clico no menu servicos")
	public void clico_no_menu_servicos() {
		Configuracao.browser.findElement(By.xpath("//*[@id=\"navigation-menu\"]/div[2]/div[1]")).click();
	}

	@Entao("clico no item do menu cloud e encontro o titulo servicos de cloud")
	public void clico_no_item_do_menu_cloud_e_encontro_o_titulo_servicos_de_cloud() throws InterruptedException {
		Thread.sleep(5000);
    	Configuracao.seletorQueryCss("a[href='/br-pt/services/cloud-index']").click();
    	Thread.sleep(5000);
    	Configuracao.fechar();
	}


}