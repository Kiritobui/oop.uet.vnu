package Shape;

import java.util.ArrayList;

/**
 *
 * @author KOS_Virgo
 */
public class Layer extends Diagram {
    private ArrayList<Shape> shapes = new ArrayList<>();
    
    public Layer() {
        
    }
    
    public Layer(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }
    
    public void addShape(Shape shape) {
        this.shapes.add(shape);
    }
    
    public void removeCircle() {
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Circle) {
                shapes.remove(i);
            }
        }
    }
    
    public ArrayList<Shape> showShape() {
        return shapes;
    }
}
