public class RecursividadeDemo {

    public static void main(String[] args) {
        System.out.println("=== INÍCIO DA EXECUÇÃO: CALL STACK EM AÇÃO ===");

        int numero = 4;
        int resultado = calcularFatorial(numero);

        System.out.println("O fatorial de " + numero + " é: " + resultado);
        System.out.println("=== FIM DA EXECUÇÃO ===");
    }

    /**
     * Função recursiva para calcular o fatorial.
     * Demonstra claramente o Caso Base e a Pilha de Chamadas (Stack).
     */
    public static int calcularFatorial(int n) {
        // Exibe o nível atual da pilha de chamadas na memória (Stack Frame)
        System.out.println("-> Entrando em calcularFatorial(" + n + ")");

        // 1. CASO BASE (O "freio" para evitar estouro de pilha / StackOverflow)
        if (n == 0 || n == 1) {
            System.out.println("   [CASO BASE ATINGIDO] Retornando 1 para n = " + n);
            return 1;
        }

        // 2. CHAMADA RECURSIVA (Empilhando novas instâncias na Stack)
        int resultadoParcial = n * calcularFatorial(n - 1);

        System.out.println("<- Retornando da pilha: fatorial(" + n + ") = " + resultadoParcial);
        return resultadoParcial;
    }
}