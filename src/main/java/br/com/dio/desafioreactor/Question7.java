package br.com.dio.desafioreactor;

import reactor.core.publisher.Flux;

public class Question7 {


    /*
    Recebe dois fluxos de strings e retorna um novo fluxo que contenha a concatenação das strings de ambos,
    convertendo todas as letras para minúsculas
     */
    public Flux<String> concatenateAndTransformToLowerCase(Flux<String> flux1, Flux<String> flux2) {
        return flux1.mergeWith(flux2).map(String::toLowerCase);
    }


}
