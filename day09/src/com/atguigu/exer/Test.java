package com.atguigu.exer;

/**
 * @author oono
 * @date 2020 09 02
 */
public class Test {

    public static void main(String[] args) {

        Circle c = new Circle("圆形1",10);
        Graphic g = new Circle("圆形2",20);

        System.out.println(c.getInfo());
        System.out.println(g.getInfo());


    }


}
