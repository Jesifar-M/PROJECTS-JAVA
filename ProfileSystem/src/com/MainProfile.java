package com;

import profile.UserInput;
import greeting.GreetingDisplay;

public class MainProfile {

    public static void main(String[] args) {

        
        String name = UserInput.getName();

        
        GreetingDisplay.displayGreeting(name);
    }
}