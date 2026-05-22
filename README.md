# Livro de Receitas Digital (Senai_LLP_File_LivroDeReceitas)

Este é um programa em **Java** desenvolvido para a atividade prática de Lógica de Programação do SENAI. A aplicação interage com o usuário através do terminal para coletar as informações de uma receita (Nome, Ingredientes e Modo de Preparo) e exporta o resultado estruturado em um arquivo de texto (`.txt`) gerado automaticamente.

##  Funcionalidades

- **Captura Dinâmica:** Solicita o nome da receita, aceitando nomes compostos.
- **Listagem de Ingredientes:** Coleta os ingredientes um a um, permitindo indicar a descrição e a quantidade na mesma linha.
- **Modo de Preparo Enumerado:** Organiza as instruções passo a passo, gerando automaticamente os prefixos numéricos (`Passo 1:`, `Passo 2:`, etc.).
- **Condição de Parada:** O usuário pode digitar `fim` ou deixar a linha em branco para encerrar as listas.
- **Persistência em Arquivo:** Grava as informações formatadas em um arquivo `.txt` nomeado dinamicamente com o próprio título da receita.

##  Requisitos da Atividade (SENAI)

O algoritmo foi implementado para cumprir as seguintes regras de negócio:
1. Receber o nome da receita (Ex: Bolo de Laranja).
2. Receber os ingredientes até que o usuário não informe mais nenhuma descrição.
3. Receber as instruções com passo a passo enumerado até o usuário terminar.
4. Salvar em um arquivo com o nome da receita contendo:
   - 1ª linha: Nome da receita.
   - Pula uma linha.
   - Ingredientes numerados.
   - Pula uma linha.
   - Instruções do modo de preparo.


##  Tecnologias Utilizadas

- **Linguagem:** Java
- **Manipulação de Input:** `java.util.Scanner`
- **Estrutura de Dados:** `java.util.ArrayList`
- **Escrita de Arquivos:** `java.io.PrintWriter`

## Como Executar o Projeto

1. Certifique-se de ter o Java instalado na máquina.
2. Clone este repositório:
   ```bash
   git clone [https://github.com/gabrielgiani21-bit/Senai_LLP_File_LivroDeReceitas.git](https://github.com/gabrielgiani21-bit/Senai_LLP_File_LivroDeReceitas.git)
