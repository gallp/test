package com.company.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Container extends Obj implements Serializable {

    private List<Obj> lst00;

    public Container(){

        lst00 = new ArrayList<Obj>();
        System.out.println("new array list of obj");
    }


    public List<Obj> getLst00() {
        return lst00;
    }

    public void addObj(Obj o) {
        lst00.add(o);
    }

    public void remObj(Obj o) {
        lst00.remove(o);
    }

    public int getCount() {
        return this.lst00.size();
    }
}
