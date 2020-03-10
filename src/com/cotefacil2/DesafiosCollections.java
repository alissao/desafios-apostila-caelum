package com.cotefacil2;

import com.sun.source.tree.Tree;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class DesafiosCollections {

    public static void main(String[] args) {

        TreeSet<Number> tsNum = new TreeSet<Number>();

        while (tsNum.size() < 1000) {
            if (tsNum.isEmpty()) {
                tsNum.add(1);
            }else {
                tsNum.add(tsNum.last().intValue() + 1);
            }
        }

        TreeSet<Number> tsNumReverse = (TreeSet<Number>) tsNum.descendingSet();
        System.out.println("Sem reverter: " + tsNum);
        System.out.println("Revertendo: " + tsNumReverse);

    }

}
