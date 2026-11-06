public class Shapes {
    public static void main(String[] args) {
        Turtle john = new Turtle();
        int n = 3;
        int s = 12;
        int tC = 0;

        for (int j = 0; j < s; j++) {
            for (int i = 0; i < n; i++) {
                john.forward(100);
                john.left(360 / n);
                tC++;
            }
            john.left(360 / s);
            tC++;
        }   

        System.out.println(tC);
    }
}
