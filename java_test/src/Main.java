public class Main {
    // Declaração de Variavéis

    public static void main(String[] args) {
        // Declaração de Variavéis
        int idade = 18;

        String nome = "mario";

        // se utilizar o var sem tipat, o java irá inferir o tipo da variável
        var nomeCompleto = "mario silva";

        // Em Java, existem 8 tipos primitivos que representam valores básicos e não são objetos:
        // Numeros inteiros
        // 1. byte  - Um número inteiro de 8 bits. Ele pode armazenar valores no intervalo de -128 até 127.
        // 2. short - Um número inteiro de 16 bits. Ele pode armazenar valores no intervalo de -32.768 até 32.767.
        // 3. int   - Um número inteiro de 32 bits. Ele pode armazenar valores no intervalo de -2.147.483.648 até 2.147.483.647.
        // 4. long  - Um número inteiro de 64 bits. Ele pode armazenar valores no intervalo de -9.223.372.036.854.775.808 até 9.223.372.036.854.775.807.
        // numeros decimais
        // 5. float - Um número de ponto flutuante de 32 bits que pode representar valores decimais com precisão menor. Exemplo: 3.14f.
        // 6. double - Um número de ponto flutuante de 64 bits que pode representar valores decimais com maior precisão. Exemplo: 3.14159265359.
        // textos
        // 7. char  - Um caractere Unicode de 16 bits que pode representar um único caractere, como 'A' ou um valor Unicode como '\u0041'. 
        // no char e utilizado aspas simples e nao duplas
        // char sexo = 'M';
        // 8. String - Representa palavras e frases é utilizada aspas duplas
        // boleanos - Representas os valores booleanos ou verdadeiro ou falso
        // 8. boolean - Um tipo lógico que pode representar apenas dois valores: verdadeiro (true) ou falso (false).

        // exemplos
        byte b = 100;
        short s = 10000;
        int i = 1000000000;
        long l = 1000000000000000000L; // sempre utilizamos o L no final do long
        float f = 3.14f;  // sempre utilizamos o f no final do float
        double d = 3.14159265359;
        char c = 'A';  // sempre com aspas simples
        String str = "mario";  // sempre com aspas duplas
        boolean b1 = true;
        boolean b2 = false;

        // tipos de dados referência
    }

}
