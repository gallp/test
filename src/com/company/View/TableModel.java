package com.company.View;

import com.company.Data.Obj;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class TableModel extends AbstractTableModel {

    private List<Obj> lst;

    public TableModel() {
    }

    @Override
    public int getRowCount() {

        if(lst != null) {
            return lst.size();
        }
        else
            return 0;
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int row, int col) {

        Obj o = lst.get(row);

        switch (col) {
            case 0:
                return o.getName();
            case 1:
                return o.getAge();
            case 2:
                return o.getWeight();
        }
        return null;
    }

    public void setData(List<Obj> lst) {
        this.lst = lst;
    }
}
