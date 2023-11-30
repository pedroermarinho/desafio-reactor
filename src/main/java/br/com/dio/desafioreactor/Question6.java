package br.com.dio.desafioreactor;

import reactor.core.publisher.Flux;

public class Question6 {

    /*
  Recebe dois fluxos de strings e os combina em um único fluxo ordenado em ordem alfabética
   */
    public Flux<String> mergeAndSort(Flux<String> flux1, Flux<String> flux2) {
        return flux1.mergeWith(flux2).sort();
    }


}
