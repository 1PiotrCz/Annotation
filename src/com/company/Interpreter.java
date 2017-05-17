package com.company;

import java.lang.reflect.Method;

/**
 * Created by Piotr Czubkowski on 2017-05-17.
 */
public class Interpreter {
    public static void main(String[] args) {
        Interpreter interpreter = new Interpreter();
        interpreter.runUsingInternet();
    }


    public void runUsingInternet() {
        Player player = new Player();

        Method[] methods = player.getClass().getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(UsingInternet.class)) {

                UsingInternet usingInternetAnn = method.getAnnotation(UsingInternet.class);

                System.out.println("Metoda " + method.getName() + "korzysta z internetu (" + usingInternetAnn.internetGetway() + ")");
            }
        }
    }
}

