package com.company.View;

import javafx.stage.FileChooser;

import javax.swing.*;
import java.io.File;

public class MenuBEvent extends Event {


    private static JFileChooser fc;

    public MenuBEvent(Object source) {
        super(source);
        fc = new JFileChooser();
    }

    public JFileChooser getFc() {
        return fc;
    }
}
