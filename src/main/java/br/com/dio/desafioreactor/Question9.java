package br.com.dio.desafioreactor;

import reactor.core.publisher.Flux;

public class Question9 {


    /*
    Recebe um fluxo de números inteiros e retorna um novo fluxo contendo a raiz quadrada
    apenas dos números pares presentes no fluxo original
     */
    public Flux<Double> squareRootOfEvenNumbers(Flux<Integer> numbers) {
        return numbers
                .filter(item -> item % 2 == 0)
                .map(Math::sqrt);
    }

}
