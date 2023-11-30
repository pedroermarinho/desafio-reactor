package br.com.dio.desafioreactor;

import reactor.core.publisher.Flux;

public class Question4 {

    /*
    Recebe um fluxo de strings, converte cada string para maiúsculas e retorna o fluxo resultante
     */
    public Flux<String> uppercaseFlux(Flux<String> strings) {
        return strings.map(String::toUpperCase);
    }

}
