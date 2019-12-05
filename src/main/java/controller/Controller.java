package controller;

import model.Model;
import view.StringConstants;
import view.View;
import static view.StringConstants.*;
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

    /**
     *
     * @param sc
     * @return String
     */
    String inputHandler(Scanner sc){
        view.printBundle(INPUT_INVITATION);
        return sc.nextLine();
    }
}
