package com.company.View;

import com.company.Data.Obj;
import javax.swing.*;
import java.awt.*;
import java.util.List;

public class TablePanel extends  Panel {

    private JTable table;
    private TableModel tableModel;

    public TablePanel() {
        setLayout(new BorderLayout());
        tableModel = new TableModel();
        table = new JTable(tableModel);
        add(table);
    }

    public void setData(List<Obj> lst) {
        tableModel.setData(lst);
    }

    public void refresh() {
        tableModel.fireTableDataChanged();
    }
}
