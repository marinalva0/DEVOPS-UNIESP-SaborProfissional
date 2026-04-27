# 🚀 Desafio DevOps: O Pipeline Inquebrável (Edição Java + SOLID)

## 📌 Contexto
Este projeto inicia como uma aplicação **Go** mal estruturada, com bugs e sem testes adequados. Sua missão é transformar este "legado" em uma solução profissional seguindo os mais altos padrões de engenharia de software.

---

## 👥 Integrantes
- Ariel
- Marinalva
- Luana
- Felipe

---

## 🎯 O Grande Desafio
O objetivo é realizar a migração e implementação completa do pipeline de CI/CD, garantindo que o código só chegue à produção após passar por todas as etapas de qualidade e segurança.

---

## 🧠 Regras do Projeto

### 1. Reescrita para Java
- Linguagem: Java (sugestão: Spring Boot)
- Arquitetura: Hexagonal (Ports & Adapters)
- Princípios: SOLID

---

### 2. Desenvolvimento com TDD
- Corrigir bugs existentes (ex: função `Soma`)
- Desenvolver novas funcionalidades usando TDD
- Nenhum código entra no pipeline sem testes passando

---

### 3. Pipeline de CI/CD (GitHub Actions)

O pipeline deve conter:

#### 🔹 Commit (CI)
- Build da imagem Docker
- Execução de testes unitários

#### 🔹 Homologação (Staging)
- Uso de imagem imutável (sem rebuild)
- Execução automática de migrations (Flyway/Liquibase)
- Ambiente de testes de aceitação

#### 🔹 Produção
- Deploy da mesma imagem validada
- Smoke Test no endpoint `/health` (HTTP 200 obrigatório)

---

## 📊 Critérios de Avaliação

---

## ⚠️ Resiliência
O professor pode inserir commits quebrados propositalmente. O time deve:
- identificar o erro no pipeline
- corrigir rapidamente (hotfix)
- restaurar o fluxo de entrega

---

> "A qualidade não é um ato, é um hábito."
4. Implementar arquitetura hexagonal
5. Criar pipeline em `.github/workflows/pipeline.yml`
| Item | Descrição | Peso |

3. Migrar estrutura para Java

1. Explorar o código atual (Go)
2. Identificar problemas e bugs
---

## 🛠️ Como começar
| :--- | :--- | :--- |
| Pipeline & Resiliência | Correção de falhas e commits do professor | 20% |
| Smoke Test | Validação da aplicação em produção | 10% |
| SOLID & TDD | Boas práticas e testes | 20% |
| Imutabilidade | Sem rebuild de imagem | 15% |
| Automação de DB | Migrations automatizadas | 15% 
