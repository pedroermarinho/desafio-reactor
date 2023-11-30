package br.com.dio.desafioreactor;

import reactor.core.publisher.Mono;

public class Question8 {


    /*
    Recebe um Mono de um número e retorna um Mono com o resultado do dobro do número fornecido
     */
    public Mono<Integer> doubleMonoValue(Mono<Integer> mono) {
        return mono.map(item -> item * 2)
                .switchIfEmpty(Mono.error(new IllegalArgumentException("No value")));
    }

}
