package com.company.View;

import javafx.stage.FileChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

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
                MenuBEvent event = new MenuBEvent(this);
                if(listener != null) {
                    listener.importTriggered(event);
                }
            }
        });

        _export.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
              MenuBEvent event = new MenuBEvent(this);
                if(listener!=null) {
                    listener.exportTriggered(event);
                }


                /*fc.showSaveDialog(null);
                File fileToOpen = fc.getSelectedFile();
                System.out.println(fileToOpen);

                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(fileToOpen);
                    DataOutput dataOutput = new DataOutputStream(fileOutputStream);

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }*/

            }

        });

    }

        public void setMenuItemActionListener(MenuItemActionListener listener) {
            this.listener = listener;
    }
}
