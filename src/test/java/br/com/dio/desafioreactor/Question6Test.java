package br.com.dio.desafioreactor;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

import java.util.ArrayList;
import java.util.Locale;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Question6Test {

    private Question6 question6;

    @BeforeEach
    void setup(){
        question6 = new Question6();
    }

    // Teste para Question6
    @Test
    void testMergeAndSort() {
        Flux<String> flux1 = Flux.just("apple", "banana");
        Flux<String> flux2 = Flux.just("orange", "grape");

        Flux<String> result = question6.mergeAndSort(flux1, flux2);

        StepVerifier.create(result)
                .expectNext("apple", "banana", "grape", "orange")
                .verifyComplete();
    }

    @Test
    void testMergeAndSortWithEmptyInputs() {
        Flux<String> flux1 = Flux.empty();
        Flux<String> flux2 = Flux.empty();

        Flux<String> result = question6.mergeAndSort(flux1, flux2);

        StepVerifier.create(result)
                .expectNextCount(0)
                .verifyComplete();
    }

    @Test
    void testMergeAndSortWithOneInputEmpty() {
        Flux<String> flux1 = Flux.just("apple", "banana");
        Flux<String> flux2 = Flux.empty();

        Flux<String> result = question6.mergeAndSort(flux1, flux2);

        StepVerifier.create(result)
                .expectNext("apple", "banana")
                .verifyComplete();
    }

    @Test
    void testMergeAndSortWithBothInputsNonEmpty() {
        Flux<String> flux1 = Flux.just("apple", "banana");
        Flux<String> flux2 = Flux.just("orange", "grape");

        Flux<String> result = question6.mergeAndSort(flux1, flux2);

        StepVerifier.create(result)
                .expectNext("apple", "banana", "grape", "orange")
                .verifyComplete();
    }
    @AfterEach
    void tearDown(){
        question6 = null;
    }

}
