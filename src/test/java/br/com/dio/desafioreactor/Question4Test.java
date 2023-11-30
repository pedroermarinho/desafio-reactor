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

public class Question4Test {

    private Question4 question4;

    @BeforeEach
    void setup(){
        question4 = new Question4();
    }

    // Teste para Question4
    @Test
    void testUppercaseFlux() {
        Flux<String> input = Flux.just("apple", "banana", "orange");
        Flux<String> result = question4.uppercaseFlux(input);

        StepVerifier.create(result)
                .expectNext("APPLE", "BANANA", "ORANGE")
                .verifyComplete();
    }

    @Test
    void testUppercaseFluxWithEmptyInput() {
        Flux<String> input = Flux.empty();
        Flux<String> result = question4.uppercaseFlux(input);

        StepVerifier.create(result)
                .expectNextCount(0)
                .verifyComplete();
    }

    @Test
    void testUppercaseFluxWithOneElement() {
        Flux<String> input = Flux.just("hello");
        Flux<String> result = question4.uppercaseFlux(input);

        StepVerifier.create(result)
                .expectNext("HELLO")
                .verifyComplete();
    }

    @Test
    void testUppercaseFluxWithMultipleElements() {
        Flux<String> input = Flux.just("apple", "banana", "orange");
        Flux<String> result = question4.uppercaseFlux(input);

        StepVerifier.create(result)
                .expectNext("APPLE", "BANANA", "ORANGE")
                .verifyComplete();
    }

    @AfterEach
    void tearDown(){
        question4 = null;
    }

}
