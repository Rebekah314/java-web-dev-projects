package org.launchcode;

//no main method, so this can't run on its own! Code will be called elsewhere in order to execute
public class Message {

    public static String getMessage(String lang) {

        if (lang.equals("sp")) {
            return "¡Hola, Mundo!";
        } else if (lang.equals("fr")) {
            return "Bonjour, le monde!";
        } else  if (lang.equals("it")) {
            return "Ciao, mondo!";
        } else    {
                return "Hello, World!";
        }
    }
}
