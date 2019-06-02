package com.neuedu.Test;

import com.neuedu.Homework.Monkey;
import com.neuedu.Homework.People;

public class AnimalTest {
    public static void main(String[] args) {

        Monkey monkey=new Monkey("Monkey");
        monkey.speak();

        System.out.println();

        People people=new People();
        people.speak();
        people.think();
    }

}
