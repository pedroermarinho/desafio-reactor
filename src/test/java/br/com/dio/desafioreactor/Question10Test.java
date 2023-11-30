package br.com.dio.desafioreactor;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

public class Question10Test {

    private Question10 question10;

    @BeforeEach
    void setup(){
        question10 = new Question10();
    }


    @AfterEach
    void tearDown(){
        question10 = null;
    }

    @Test
    void testMergeAndSortDistinctWithEmptyInputs() {
        Flux<String> flux1 = Flux.empty();
        Flux<String> flux2 = Flux.empty();

        Flux<String> result = question10.mergeAndSortDistinct(flux1, flux2);

        StepVerifier.create(result)
                .expectNextCount(0)
                .verifyComplete();
    }

    @Test
    void testMergeAndSortDistinctWithNonEmptyInputs() {
        Flux<String> flux1 = Flux.just("apple", "banana", "orange");
        Flux<String> flux2 = Flux.just("orange", "grape", "banana");

        Flux<String> result = question10.mergeAndSortDistinct(flux1, flux2);

        StepVerifier.create(result)
                .expectNext("apple", "banana", "grape", "orange")
                .verifyComplete();
    }

}
