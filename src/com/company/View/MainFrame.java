package com.company.View;

import javax.sql.rowset.JdbcRowSet;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

    private CentralPanel centerPanel;
    private EastPanel eastPanel;
    private MenuB menuBar;

    public MainFrame(String title) throws HeadlessException {
        super(title);
        setLayout(new BorderLayout());
        setSize(640,480);
        setResizable(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);


        menuBar = new MenuB();
        centerPanel = new CentralPanel();
        eastPanel = new EastPanel();

        setMenuBar(menuBar);
        add(centerPanel, BorderLayout.CENTER);
        add(eastPanel, BorderLayout.EAST);

        menuBar.setMenuItemActionListener(new MenuItemActionListener() {
            @Override
            public void importTriggered(MenuBEvent event) {

            }

            @Override
            public void exportTriggered(MenuBEvent _event) {

            }
        });

        centerPanel.setButtonEventListener(new ButtonEventListener() {
            @Override
            public void ClickedButtonEventOccured(ButtonEvent _event) {
                eastPanel.addText(_event.getEvent());
                eastPanel.appendText(_event.getEvent());
                eastPanel.setLab01Text("counter " + Integer.toString(_event.getCounter()));
            }

            @Override
            public void ClackedButtonEventOccured(ButtonEvent _event) {
                eastPanel.addText(_event.getEvent());
                eastPanel.appendText(_event.getEvent());
                eastPanel.setLab01Text("counter " + Integer.toString(_event.getCounter()));
            }

            @Override
            public void ClearButtonEventOccured(ButtonEvent _event) {
                eastPanel.clearTextArea();
                eastPanel.setLab01Text("counter 0");
            }
        });




    }

        public MenuB getMenuB () {
            return menuBar;
        }

        public CentralPanel getCenterPanel() {
        return centerPanel;
    }

        public EastPanel getEastPanel() {
        return eastPanel;
     }


    public void setErrorMessage(String message) {

           JOptionPane.showMessageDialog(this,"Invalid Format",
                   "Warning", JOptionPane.ERROR_MESSAGE);

        }
}


