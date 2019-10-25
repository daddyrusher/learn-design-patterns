package com.daddyrusher.creational.singleton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SingletonMain {
    private static int count = 1;

    public static void main(String[] args) throws IOException {
        JDBCSingleton jdbc = JDBCSingleton.getInstance();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int choice;
        do {
            System.out.println("Database operations");
            System.out.println("--------------------");
            System.out.println("1. Insertion");
            System.out.println("2. View");
            System.out.println("3. Delete");
            System.out.println("4. Update");
            System.out.println("5. Exit");

            System.out.println("\n");
            System.out.println("Please enter the choice what you want to perform in the database: ");

            choice = Integer.parseInt(reader.readLine());
            switch (choice) {
                case 1: {
                    System.out.println("Enter the username you want to insert data into the database: ");
                    String username = reader.readLine();
                    System.out.println("Enter the password you want to insert data into the database: ");
                    String password = reader.readLine();

                    try {
                        int i = jdbc.insert(username, password);
                        if (i > 0) {
                            System.out.println((count++) + " Data has been inserted successfully");
                        } else {
                            System.out.println("Data hasn't been inserted");
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                break;
                case 2: {
                    System.out.println("Enter the username: ");
                    String username = reader.readLine();
                    try {
                        jdbc.view(username);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println("Enter the key to continue...");
                    System.in.read();
                }
                break;
                case 3: {
                    System.out.println("Enter the userId you want to delete: ");
                    int userId = Integer.parseInt(reader.readLine());
                    try {
                        int i = jdbc.delete(userId);
                        if (i > 0) {
                            System.out.println((count++) + " Data has been deleted successfully");
                        } else {
                            System.out.println("Data hasn't been deleted");
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                break;
                case 4: {
                    System.out.println("Enter the username you want to update: ");
                    String username = reader.readLine();
                    System.out.println("Enter the password you want to update: ");
                    String password = reader.readLine();
                    try {
                        int i = jdbc.update(username, password);
                        if (i > 0) {
                            System.out.println((count++) + " Data has been updated successfully");
                        } else {
                            System.out.println("Data hasn't been updated");
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                break;
                default:
                    return;
            }

        } while (choice != 4);

    }
}
