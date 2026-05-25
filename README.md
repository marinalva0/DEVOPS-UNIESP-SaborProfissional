# 🚀 Desafio DevOps: O Pipeline Inquebrável (Edição Java + SOLID)

![Java CI with Maven](https://github.com/marinalva0/DEVOPS-UNIESP-SaborProfissional/actions/workflows/pipeline.yml/badge.svg)

## 📌 Contexto
Este projeto é a migração de um sistema legado em **Go** para uma arquitetura profissional em **Java (Spring Boot)**. O foco é garantir a qualidade do software através de testes automatizados e um pipeline de CI/CD robusto, aplicando princípios **SOLID** e **Arquitetura Hexagonal**.

## 👥 Integrantes
- Ariel, Marinalva, Luana e Felipe

---

## 🎯 Objetivo
Transformar uma base legada em uma solução profissional, onde o código só chega à produção após passar por etapas rigorosas de validação:
1. **CI (Commit):** Build da imagem Docker e execução de testes unitários.
2. **Staging (Homologação):** Migrations automatizadas (Flyway) e testes de aceitação.
3. **Produção:** Deploy validado com *Smoke Test* (`/actuator/health` retornando HTTP 200).

---

## 📊 Conformidade com o Desafio

| Requisito | Status | Evidência |
| :--- | :---: | :--- |
| **Migração para Java** | ✅ | Estrutura Spring Boot em `src/main/java` |
| **Arquitetura Hexagonal** | ✅ | Separação em `domain`, `application` e `infra` |
| **SOLID & TDD** | ✅ | Injeção de dependência e testes unitários (JUnit) |
| **Pipeline CI/CD** | ✅ | `.github/workflows/pipeline.yml` operacional |
| **Imutabilidade** | ✅ | Imagem única validada em todos os estágios |
| **Automação de DB** | ✅ | Flyway configurado em `db/migration/` |
| **Resiliência** | ✅ | Pipeline bloqueia merges com falha de build |

---

## 🛠️ Como executar localmente
1. **Requisitos:** Java 17, Docker Desktop e Maven.
2. **Variáveis:** Configure o arquivo `.env` baseado no `.env.example`.
3. **Comando:**
   ```powershell
   docker compose up -d --build