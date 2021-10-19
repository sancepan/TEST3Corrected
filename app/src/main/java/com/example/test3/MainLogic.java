package com.example.test3;

public class MainLogic {
    // Все слова
    String[] words = new String[]{
            "ГОРСТЬ", "ТРОСТЬ", "ГОСТЬ", "ГРОТ", "ОСОТ", "РОСТ",
            "СОРТ", "СТОГ", "ТОРГ", "ТОРС", "ТОРТ", "ТОСТ",
            "ТРОС", "ГОТ", "ОГР", "ОСЬ", "РОГ", "РОТ",
            "СОР"
    };

    // Отметка отгаданных слов
    int[]  marks = new int[]{
            0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0,
            0
    };

    // Проверка наличия введеного слова
    public int wordSearch(String word) {
        for(int i = 0; i < words.length; i++){
            if(words[i].equals(word)){
                if (marks[i] == 0) {
                    marks[i] = 1;
                    return i;
                }else{
                    return -2;
                }
            }
        }
        return -1;
    }

}
