package com.company.View;

import javafx.stage.FileChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MenuB extends MenuBar {

    private MenuItem _import;
    private MenuItem _export;
    private MenuItemActionListener listener;
    private JFileChooser fc;

    public MenuB() {
        super();
        fc = new JFileChooser();

        Menu file = new Menu("File");

        _import = new MenuItem("Import");
        _export = new MenuItem("Export");

        file.add(_import);
        file.add(_export);

        add(file);

        _import.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {





            }
        });

        _export.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                fc.showSaveDialog(null);
                int choice = fc.showSaveDialog(null);
                if(choice == JFileChooser.APPROVE_OPTION) {
                    File name = fc.getSelectedFile();
                    System.out.println(name);
                }
            }
        });

    }


        public void setActionListener(MenuItemActionListener listener) {
            this.listener = listener;
    }
}
