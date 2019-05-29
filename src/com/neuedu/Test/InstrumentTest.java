package com.neuedu.Test;

import com.neuedu.Homework.Brass;
import com.neuedu.Homework.Wind;

public class InstrumentTest {
    public static void main(String[] args) {
        Wind wind=new Wind();
        wind.play();

        System.out.println();

        Brass brass=new Brass();
        brass.play();
    }
}
