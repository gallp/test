package com.company.View;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import java.awt.*;

public class EastPanel extends Panel {
        private JTextPane textPane;
        private JLabel lab01;
        private JTextArea textArea;
        private TablePanel tablePanel;

        public EastPanel() {
        super();
        setPreferredSize(new Dimension(400,1));
        makeBorder();
        setLayout(new GridLayout(4,1,5,5));
        textPane = new JTextPane();
        textPane.setMaximumSize(new Dimension(400,60));
        textPane.setPreferredSize(new Dimension(1,50));
        add(textPane);

        textArea = new JTextArea();
        add(new JScrollPane(textArea));
        lab01 = new JLabel("counter 0");
        add(lab01);
        tablePanel = new TablePanel();
        add(new JScrollPane(tablePanel));

     }



    public void addText(String str) {
        textPane.setText(str);
        String str1 = str;
        System.out.println(str1);

        if(str.equals("CLICK"))
            textPane.setBackground(new Color(130,90,90));
        else if(str.equals("CLACK"))
            textPane.setBackground(new Color(90,90,100));
    }

    public void appendText(String str) {
        textArea.append(str+"\n");
    }

    public void clearTextArea() {
        textArea.setText(null);
    }

    public void makeBorder() {
        Border innerBorder = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
        Border outerBorder = BorderFactory.createEmptyBorder(5,2,5,5);
        this.setBorder(BorderFactory.createCompoundBorder(outerBorder,innerBorder));
    }

    public  void setLab01Text(String str) {
            lab01.setText(str);
    }

    public TablePanel getTablePanel() {
        return tablePanel;
    }
}


