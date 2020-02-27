package com.company.View;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CentralPanel extends Panel{

        private JLabel lab01;
        private JButton cBtn01;
        private JButton cBtn02;
        private JButton cBtn03;
        private JButton cBtn04;
        private JTextField name;
        private JTextField age;
        private JTextField weight;
        private TablePanel tablePanel;
        private ButtonEventListener listener;
        private DataTransferEventListener dataTransferEventListener;


        public CentralPanel() {


            makeBorder();

            lab01 = new JLabel("Central");
            add(lab01);

            name = new JTextField(10);
            age = new JTextField(10);
            weight = new JTextField(10);

            add(name);
            add(age);
            add(weight);

            cBtn01 = new JButton("Click");
            cBtn01.setPreferredSize(new Dimension(70,18));
            add(cBtn01);

            cBtn02 = new JButton("Clack");
            cBtn02.setPreferredSize(new Dimension(70,18));
            add(cBtn02);

            cBtn03 = new JButton("Clear");
            cBtn03.setPreferredSize(new Dimension(70,18));
            add(cBtn03);

            cBtn04 = new JButton("Submit");
            cBtn04.setPreferredSize(new Dimension(70,18));
            add(cBtn04);

            tablePanel = new TablePanel();

            add(tablePanel);

            cBtn01.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent a) {
                    ButtonEvent e = new ButtonEvent(this, "CLICK");
                        if(listener != null) {
                            listener.ClickedButtonEventOccured(e);
                        }
                }
            });

            cBtn02.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent a) {
                    ButtonEvent e = new ButtonEvent(this,"CLACK");
                        if(listener != null)
                            listener.ClackedButtonEventOccured(e);
                }
            });

            cBtn03.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent a) {
                    ButtonEvent e = new ButtonEvent(this,"CLEAR");
                    if(listener!= null)
                        listener.ClearButtonEventOccured(e);
                }
            });

            cBtn04.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent a) {
                    DataTransferEvent e = new DataTransferEvent(this, name.getText(),age.getText(),weight.getText());
                    if(dataTransferEventListener != null) {
                        dataTransferEventListener.dataSubmitted(e);
                    }
                }
            });
        }



        public void setDataTransferEventListener (DataTransferEventListener dataTransferEventListener) {
            this.dataTransferEventListener = dataTransferEventListener;
        }


        public void setButtonEventListener(ButtonEventListener listener) {
            this.listener = listener;
        }



        public void makeBorder() {
            Border innerBorder = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
            Border outerBorder = BorderFactory.createEmptyBorder(5,5,5,2);
            this.setBorder(BorderFactory.createCompoundBorder(outerBorder,innerBorder));
        }
}


