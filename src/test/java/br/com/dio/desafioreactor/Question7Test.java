package br.com.dio.desafioreactor;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Question7Test {

    private Question7 question7;

    @BeforeEach
    void setup(){
        question7 = new Question7();
    }

    @Test
    void testConcatenateAndTransformToLowerCaseWithEmptyInputs() {
        Flux<String> flux1 = Flux.empty();
        Flux<String> flux2 = Flux.empty();

        Flux<String> result = question7.concatenateAndTransformToLowerCase(flux1, flux2);

        StepVerifier.create(result)
                .expectNextCount(0)
                .verifyComplete();
    }

    @Test
    void testConcatenateAndTransformToLowerCaseWithNonEmptyInputs() {
        Flux<String> flux1 = Flux.just("Hello", "World");
        Flux<String> flux2 = Flux.just("Reactor", "Java");

        Flux<String> result = question7.concatenateAndTransformToLowerCase(flux1, flux2);

        StepVerifier.create(result)
                .expectNext("hello", "world", "reactor", "java")
                .verifyComplete();
    }

    @AfterEach
    void tearDown(){
        question7 = null;
    }

}
