package org.example.Records;

public record Triangle(double x, double y, double z, double x1, double y1, double z1) {

    public double getPerimeter(){
        return x + y + z + x1 + y1 + z1;
    }


}
