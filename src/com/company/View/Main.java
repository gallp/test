package com.company.View;

import com.company.Control.MainController;
import com.company.Data.Container;
import com.company.Data.Obj;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.atomic.AtomicReference;

public class Main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
               new MainController();
            }
        });

//        JPanel westPanel = new JPanel();
//        westPanel.setLayout(new GridLayout(10,1,3,3));
//
//        JPanel centerPanel = new JPanel();
//
//
//
//       JButton button1 = new JButton("Load");
//
//       JButton button2 = new JButton("Clear");
//
//       westPanel.add(button1);
//       westPanel.add(button2);
//
//
//        //button1.setVisible(true);
//     /*   Scanner in = new Scanner(System.in);
//
//        List<String> lst = new Scanner(in.nextLine()).useDelimiter(",").tokens().collect(Collectors.toList());
//
//        System.out.println(lst.get(1));*/
//
//        Obj tmp = new Obj("john",20, 65.7F);
//        Obj tmp1 = new Obj("adam",30, 89.7F);
//
//
//        com.company.Data.Container con = new Container(10);
//
//        con.putObj(0,tmp);
//        con.putObj(1,tmp1);
//
//        String collumn[] = {"NAME","AGE","WEIGHT"};
//        String data[][] = new String[10][3];
//
//
//        AtomicReference<JTable> fc = new AtomicReference<>(new JTable(data, collumn));
//        centerPanel.add(fc.get());
//
//        button1.addActionListener((actionEvent) -> {
//            for(int i=0; i<con.getCapacity(); i++){
//                data[i][0] = con.getObjs()[i].getName();
//                data[i][1] = Integer.toString(con.getObjs()[i].getAge());
//                data[i][2] = Float.toString((con.getObjs()[i].getWeigth()));
//            }
//        });
//
//        button2.addActionListener(actionEvent -> {
//            for (int i = 0; i < con.getCapacity(); i++) {
//                data[i][0] = " ";
//                data[i][1] = " ";
//                data[i][2] = " ";
//            }
//        });
//
//
//       /* con.putObj(2,tmp1);
//
//        con.getObj(0).getAll();
//        con.getObj(1).getAll();
//
//        for(Obj obj : con.getObjs()){
//            obj.getAll();
//        }*/
//
//
   }
}

