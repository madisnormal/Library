package view;

import java.util.Locale;
import java.util.ResourceBundle;

public class View {

    public View(){
    }
    static String MESSAGES_BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle = ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME
                    //,new Locale("en", "US")
                    ,new Locale("ru", "RU")
            );
    public void printMessage(String message){
        System.out.println(message);
    }
    public void printBundle(String message){
        System.out.println(bundle.getString(message));
    }
}
