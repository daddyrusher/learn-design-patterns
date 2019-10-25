package com.daddyrusher.structural.bridge;

public class Main {
    public static void main(String[] args) {
        QuestionFormat questions = new QuestionFormat("Java programming language");
        questions.question = new JavaQuestions();
        questions.delete("What is class?");
        questions.display();
        questions.newOne("What is inheritance");
        questions.newOne("How many types of inheritance are there in Java?");
        questions.displayAll();
    }
}
