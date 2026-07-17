interface Resizable {
    void resize(double factor);
    void resetSize();
}

class Image implements Resizable {
    private int width;
    private int height;
    private int originalWidth;
    private int originalHeight;

    public Image(int width, int height) {
        this.width = width;
        this.height = height;
        this.originalWidth = width;
        this.originalHeight = height;
    }

    @Override
    public void resize(double factor) {
        width = (int) (width * factor);
        height = (int) (height * factor);
    }

    @Override
    public void resetSize() {
        width = originalWidth;
        height = originalHeight;
    }

    public void display() {
        System.out.println("Image size: " + width + " x " + height);
    }
}

public class Exercise3Solution {
    public static void main(String[] args) {
        Image img = new Image(1920, 1080);
        img.display();

        img.resize(0.5);
        img.display();

        img.resetSize();
        img.display();
    }
}
