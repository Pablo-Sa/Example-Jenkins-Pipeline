package com.jenkinsexample.testing;

import org.junit.jupiter.api.*;

import com.jenkinsexample.testing.ClassJenkinsExample;

class ClassJenkinsExampleTest {

    public ClassJenkinsExample fB;

    @BeforeEach
    public void setUp() {
        fB = new ClassJenkinsExample();
    }

    @DisplayName("Jogo FizzBuzz com Numero = 1")
    @Test
    public void testNumber() {
        String fizzBuzz = fB.play(1);
        Assertions.assertEquals(fizzBuzz, "1");
    }

    @DisplayName("Jogo FizzBuzz com Numero = 3")
    @Test
    public void testFizz() {
        String fizzBuzz = fB.play(3);
        Assertions.assertEquals(fizzBuzz, "Fizz");
    }

    @DisplayName("Jogo FizzBuzz com Numero = 5")
    @Test
    public void testBuzz() {
        String fizzBuzz = fB.play(5);
        Assertions.assertEquals(fizzBuzz, "Buzz");
    }

    @DisplayName("Não Pode ser Zero = 0")
    @Test
    public void testZero() {

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> fB.play(0));
    }

    @AfterEach
    public void tearDown() {
        fB = null;
    }

}