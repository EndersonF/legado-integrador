<div align="center" id="top"> 
  <img src="./assets/logo-sefin.png" alt="Logo SEFIN" width="300" />

&#xa0;
</div>

<h1 align="center">🔗 Legacy Integrador API | Middleware Fiscal</h1>

<p align="center">
  <a href="https://www.java.com/pt-BR/">
    <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java" />
  </a>
  <a href="https://spring.io/projects/spring-boot">
    <img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring&logoColor=white" alt="Spring Boot" />
  </a>
  <a href="https://hibernate.org/">
    <img src="https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=hibernate&logoColor=white" alt="Hibernate" />
  </a>
  <a href="https://www.jetbrains.com/idea/">
    <img src="https://img.shields.io/badge/IntelliJ_IDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white" alt="IntelliJ IDEA" />
  </a>
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Status-Concluído_(PoC)-brightgreen?style=flat" alt="Status" />
</p>

<h4 align="center"> 
    🚧  Sustentação e Integração de Legado  🚧
</h4>

<hr>

<p align="center">
  <a href="#dart-sobre">Sobre</a> &#xa0; | &#xa0; 
  <a href="#rocket-tecnologias">Tecnologias</a> &#xa0; | &#xa0;
  <a href="#warning-pré-requisitos">Pré-Requisitos</a> &#xa0; | &#xa0;
  <a href="#checkered_flag-iniciando">Iniciando</a> &#xa0; | &#xa0;
  <a href="#memo-license">License</a> &#xa0; | &#xa0;
  <a href="https://github.com/endersonf" target="_blank">Autor</a>
</p>

<br>

## :dart: Sobre

API REST desenvolvida para estudos em Java, simulando a modernização e integração de sistemas fiscais.

O projeto atua como um **Middleware de Validação**, garantindo que dados críticos (como CPF e cadastro de contribuintes) passem por regras de negócio rigorosas antes de serem persistidos na base de dados. Foi desenhado utilizando arquitetura em camadas (Controller, Service, Repository) para facilitar a manutenção e a integração com sistemas legados (ex: Natural/Adabas).

Principais funcionalidades:

- Validação e consistência de dados (Bean Validation).
- Bloqueio de duplicidade de registros (integridade de dados).
- Exposição de endpoints REST padronizados.

## :rocket: Tecnologias

As seguintes ferramentas foram usadas na construção do projeto:

- [Java 17 (LTS)](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Spring Boot 3.4.12](https://spring.io/projects/spring-boot)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [H2 Database](https://www.h2database.com/) (banco em memória)
- [Lombok](https://projectlombok.org/) (redução de boilerplate)
- [Maven](https://maven.apache.org/) (gerenciamento de dependências)

## :warning: Pré-requisitos

Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas:  
[Git](https://git-scm.com) e [Java JDK 17+](https://adoptium.net/).

Também é recomendável ter um editor para trabalhar com o código, como [IntelliJ IDEA](https://www.jetbrains.com/idea/) ou [VSCode](https://code.visualstudio.com/).

## :checkered_flag: Iniciando

```bash
# Clone este repositório
git clone https://github.com/endersonf/legado-integrador.git

# Acesse a pasta do projeto no terminal/cmd
cd legado-integrador

# O projeto utiliza o Maven Wrapper, então não é necessário instalar o Maven globalmente.
# Para rodar a aplicação (Linux/Mac):
./mvnw spring-boot:run

# Para rodar a aplicação (Windows):
mvnw spring-boot:run

# O servidor será inicializado em:
# http://localhost:8080/api/contribuintes
```

## 🔌 Testando a API (via terminal)
Para validar as regras de negócio sem precisar de frontend, utilize o cURL:

```bash
# 1. Cadastrar um novo contribuinte (POST)
curl -X POST http://localhost:8080/api/contribuintes \
  -H "Content-Type: application/json" \
  -d '{"nome": "Dev Sefin", "cpf": "11122233344", "email": "dev@sefin.ro.gov.br"}'

# 2. Tentar cadastrar o MESMO contribuinte novamente
# Esperado: Erro 400 Bad Request (Regra de Negócio: CPF Duplicado)

# 3. Consultar lista de contribuintes (GET)
curl http://localhost:8080/api/contribuintes
```
## :memo: License
Este projeto está sob a licença MIT.

Feito com ❤️ por <a href="https://github.com/endersonf" target="_blank">Enderson</a>

<a href="#top">Voltar ao topo ↑</a>