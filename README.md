# Gerenciamento de Memória e Recursividade

Repositório do trabalho avaliativo da disciplina **Estruturas de Dados 2** do **Centro Universitário de João Pessoa (Unipê)**, ministrada pelo **Prof. Edkallenn (Ed)**[cite: 1].

---

## 👥 Integrantes da Dupla

* **Adryan Sousa**[cite: 7]
* **Matheus Nunes**[cite: 7]

---

## 🎥 Vídeo Explicativo

* **Tema escolhido:** Tema 2 — Gerenciamento de Memória e Recursividade (pilha de chamadas / *call stack*, *heap* vs. *stack*, casos base e recursão)[cite: 1].
* **Link do vídeo:** `COLE_AQUI_O_LINK_DO_VIDEO`[cite: 3]

---

## 🧠 Sobre o Tema

O projeto aborda como a memória RAM é organizada durante a execução de funções recursivas em **Java**, destacando:

* **Gerenciamento de Memória:** como o ambiente de execução organiza e gerencia espaços de memória durante o programa[cite: 1, 8].
* **Stack vs. Heap:** diferença entre a **Stack** (pilha de execução no modelo *LIFO* — *Last In, First Out*, onde ficam chamadas de funções e variáveis locais) e a **Heap** (área de memória dinâmica)[cite: 1, 9].
* **Call Stack, Caso Base e Recursividade:** como cada chamada recursiva empilha um novo contexto de execução até atingir o **caso base** (condição de parada) que evita recursão infinita / *StackOverflowError* e inicia o retorno desempilhando os resultados[cite: 1].

---

## 📂 Estrutura do Repositório

* `RecursividadeDemo.java` *(ou ajuste para o nome exato do seu arquivo `.java`)* — implementação comentada do cálculo recursivo de fatorial com logs para acompanhar o empilhamento, caso base e desempilhamento[cite: 3].
* `README.md` — documentação do projeto e instruções de uso[cite: 3].

---

## 🚀 Como Compilar e Executar

### Pré-requisitos
* **JDK (Java Development Kit)** instalado na máquina (`java` e `javac` disponíveis no terminal) ou uma IDE como o **IntelliJ IDEA**.

### Pelo Terminal

1. Acesse a pasta onde está o arquivo `.java`:
   ```bash
   cd caminho/para/o/projeto
