package epam.java.data;

import epam.java.model.entity.Cirkle;
import epam.java.model.entity.Rectagle;
import epam.java.model.entity.Shape;
import epam.java.model.entity.Triangle;

public class DataSource {
    public static Shape[] getShapes(){
        return new Shape[] {
                new Triangle("red", 5,3,7),
                new Rectagle("yellow", 3,4),
                new Triangle("white", 2,4,5),
                new Cirkle("blue",3),
                new Rectagle("red", 5,4),
                new Cirkle("green",5),
                new Triangle("blue", 3,9,11),
                new Rectagle("white", 4,8),
                new Cirkle("red", 9),
                new Rectagle("blue",1,5)
        };
    }
}
