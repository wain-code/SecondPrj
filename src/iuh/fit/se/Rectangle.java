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
public class Rectangle {
    private double lenght;
    private double width;

    public Rectangle(double lenght, double width){
        if(lenght<0|| width < 0){
            throw new IllegalArgumentException("Lenght and width must be greater than 0");
        }
        this.lenght=lenght;
        this.width=width;

    }

    public Rectangle() {
        lenght=0.0;
        width=0.0;
    }

    public double getLenght() {
        return lenght;
    }
    /**
     *
     * @param lenght
     * @throws IllegalArgumentException
     */
    public void setLenght(double lenght) {
        if (lenght<0.0)
            throw new IllegalArgumentException("Width must be greater than 0");
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    /**
     *
     * @param width
     * @throws IllegalArgumentException
     */

    public void setWidth(double width) {
        if (width<0.0)
            throw new IllegalArgumentException("Width must be greater than 0");
        this.width = width;
    }

    public double getArea(){
        return this.lenght * this.width;
    }
    public double getPerimeter(){
        return (this.lenght + this.width)*2;
    }

    @Override
    public String toString(){
        return "Rectangle " +
                "lenght = " + lenght +
                " width = " + width ;
    }

}
