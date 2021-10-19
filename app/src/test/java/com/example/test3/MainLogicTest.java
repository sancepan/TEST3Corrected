package com.example.test3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainLogicTest {
    private MainLogic main = new MainLogic();

    @Test
    public void testWordSearch() throws Exception {
        // Проверка, получения позиции слова, учитывая, что оно есть в списке слов
        assertEquals(3, main.wordSearch("ГРОТ"));
        // Проверка на повторную проверку слова
        assertEquals(-2, main.wordSearch("ГРОТ"));
        // Проверка, получения позиции слова, учитывая, что его не присутствует в списке слов
        assertEquals(-1, main.wordSearch("вапвпа"));
        assertEquals(7 , main.wordSearch("СТОГ"));
        assertEquals(-2 , main.wordSearch("СТОГ"));
        // Одно неверное значение
        //assertEquals(-1 , main.wordSearch("ТРОСТЬ"));

    }
}
