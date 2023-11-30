package br.com.dio.desafioreactor;

import reactor.core.publisher.Flux;

public class Question5 {

    /*
   Recebe um fluxo de inteiros e retorna um fluxo apenas com os números pares
    */
    public Flux<Integer> filterEvenNumbers(Flux<Integer> numbers) {
        return numbers.filter(n -> n % 2 == 0);
    }

}
