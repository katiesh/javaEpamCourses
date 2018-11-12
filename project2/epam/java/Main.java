package epam.java;

import epam.java.controller.Controller;
import epam.java.model.Model;
import epam.java.view.View;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
       try {
           new Controller().run();
       }catch (IOException e){
           System.out.println(e.getMessage());
       }
    }
}
