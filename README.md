# **Manual de Funcionamento – Simulação de Evacuação com Threads**

## 1. Objetivo do Projeto

Este software simula a evacuação de um ambiente (representado por uma matriz) por um determinado número de pessoas. A simulação é dividida em duas fases: na primeira, as pessoas se movem de forma aleatória por um tempo pré-determinado. Na segunda, após o tempo se esgotar, elas devem encontrar a porta de saída mais próxima e evacuar o local.

O projeto foi desenvolvido para demonstrar o uso de programação concorrente, onde cada pessoa é uma `thread` independente, e o acesso ao ambiente compartilhado é controlado para evitar conflitos.

## 2. Tecnologias Utilizadas

- **Linguagem:** Java
- **Bibliotecas Principais:** `java.util.concurrent` para o gerenciamento de threads (especificamente a classe `CompletableFuture`).

## 3. Estrutura dos Arquivos

O projeto é composto pelos seguintes arquivos-fonte:

- `Main.java`: Ponto de entrada do programa. Responsável por coletar os parâmetros do usuário e iniciar a simulação.
- `Ambiente.java`: Classe principal que contém a lógica da simulação, o mapa, o controle das fases e o gerenciamento das threads.
- `Pessoa.java`: Classe que modela uma pessoa, armazenando seu nome (ID), sua posição atual e seu estado (se já saiu ou não).
- `Porta.java`: Classe que modela uma porta de saída, armazenando seu nome (ID) e sua posição.

## 4. Como Compilar e Executar

Para compilar e executar o projeto, é necessário ter o **Java Development Kit (JDK)** instalado e configurado no sistema.

**Passo a passo:**

1. Salve todos os arquivos (`Main.java`, `Ambiente.java`, `Pessoa.java`, `Porta.java`) em um mesmo diretório.
2. Abra um terminal ou prompt de comando e navegue até o diretório onde os arquivos foram salvos.
3. **Para compilar**, execute o seguinte comando. Ele irá compilar todos os arquivos `.java` e gerar os arquivos `.class` correspondentes:Bash
    
    `javac *.java`
    
4. **Para executar** o programa, utilize o comando abaixo:Bash
    
    `java Main`
    

## 5. Como Usar o Programa

Ao ser executado, o programa é interativo e solicitará ao usuário que insira os parâmetros para a simulação.

O usuário deverá fornecer os seguintes dados:

1. **Número de pessoas:** A quantidade de threads "Pessoa" que serão criadas no ambiente.
2. **Número de portas:** A quantidade de saídas que serão posicionadas nas bordas do ambiente.
3. **Tamanho do ambiente:** Um número inteiro que define a largura e a altura da matriz (Ex: `20` cria um ambiente 20x20).
4. **Tempo limite em segundos:** A duração da primeira fase (movimento aleatório).

**Exemplo de interação:**

- `-- CONFIGURAÇÃO DA SIMULAÇÃO ---
Digite o número de pessoas: 15
Digite o número de portas: 3
Digite o tamanho do ambiente (Ex: 20 para um ambiente 20x20): 20
Digite o tempo limite em segundos para o movimento aleatório: 10
--- INICIANDO A SIMULAÇÃO ---`

## 6. Saída Esperada

Após a configuração, a simulação começará e o estado do ambiente será impresso no console a cada segundo.

- `_`: Representa uma posição vazia.
- `Pi`: Representa a Pessoa `i`.
- `[i]`: Representa a Porta `i`.

O usuário observará duas fases:

1. **Fase 1:** As pessoas (`Pi`) se moverão de forma desordenada pelo mapa.
2. **Fase 2:** Após a mensagem `"Tempo acabou, saindo da sala."`, as pessoas começarão a se mover de forma ordenada em direção à porta mais próxima. Quando uma pessoa sai, uma mensagem de confirmação é exibida (ex: `"P5 saiu da sala pela porta [1]"`) e ela desaparece do mapa.

A simulação termina quando todas as pessoas tiverem saído do ambiente.

---

**Autor:** Ana Clara Camargos Lima e Pedro Silva Cunha
