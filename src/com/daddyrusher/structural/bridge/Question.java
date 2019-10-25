package com.daddyrusher.structural.bridge;

public interface Question {
    public void nextQuestion();
    public void previousQuestion();
    public void newQuestion(String question);
    public void deleteQuestion(String question);
    public void displayQuestion();
    public void displayAllQuestion();
}
