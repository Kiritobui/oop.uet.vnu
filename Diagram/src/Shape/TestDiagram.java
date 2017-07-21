package Shape;

import java.util.*;

/**
 *
 * @author Virgo
 */
public class TestDiagram {
    public static void main(String[] args) {
        Layer layer = new Layer();
        Circle c1 = new Circle(2.0);
        layer.addShape(c1);
        Circle c2 = new Circle(3.0);
        layer.addShape(c2);
        Retangle r1 = new Retangle();
        layer.addShape(r1);
        Retangle r2 = new Retangle();
        layer.addShape(r2);
        System.out.println("chưa xóa " + layer.showShape());
        layer.removeCircle();
        System.out.println("Xóa tròn " + layer.showShape());
    }
}
