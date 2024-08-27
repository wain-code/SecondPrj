/*
 * @ (#) $NAME.java  1.0     8/27/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved
 */
package iuh.fit.se;

/*
 * @description: This class represents a bank with many bank accounts
 * @outhor: Huynh Minh Thu
 * @date: 8/27/2024
 * @version: 1.0
 */
public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(20.5, 4.0);
        System.out.println("Lenght: "+r2.getLenght());
        System.out.println("Width: "+r2.getWidth());
        System.out.println("Area: " + r2.getArea());
        System.out.println("getPerimeter: " + r2.getPerimeter());

    }

}
