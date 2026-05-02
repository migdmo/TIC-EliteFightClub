<div align="center">

# 🥊 Elite Fight Club  
### *Sistema de Gerenciamento para Academia de Luta*  

<img src="https://img.shields.io/badge/Status-Concluído-success?style=for-the-badge" />
<img src="https://img.shields.io/badge/Java-POO-orange?style=for-the-badge&logo=openjdk" />
<img src="https://img.shields.io/badge/Paradigma-Orientado%20a%20Objetos-blue?style=for-the-badge" />
<img src="https://img.shields.io/badge/Projeto-Acadêmico-red?style=for-the-badge" />

---

### 🎓 Trabalho Interdisciplinar de Computação (TIC)  
### Desenvolvido para a disciplina de Programação Orientada a Objetos  

> Um sistema acadêmico desenvolvido com foco em **Programação Orientada a Objetos (POO)**, simulando a gestão de uma academia de luta profissional.  
> O projeto aplica de forma prática os principais pilares e conceitos de engenharia de software utilizando **Java**.

</div>

---

# 📌 Sobre o Projeto

O **Elite Fight Club** é um sistema desenvolvido como Trabalho Interdisciplinar de Computação (TIC), com o objetivo de simular o funcionamento interno de uma academia de luta por meio de um software orientado a objetos.

O sistema foi projetado para representar, de forma prática e estruturada, os principais processos administrativos e operacionais de uma academia, como:

- cadastro de alunos;
- gerenciamento de professores;
- controle de planos;
- administração de treinos;
- organização das entidades do sistema;
- relacionamento entre objetos do domínio.

Mais do que apenas um sistema funcional, este projeto foi construído como uma aplicação prática dos conceitos fundamentais de **Programação Orientada a Objetos**, servindo como estudo de modelagem, estruturação e implementação de software em Java.

---

# 🎯 Objetivo Acadêmico

Este projeto teve como principal objetivo aplicar, na prática, os conceitos fundamentais de **POO (Programação Orientada a Objetos)** por meio da construção de um sistema realista e bem estruturado.

A proposta foi transformar conceitos teóricos em implementação prática, utilizando um contexto próximo do mundo real: a gestão de uma academia de luta.

Com isso, o projeto buscou consolidar conhecimentos em:

- modelagem orientada a objetos;
- estruturação de classes e responsabilidades;
- organização de código em camadas;
- reutilização e manutenção;
- abstração de entidades do mundo real para software.

---

# 🧠 Conceitos de POO Aplicados

Este projeto foi desenvolvido com foco total na aplicação dos principais pilares e conceitos da **Programação Orientada a Objetos**.

## 🔹 Classes e Objetos
Todo o sistema foi estruturado com base em classes que representam entidades reais do domínio da aplicação, como alunos, professores, planos e treinos.

Cada entidade foi modelada como um objeto com:
- atributos;
- comportamentos;
- responsabilidades específicas.

---

## 🔹 Encapsulamento
Os atributos das classes foram protegidos com modificadores de acesso (`private` / `protected`) e manipulados de forma segura através de métodos getters e setters.

Essa abordagem garante:
- maior segurança;
- controle de acesso aos dados;
- integridade das informações.

---

## 🔹 Herança
A herança foi utilizada para promover reutilização de código e especialização de comportamentos entre entidades relacionadas.

Com isso, classes mais específicas herdaram características de classes mais genéricas, reduzindo redundância e melhorando a organização da aplicação.

---

## 🔹 Polimorfismo
O polimorfismo foi aplicado para permitir comportamentos diferentes a partir de uma mesma estrutura base, tornando o sistema mais flexível e extensível.

Esse conceito possibilita:
- sobrescrita de métodos;
- especialização de comportamentos;
- maior escalabilidade do código.

---

## 🔹 Abstração
A abstração foi utilizada para representar apenas as características essenciais de cada entidade do sistema, ocultando detalhes desnecessários e focando no que realmente importa para a lógica da aplicação.

---

## 🔹 Associação
As classes do sistema se relacionam entre si de forma lógica, representando interações reais entre entidades do domínio.

Exemplo:
- um aluno possui um plano;
- um professor ministra treinos;
- uma academia gerencia pessoas.

---

## 🔹 Agregação
A agregação foi aplicada em relacionamentos onde uma classe utiliza outra, mas ambas podem existir de forma independente.

Exemplo:
- um professor pode existir sem estar vinculado a um treino específico;
- um aluno pode existir independentemente de um plano temporário.

---

## 🔹 Composição
A composição foi utilizada em relações de dependência forte, onde um objeto depende diretamente da existência de outro.

Exemplo:
- certos componentes internos do sistema existem apenas dentro do contexto da academia.

---

# 🏗️ Estrutura do Sistema

O sistema foi organizado de forma modular e orientada a domínio, buscando manter o código limpo, legível e de fácil manutenção.

A arquitetura foi separada em responsabilidades, permitindo melhor organização das entidades e regras de negócio.

```bash
src/
 ┣ 📂 academia
 ┣ 📂 pessoa
 ┣ 📂 treino
 ┣ 📂 plano
 ┣ 📂 pagamento
 ┗ 📂 main
