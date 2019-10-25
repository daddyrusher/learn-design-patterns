package com.daddyrusher.behavioral.state;

public class StatePatternDemo {
    Controller controller;
    StatePatternDemo(String connection) {
        controller = new Controller();
        if (connection.equalsIgnoreCase("management")) {
            controller.setManagement();
        }
        if (connection.equalsIgnoreCase("sales")) {
            controller.setSales();
        }
        if (connection.equalsIgnoreCase("accounting")) {
            controller.setAccounting();
        }
        controller.open();
        controller.log();
        controller.close();
        controller.update();
    }

    public static void main(String[] args) {
        new StatePatternDemo(args[0]);
    }
}
