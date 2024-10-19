<h1 align="center"> NK Currency Trade© - </h1>

<p align="center">
<img loading="lazy" src="http://img.shields.io/static/v1?label=STATUS&message=EM%20DESENVOLVIMENTO&color=GREEN&style=for-the-badge"/>
</p>

https://github.com/user-attachments/assets/f632988c-f133-4740-a8a1-52d161bbc3cb

<h2>
  **Descrição** <br>
</h2>

<p align="center">
O *NK Currency Trade* é um aplicativo em Java que permite a conversão de valores entre diferentes moedas utilizando uma API de câmbio. O programa oferece um menu interativo para o usuário selecionar a moeda de origem, a moeda de destino e o valor a ser convertido. Os resultados são apresentados ao usuário e salvos em arquivos JSON para referência futura.
</p>

<h2>
  <br>**Funcionalidades**<br>
</h2>

<p>
  - Conversão de valores entre várias moedas.
  - Menu interativo para seleção de opções.
  - Armazenamento de resultados em arquivos JSON.
  - Tratamento de erros para entradas inválidas.
</p>

<h2>
  **Tecnologias utilizadas**<br>
</h2>

<p>
  - Java
  - Gson (para manipulação de JSON)
  - Java HTTP Client (para requisições à API)
  - JDK 11 ou superior
</p>

<h2>
  <br>**Estrutura do projeto**<br>
</h2>

<p>
  com.currencytrade
  │
  ├── main
  │   └── Main.java             # Classe principal do programa
  │
  ├── models
  │   ├── Convert.java          # Classe que representa a conversão de moedas
  │   └── CurrencyType.java     # Classe que representa o tipo de moeda
  │
  ├── services
  │   └── ApiService.java       # Classe que lida com as requisições à API
  │
  └── menu
      └── Menu.java             # Classe que contém as opções do menu <br>
</p>

<h2>
  **Como usar** <br>
</h2>

<p>
  1 - Clone o repositório:<br>
  
  git clone https://github.com/usuario/currency-trade.git<br>
  cd currency-trade
  
  2 - Compile o projeto:<br>
  
  javac -d out src/com/currencytrade/main/Main.java src/com/currencytrade/models/*.java src/com/currencytrade/services/*.java src/com/currencytrade/menu/*.java<br>
  
  3 - Execute o programa:<br>
  
  java -cp out com.currencytrade.main.Main<br>
  
  4 - Siga as instruções no menu para realizar as conversões de moeda.<br>
</p>


