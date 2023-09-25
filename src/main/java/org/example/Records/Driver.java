package org.example.Records;

public class Driver {

    public static void main(String[] args) {

        Triangle tri = new Triangle(1, 2,3,5, 6, 2);

        System.out.println(tri);
        System.out.println(tri.x());
        System.out.println(tri.y());
        System.out.println(tri.z());

        System.out.println(tri.getPerimeter());

    }
}
