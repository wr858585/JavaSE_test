package com.atguigu.homework;

/**
 * @author oono
 * @date 2020 08 31
 */
public class FamilyTest {

    public static void main(String[] args) {

        Husband hus = new Husband();
        hus.name = "xiaoming";
        hus.age = 19;

        Wife wife = new Wife();
        wife.name = "xiaohong";
        wife.age = 20;
        wife.husband = hus;

        hus.wife = wife;

        hus.getInfo();
        wife.getInfo();
    }





}
