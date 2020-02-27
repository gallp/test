package com.company.View;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private CentralPanel centerPanel;
    private EastPanel eastPanel;

    public MainFrame(String title) throws HeadlessException {
        super(title);
        setLayout(new BorderLayout());
        setSize(640,480);
        setResizable(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        centerPanel = new CentralPanel();

        add(centerPanel, BorderLayout.CENTER);
        eastPanel = new EastPanel();

        add(eastPanel, BorderLayout.EAST);

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

        };

    public CentralPanel getCenterPanel() {
        return centerPanel;
    }

     public EastPanel getEastPanel() {
        return eastPanel;
     }


}

