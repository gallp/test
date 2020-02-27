package com.company.View;

import java.util.EventObject;

public class ButtonEvent extends Event {


    private static int counter = 0;
    private String event;

    public ButtonEvent(Object source, String event) {
        super(source);
        this.event = event;
        if(event.equals("CLEAR"))
            counter = 0;
        else
            counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public String getEvent() {
        return event;
    }

}
