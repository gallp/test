package com.company.Control;

import com.company.Data.Container;
import com.company.Data.Obj;
import com.company.View.*;
import javafx.stage.FileChooser;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.List;
import java.util.jar.JarOutputStream;

public class MainController {

    private MainFrame mainFrame;
    private Container container;

    public MainController() {

        mainFrame = new MainFrame("Program 002");
        container = new Container();

        mainFrame.getCenterPanel().setDataTransferEventListener(new DataTransferEventListener() {
            @Override
            public void dataSubmitted(DataTransferEvent e) {

                try {
                    String name = e.getName();
                    int age = Integer.parseInt(e.getAge());
                    double weight = Double.parseDouble(e.getWeight());
                    container.addObj(new Obj(name, age, (float) weight));
                    System.out.println(container.getCount());
                    mainFrame.getEastPanel().getTablePanel().setData(container.getLst00());
                    mainFrame.getEastPanel().getTablePanel().refresh();
                } catch (Exception ex) {
                    ex.printStackTrace();
                    mainFrame.setErrorMessage("Error");

                }
            }
        });

        mainFrame.getMenuB().setMenuItemActionListener(new MenuItemActionListener() {
            @Override
            public void importTriggered(MenuBEvent e) {
                JFileChooser fc = e.getFc();
                fc.showOpenDialog(null);
                File fileToOpen = fc.getSelectedFile();

                try {
                    FileInputStream inputStream = new FileInputStream(fileToOpen);
                    ObjectInputStream dataInput = new ObjectInputStream(inputStream);
                    try {
                        while (true) {
                            container.addObj((Obj) dataInput.readObject());

                        }
                    } catch (EOFException ex) {
                        //ex.printStackTrace();
                        mainFrame.getEastPanel().getTablePanel().setData(container.getLst00());
                        mainFrame.getEastPanel().getTablePanel().refresh();
                        System.out.println("File Ended");
                    } catch (ClassNotFoundException ex) {
                        ex.printStackTrace();
                    }
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }

                @Override
            public void exportTriggered(MenuBEvent e) {
                JFileChooser fc = e.getFc();
                fc.showSaveDialog(null);
                File fileToSave = fc.getSelectedFile();
                try {
                    FileOutputStream outputStream = new FileOutputStream(fileToSave);
                    ObjectOutputStream dataOutput = new ObjectOutputStream(outputStream);
                        for(Obj o : container.getLst00()) {
                            dataOutput.writeObject(o);
                        }
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                System.out.println(fileToSave);
            }
        });

    }

}
