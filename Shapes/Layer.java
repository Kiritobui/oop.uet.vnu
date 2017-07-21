package Shape;

import java.util.ArrayList;

/**
 *
 * @author KOS_Virgo
 */
public class Layer extends Diagram {
    private ArrayList<Shape> shapes = new ArrayList<>();
    
    public void removeTriangle() {
        for (Shape s : shapes) {
            if (s instanceof Triangle) {
                shapes.remove(s);
            }
        }
    }
}
