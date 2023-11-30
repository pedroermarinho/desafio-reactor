package br.com.dio.desafioreactor;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Question8Test {

    private Question8 question8;

    @BeforeEach
    void setup(){
        question8 = new Question8();
    }

    @Test
    void testDoubleMonoValueWithNullInput() {
        Mono<Integer> input = Mono.empty();

        Mono<Integer> result = question8.doubleMonoValue(input);

        StepVerifier.create(result)
                .expectErrorMessage("No value")
                .verify();
    }

    @Test
    void testDoubleMonoValueWithNonEmptyInput() {
        Mono<Integer> input = Mono.just(5);

        Mono<Integer> result = question8.doubleMonoValue(input);

        StepVerifier.create(result)
                .expectNext(10)
                .verifyComplete();
    }
    @AfterEach
    void tearDown(){
        question8 = null;
    }

}
