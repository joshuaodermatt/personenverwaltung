package org.pw;

public class Logger {
    static String info = "[INFO] ";
    static String fxml = "[FXML] ";
    public static void personDisplaying(Person nowDisplaying) {
        System.out.println(fxml + "now displaying Person with PNr: " + nowDisplaying.getPersNr());
    }
}
