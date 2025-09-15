package week2;

public class Ex39 {

    public void printStars(int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.print("*");
        }
    }

    public void printSquare(int sideSize) {
        for (int i = 0; i < sideSize; i++) {
            System.out.println("****");
        }
    }

    public void printRectangle(int width, int height) {
        for (int j = 0; j < height; j++) {
            for (int i = 0; i < width; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printTriangle(int size) {
        for (int j = 0; j < size; j++) {
            for (int i = 0; i <= j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
