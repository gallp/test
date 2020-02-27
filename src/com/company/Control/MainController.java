package com.company.Control;

import com.company.Data.Container;
import com.company.Data.Obj;
import com.company.View.DataTransferEvent;
import com.company.View.DataTransferEventListener;
import com.company.View.MainFrame;

import java.util.List;

public class MainController {

    private MainFrame mainFrame;
    private Container container;

    public MainController() {

        mainFrame = new MainFrame("Program 002");
        container = new Container();

        mainFrame.getCenterPanel().setDataTransferEventListener(new DataTransferEventListener() {
            @Override
            public void dataSubmitted(DataTransferEvent e) {
                String name = e.getName();
                int age = Integer.parseInt(e.getAge());
                double weight = Double.parseDouble(e.getWeight());
                container.addObj(new Obj(name, age, (float) weight));
                System.out.println(container.getCount());
                mainFrame.getEastPanel().getTablePanel().setData(container.getLst00());
                mainFrame.getEastPanel().getTablePanel().refresh();
            }
        });
    }

}
