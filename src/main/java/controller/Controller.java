package controller;

import model.Model;
import view.StringConstants;
import view.View;
import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }
    public void processUser() {
        Scanner sc = new Scanner(System.in);
        String userInput = inputHandler(sc);
        if (!model.compareInput(userInput)) processUser();

    }
    String inputHandler(Scanner sc){
        view.printMessage(StringConstants.INPUT_INVITATION);
        return sc.nextLine();
    }
}
