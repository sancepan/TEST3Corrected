package com.example.test3;

public class ScoreLogic {
    private int score = 0;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // Приьваление очков по величине слова
    public void plusScore(String word){
        int newScore = word.length();
        setScore(getScore() + newScore);
    }

}
