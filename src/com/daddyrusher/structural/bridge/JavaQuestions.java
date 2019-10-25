package com.daddyrusher.structural.bridge;

import java.util.ArrayList;
import java.util.List;

public class JavaQuestions implements Question {
    private List<String> questions = new ArrayList<>();
    private int current = 0;

    public JavaQuestions() {
        questions.add("What is class?");
        questions.add("What is interface?");
        questions.add("What is abstraction?");
        questions.add("How multiple polymorphism is achieved in Java?");
        questions.add("How many types of exception handling are there in Java?");
        questions.add("Define the keyword final for variable, method and class in Java?");
        questions.add("What is abstract class?");
        questions.add("What is multithreading?");
    }

    @Override
    public void nextQuestion() {
        if (current <= questions.size()) {
            current++;
            System.out.println(current);
        }
    }

    @Override
    public void previousQuestion() {
        if (current > 0) current--;
    }

    @Override
    public void newQuestion(String question) {
        questions.add(question);
    }

    @Override
    public void deleteQuestion(String question) {
        questions.remove(question);
    }

    @Override
    public void displayQuestion() {
        System.out.println(questions.get(current));
    }

    @Override
    public void displayAllQuestion() {
        questions.forEach(System.out::println);
    }
}
