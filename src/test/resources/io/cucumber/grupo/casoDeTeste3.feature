#language: pt

Funcionalidade: Acessar lista de carreiras da Accenture

	Cenario: Acessar o item de vagas de tecnologia
		Dado que eu estou no site da accenture
		E aceito os termos LGPD para teste
		E clico no menu carreiras
		E clico no item do menu vagas em tecnologia que mostra o destaque carreiras em tecnologia
		E clico no botao pesquisa
		E digito no campo de busca "DESENVOLVEDOR"
		E clico no botao procurar
		Entao devo encontrar vagas para programadoresprogramadores