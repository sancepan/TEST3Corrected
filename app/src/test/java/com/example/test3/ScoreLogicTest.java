package com.example.test3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScoreLogicTest {
    private ScoreLogic scoreLogic = new ScoreLogic();

    @Test
    public void testWordSearch() throws Exception {
        // Проверка на прибавление счета по количеству букв
        scoreLogic.plusScore("ГРОТ");
        assertEquals( 4, scoreLogic.getScore());
        // Проверка на суммирование баллов при отгадывании новых слов
        scoreLogic.plusScore("GHFV");
        assertEquals( 8, scoreLogic.getScore());
        scoreLogic.plusScore("1234");
        assertEquals( 12, scoreLogic.getScore());
        scoreLogic.plusScore("afgdgdfg");
        assertEquals( 20, scoreLogic.getScore());
        scoreLogic.plusScore("22");
        // Одно неверное значение
        //assertEquals( 23, scoreLogic.getScore());
    }
}

