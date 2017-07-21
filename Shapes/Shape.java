package Shape;

/**
 * Lớp đại diện các hình vẽ
 * @author KOS_Virgo
 */
public class Shape extends Layer {
    private String color;
    private boolean filled;
    
    //Khởi tạo hình với giá trị mặc định
    public Shape() {
        this.color = "red";
        this.filled = true;
    }
    
    //Khởi tạo hình có tham số
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    
    /**
     * Lấy giá trị màu
     * @return color
     */
    public String getColor() {
        return color;
    }
    
    /**
     * @param color màu của hình vẽ
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    /**
     * @return filled true là hình đặc và ngược lại
     */
    public boolean isFilled() {
        return filled;
    }
    
    /**
     * @param filled true là hình đặc và ngược lại
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}
