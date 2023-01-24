import java.util.Scanner;

public class area {

    public static void main(String[] args) {
        int length;
        int width;

        Scanner a = new Scanner(System.in);
        System.out.print("Enter Lengh = ");
        length = a.nextInt();
        System.out.print("Enter Width = ");
        width = a.nextInt();

        king u = new king();
        u.setlength(length);
        u.setwidth(width);

        double area = u.getlength() * u.getwidth();
        System.out.println("Rectangle area = " + area);

    }
}

class king {
    int length;
    int width;

    public void setlength(int length) {

        this.length = length;
    }

    public void setwidth(int width) {

        this.width = width;
    }

    public int getlength() {
        return length;
    }

    public int getwidth() {
        return width;
    }

}