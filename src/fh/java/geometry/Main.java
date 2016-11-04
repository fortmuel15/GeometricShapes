package fh.java.geometry;

import fh.java.geometry.model.GeometricShape;
import fh.java.geometry.model.curved.Circle;
import fh.java.geometry.model.quadrilateral.Rectangle;
import fh.java.geometry.model.trilateral.RightTriangle;


import java.util.*;
import java.util.stream.Collectors;

public class Main {
    //TODO: main() is missing
    public static void main(String[] args) {

        Main main = new Main();
        main.doIt();

    }

    private void doIt() {

        List shapeList = new ArrayList(); // List because it takes every possible List (array List, Linked List,..) // is called polymorphisem
        fillList(shapeList);
        printList(shapeList);

    }


    public void fillList(List<GeometricShape> shapeList) {
        //TODO: Implement
        shapeList.add(new Circle(1, 2, 2.0));
        shapeList.add(new Circle(4, 2, 3.0));
        shapeList.add(new Circle(3, 2, 1.0));

        shapeList.add(new Rectangle(3, 4, 10.2, 12.1));
        shapeList.add(new Rectangle(9, 8, 18.7, 15.1));
        shapeList.add(new Rectangle(8, 5, 12.8, 12.6));

        shapeList.add(new RightTriangle(4, 3, 10.1, 12.1));


    }


    public void printList(List<GeometricShape> shapeList) {
        //TODO: Implement
        System.out.println("------------ for loop -------------");
        for (int pos = 0; pos < shapeList.size(); pos++) {//worst case for iteration
            System.out.println(shapeList.get(pos));
        }
        System.out.println("------------ for each -------------");

        for (GeometricShape shape : shapeList) {
            System.out.println(shape);
        }

        System.out.println("------------ stream 1 -------------");

        shapeList.stream().forEach(shape -> System.out.println(shape));

        System.out.println("------------ stream 2 -------------");

        shapeList.stream().forEach(System.out::println);

    }
}
