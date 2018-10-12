package epam.java.model;

import epam.java.model.entity.Shape;

import java.util.Arrays;

public class Shapes {
    private Shape[] shapes;
    private double totalArea;

    public Shape[] getShapes() {
        return shapes;
    }

    public void setShapes(Shape[] shapes) {
        this.shapes = shapes;
    }

    public double getTotalArea() {
        return totalArea;
    }

    public void calcAreaSum(){
        totalArea=0;
        for (Shape i : shapes) {
            totalArea+=i.getArea();
        }
    }

    public void getByType(Shape shape){
        Shape[] temp = new Shape[shapes.length];
        int counter = 0;
        for (int i = 0; i < shapes.length ; i++) {
            if(shapes[i].getClass().equals(shape.getClass())){
                temp[counter++] = shapes[i];
            }
        }
        Shape[] temp2 = Arrays.copyOf(temp,counter);
        totalArea = 0;
        for (Shape i : temp2) {
            totalArea+=i.getArea();
        }
    }

    public void sortByArea(){
        Arrays.sort(shapes,new AreaComparator());
    }

    public void sortByColor(){
        Arrays.sort(shapes,new ShapeColorComparator());
    }

}
