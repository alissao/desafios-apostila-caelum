package com.cotefacil2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesafioArraylistRevert {

    public static void main(String[] args) {

        List<Number> arNum = new ArrayList<Number>();

        int i = 1;
        while (arNum.size() < 1000) {
            arNum.add(i);
            i++;
        }

        Collections.reverse(arNum);

        System.out.println(arNum);

    }

}
