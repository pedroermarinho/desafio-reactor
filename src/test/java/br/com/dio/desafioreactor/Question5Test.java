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

public class Question5Test {

    private Question5 question5;

    @BeforeEach
    void setup(){
        question5 = new Question5();
    }

    @Test
    void testFilterEvenNumbers() {
        Flux<Integer> input = Flux.range(1, 10);
        Flux<Integer> result = question5.filterEvenNumbers(input);

        StepVerifier.create(result)
                .expectNext(2, 4, 6, 8, 10)
                .verifyComplete();
    }

    @Test
    void testFilterEvenNumbersWithEmptyInput() {
        Flux<Integer> input = Flux.empty();
        Flux<Integer> result = question5.filterEvenNumbers(input);

        StepVerifier.create(result)
                .expectNextCount(0)
                .verifyComplete();
    }

    @Test
    void testFilterEvenNumbersWithAllOddNumbers() {
        Flux<Integer> input = Flux.just(1, 3, 5, 7, 9);
        Flux<Integer> result = question5.filterEvenNumbers(input);

        StepVerifier.create(result)
                .expectNextCount(0)
                .verifyComplete();
    }

    @Test
    void testFilterEvenNumbersWithMixedNumbers() {
        Flux<Integer> input = Flux.just(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Flux<Integer> result = question5.filterEvenNumbers(input);

        StepVerifier.create(result)
                .expectNext(2, 4, 6, 8)
                .verifyComplete();
    }

    @AfterEach
    void tearDown(){
        question5 = null;
    }

}
