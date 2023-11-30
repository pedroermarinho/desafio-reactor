package br.com.dio.desafioreactor;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

public class Question9Test {

    private Question9 question9;

    @BeforeEach
    void setup(){
        question9 = new Question9();
    }

    @AfterEach
    void tearDown(){
        question9 = null;
    }

    @Test
    void testSquareRootOfEvenNumbersWithEmptyInput() {
        Flux<Integer> input = Flux.empty();

        Flux<Double> result = question9.squareRootOfEvenNumbers(input);

        StepVerifier.create(result)
                .expectNextCount(0)
                .verifyComplete();
    }

    @Test
    void testSquareRootOfEvenNumbersWithMixedNumbers() {
        Flux<Integer> input = Flux.just(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Flux<Double> result = question9.squareRootOfEvenNumbers(input);

        StepVerifier.create(result)
                .expectNext(Math.sqrt(2), Math.sqrt(4), Math.sqrt(6), Math.sqrt(8), Math.sqrt(10))
                .verifyComplete();
    }

}
