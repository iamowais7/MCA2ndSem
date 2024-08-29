package week_4;
class Rectangle {
    private int x, y, width, height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public Rectangle intersection(Rectangle other) {
        int x1 = Math.max(this.x, other.x);
        int y1 = Math.max(this.y, other.y);
        int x2 = Math.min(this.x + this.width, other.x + other.width);
        int y2 = Math.min(this.y + this.height, other.y + other.height);
        
        if (x1 < x2 && y1 < y2) {
            return new Rectangle(x1, y1, x2 - x1, y2 - y1);
        } else {
            // Rectangles do not overlap
            return null;
        }
    }

    public String toString() {
        return "Rectangle[x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + "]";
    }
}
public class _5_IntersectionOfTwoRectangle {
	public static void main(String[] args) {
        Rectangle r1 = new Rectangle(0, 0, 5, 5);
        Rectangle r2 = new Rectangle(3, 3, 5, 5);
        
        System.out.println("Rectangle 1: " + r1);
        System.out.println("Rectangle 2: " + r2);
        
        Rectangle intersection = r1.intersection(r2);
        if (intersection != null) {
            System.out.println("Intersection: " + intersection);
        } else {
            System.out.println("Rectangles do not overlap.");
        }
    }
}
