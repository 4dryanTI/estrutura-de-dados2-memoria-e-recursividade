# Gerenciamento de Memória e Recursividade

Repositório do trabalho avaliativo da disciplina **Estruturas de Dados 2** do **Centro Universitário de João Pessoa (Unipê)**, ministrada pelo **Prof. Edkallen Silva**.

---

## 👥 Integrantes da Dupla

* **Adryan Sousa**
* **Matheus Nunes**

---

## 🎥 Vídeo Explicativo

* **Tema escolhido:** Tema 2 — Gerenciamento de Memória e Recursividade (pilha de chamadas / *call stack*, *heap* vs. *stack*, casos base e recursão).
* **Link do vídeo:** https://www.youtube.com/watch?v=7rjTm0d6FOU

---

## 🧠 Sobre o Tema

O projeto aborda como a memória RAM é organizada durante a execução de funções recursivas em **Java**, destacando:

* **Gerenciamento de Memória:** como o ambiente de execução organiza e gerencia espaços de memória durante o programa.
* **Stack vs. Heap:** diferença entre a **Stack** (pilha de execução no modelo *LIFO* — *Last In, First Out*, onde ficam chamadas de funções e variáveis locais) e a **Heap** (área de memória dinâmica).
* **Call Stack, Caso Base e Recursividade:** como cada chamada recursiva empilha um novo contexto de execução até atingir o **caso base** (condição de parada) que evita recursão infinita / *StackOverflowError* e inicia o retorno desempilhando os resultados.

---

## 📂 Estrutura do Repositório

* `RecursividadeDemo.java` *(ou ajuste para o nome exato do seu arquivo `.java`)* — implementação comentada do cálculo recursivo de fatorial com logs para acompanhar o empilhamento, caso base e desempilhamento.
* `README.md` — documentação do projeto e instruções de uso.

---

## 🚀 Como Compilar e Executar

### Pré-requisitos
* **JDK (Java Development Kit)** instalado na máquina (`java` e `javac` disponíveis no terminal) ou uma IDE como o **IntelliJ IDEA**.

### Pelo Terminal

1. Acesse a pasta onde está o arquivo `.java`:
   `cd caminho/para/o/projeto`

2. Compile o código-fonte:
   `javac RecursividadeDemo.java`

3. Execute a classe principal:
   `java RecursividadeDemo`

### Pelo IntelliJ IDEA
1. Abra o projeto no **IntelliJ IDEA**.

2. Localize o arquivo `RecursividadeDemo.java`.

3. Clique no ícone verde de **Run** ao lado do método `main` (ou use `Shift + F10`).

### Pelo VS Code
1. Abra a pasta do projeto no **VS Code** (com o **Extension Pack for Java** instalado).

2. Abra o arquivo `RecursividadeDemo.java`.

3. Clique no botão **Run Java** (ícone de *play* no canto superior direito ou acima do método `main`) ou use `Ctrl + F5` / `F5`.
