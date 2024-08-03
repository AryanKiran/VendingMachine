package ui;

import java.util.Scanner;

public class UserInterface {
    private String currentDisplay;

    public void showOptions() {
        currentDisplay = "1. Coffee - $1.50\n2. Tea - $1.00\n3. Hot Chocolate - $2.00";
        System.out.println(currentDisplay);
    }

    public String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}

