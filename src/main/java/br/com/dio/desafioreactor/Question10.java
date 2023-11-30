package br.com.dio.desafioreactor;

import reactor.core.publisher.Flux;

public class Question10 {


    /*
   Recebe dois fluxos de strings e retorna um novo fluxo com a concatenação de todas as strings,
   ordenadas em ordem alfabética, sem duplicatas
    */
    public Flux<String> mergeAndSortDistinct(Flux<String> flux1, Flux<String> flux2) {
        return flux1.mergeWith(flux2)
                .distinct()
                .sort();
    }


}
