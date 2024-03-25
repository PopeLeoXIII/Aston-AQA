package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    @DisplayName("Tест факториала 5")
    void factorialFiveAssertTrueTest() {
        long factFive = App.factorial(5);
        assertEquals(120, factFive);
    }

    @Test
    @DisplayName("Tест на неверный факториал 5")
    void factorialFiveAssertFalseTest() {
        long factFive = App.factorial(5);
        assertNotEquals(121, factFive);
    }

    @ParameterizedTest
    @DisplayName("Параметризованный тест факториала (только для значения факториала)")
    @ValueSource(longs = {1, 2, 6, 24, 120, 6402373705728000L})
    public void isFactorial_ParameterizedTest(long number){
        assertTrue(number > 0); // факториал всегда положительный

        long i = 1, fact = App.factorial(i); // показатель и значение факториала
        while(fact < number){ // пока факториал меньше чем число из тестовых данных
            i++; // увеличиваем показатель
            fact = App.factorial(i); // находим для него значение факториала
        }

        // fact >= number, если равен, то число соответствует i!
        Assertions.assertEquals(fact, number);
    }

    @ParameterizedTest
    @DisplayName("Параметризованный тест факториала (для пар показателя и значения факториала)")
    @CsvSource({"1, 1", "2, 2", "3, 6", "4, 24", "5, 120", "18, 6402373705728000"})
    public void isFactorial_Csv_ParameterizedTest(long number, long fact){
        assertEquals(fact, App.factorial(number));
    }
}
