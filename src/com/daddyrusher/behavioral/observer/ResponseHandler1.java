package com.daddyrusher.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class ResponseHandler1 implements Observer {
    private String response;
    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof String) {
            response = (String) arg;
            System.out.println("\nReceived Response: "+ response);
        }
    }
}
