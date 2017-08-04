package lab06;

/**
 *
 * @author Virgo
 */
public class Numeral extends Expression {
    private int value;


    public Numeral(int value) {
        this.value = value;
    }

    public Numeral() {
    }
    
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
