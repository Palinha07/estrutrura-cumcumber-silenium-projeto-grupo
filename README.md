# Projeto QA 404-Este Grupo não Existe! - Accenture

<b>Este projeto foi elaborado por:</b>
<ul>
<li>Elaine Souza Moreira https://github.com/Elainemor</li>
<li>Manoela Paloma https://github.com/Palinha07</li>
<li>Kerolayne Gomes https://github.com/kerollainy</li>
<li>Vitoria Paiva https://github.com/victoriardspaiva</li>
<li>Regina Moura https://github.com/ReginaMoura</li>
</ul>

# Descrição do desafio
### Criar uma aplicação Selenium com os seguintes casos de teste
### Caso de teste 1
Acessar o site da accenture e aceitar os cookies do LGPD<br>

<b>Cenario</b>: Aceitar o cookie LGPD<br>
Dado que eu estou no site da accenture<br>
Entao aceito os termos LGPD<br>
<b>Cenario</b>: Configuracoes do cookie<br>
Dado que eu estou no site da accenture<br>
E clico em configuracaes de cookie<br>
Entao devo ver os itens<br>
- [x]sua privacidade<br>
- [x]Cookies estritamente necessarias<br>
- [x]Cookies Analiticos de Primeira Parte<br>
- [x]Cookies de Desempenho e Cookies Funcionais<br>
- [x]Cookies de Publicidade e Redes Sociaisbr<br>

### Caso de teste 2
Acessar o site da accenture a mostrar a lista de serviços<br>

<b>Cenário</b>: listar serviços da Accenture<br>
dado que eu estou no site da accenture<br>
e clico no menu serviços<br>
Então devo ver os serviços abaixo<br>
- [x] Accenture Strategy
- [x] Application Services
- [x] Artificial Intelligence
- [x] Automation
- [x] Business Process Services
- [x] Change Management
- [x] Cloud
- [x] Customer Experience
- [x] Data & Analytics
- [x] Ecosystem Partners
- [x] Finance Consulting
- [x] Industry X
- [x] Infrastructure
- [x] Marketing
- [x] Mergers & Acquisitions (M&A)
- [x] Operating Models
- [x] Security
- [x] Supply Chain Management
- [x] Sustainability
- [x] Technology Consulting
- [x] Technology Innovation
- [x] Zero Based Budgeting (ZBB)

<b>Cenário</b>: Clicar no serviço cloud<br>
dado que eu estou no site da accenture<br>
e clico no menu serviços<br>
e clico no item do menu cloud<br>
Então devo encontrar o título "Serviços de Cloud"<br>

### Caso de teste 3
Acessar a lista de carreiras da accenture<br>

<b>Cenário</b>: Acessar o item de vagas de tecnologia<br>
Dado que eu estou no site da accenture<br>
E aceito os termos LGPD para teste<br>
E clico no menu carreiras<br>
E clico no item procurar por vagas<br>
E digito no campo de busca Desenvolvedor<br>
E clico no botao procurar<br>
Entao devo encontrar vagas para programadores<br>

###  Caso de teste 4                     
Sobre a accenture<br>

<b>Cenário</b>: Ver as características da accenture<br>
dado que eu estou no site da accenture<br>
e clico no menu sobre a accenture<br>
e clico no item do menu sobre a accenture<br>
Então devo ver o destaque em "Nosso propósito"<br>

----------------------------------------------------------------------

## Tecnologias utilizadas
:heavy_check_mark: <b>Java</b><br>
Linguagem de programação para desenvolvimento da aplicação<br>

:heavy_check_mark: <b>Maven</b><br>
Gerenciador de dependências para o Java<br>

:heavy_check_mark: <b>Cucumber</b><br>
Framework responsável por traduzir uma linguagem humana em código Java<br>

:heavy_check_mark: <b>Selenium</b><br>
Framework responsável por fazer a integração do código java com a linguagem Gherkin(Cucumber) abrindo o browser fazendo o teste de comportamento<br>

--------------------------------------------------------------------
## Como utilizar
### Pré requisitos
- Instalar o java:
https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR
- Instalar jdk
https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html
- Verificar se o JAVA_HOME está configurado em seu computador



- Clone do projeto
 ```bash
git clone https://github.com/Palinha07/estrutrura-projeto-grupo
 ```

- Entrando na pasta do projeto
 ```bash
cd estrutrura-projeto-grupo
 ```

- Configurando selenium em seu computador
Fazer o download do Chrome Webdriver e colocar o arquivo descompactado dentro da pasta driver na rapiz do projeto:<br>
https://chromedriver.chromium.org/downloads<br>

<b>Exemplo:</b><br>
 ```bash
cd driver
curl https://chromedriver.storage.googleapis.com/89.0.4389.23/chromedriver_linux64.zip
unzip chromedriver_linux64.zip
rm -rf chromedriver_linux64.zip
cd ../driver
 ```
- Executando teste no Unix
 ```bash
./test.sh
 ```

- Executando teste no Windows
 ```bash
test.bat
 ```

--------------------------------------------------------------------
## Estrutura de arquivos
<pre>
$ git tree
.gitignore
.mvn
   |-- wrapper
   |   |-- MavenWrapperDownloader.java
   |   |-- maven-wrapper.jar
   |   |-- maven-wrapper.properties
README.md
driver
   |-- chromedriver.exe
mvnw
mvnw.cmd
pom.xml
src
   |-- main
   |   |-- java
   |   |   |-- io
   |   |   |   |-- cucumber
   |   |   |   |   |-- grupo
   |   |   |   |   |   |-- TesteSiteAcc.java
   |-- test
   |   |-- java
   |   |   |-- io
   |   |   |   |-- cucumber
   |   |   |   |   |-- grupo
   |   |   |   |   |   |-- CasoDeTeste1Steps.java
   |   |   |   |   |   |-- CasoDeTeste2Steps.java
   |   |   |   |   |   |-- CasoDeTeste3Steps.java
   |   |   |   |   |   |-- CasoDeTeste4Steps.java
   |   |   |   |   |   |-- CompartilhadoSteps.java
   |   |   |   |   |   |-- RunCucumberTest.java
   |   |   |   |   |   |-- configuracao
   |   |   |   |   |   |   |-- Configuracao.java
   |   |-- resources
   |   |   |-- io
   |   |   |   |-- cucumber
   |   |   |   |   |-- grupo
   |   |   |   |   |   |-- .gitkeep
   |   |   |   |   |   |-- casoDeTeste1.feature
   |   |   |   |   |   |-- casoDeTeste2.feature
   |   |   |   |   |   |-- casoDeTeste3.feature
   |   |   |   |   |   |-- casoDeTeste4.feature
test.bat
test.sh

</pre>