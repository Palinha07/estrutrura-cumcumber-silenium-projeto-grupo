package io.cucumber.grupo;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import io.cucumber.grupo.configuracao.Configuracao;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

public class CasoDeTeste4Steps {

    @Dado("clico no menu sobre a accenture")
    public void clico_no_menu_sobre_a_accenture(){
        Configuracao.browser.findElement(By.xpath("//*[@id=\"navigation-menu\"]/div[5]/div[1]")).click();
    }

    @Dado("clico no item do menu sobre a accenture")
    public void clico_no_item_do_menu_sobre_a_accenture() throws InterruptedException {
        Thread.sleep(5000);
        Configuracao.seletorQueryCss("#primaryLink5_SobreaAccenture > div > div > ul > li:nth-child(1) > ul > li:nth-child(1) > a").click();
    }

    @Entao("devo ver o destaque em nosso proposito")
    public void devo_ver_o_destaque_em_nosso_proposito() throws InterruptedException {
    	String item = Configuracao.seletorQueryCss("#block-section-1 > div > div > div > div > div > div.scrollmagic-pin-spacer > div > div.panel.panel-1 > div > div > h3").getText();
		assertEquals("Nosso propósito:", item);	
        Configuracao.fechar();        
    }
}