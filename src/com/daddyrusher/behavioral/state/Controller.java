package com.daddyrusher.behavioral.state;

public class Controller {
    private static Connection connection;
    public static Accounting accounting;
    public static Sales sales;
    public static Management management;

    public Controller() {
        accounting = new Accounting();
        sales = new Sales();
        management = new Management();
    }

    public void setAccounting() {
        connection = accounting;
    }

    public void setSales() {
        connection = sales;
    }

    public void setManagement() {
        connection = management;
    }

    public void open() {
        connection.open();
    }
    public void close() {
        connection.close();
    }
    public void log() {
        connection.log();
    }
    public void update() {
        connection.update();
    }
}
