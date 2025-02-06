
public class tableLiner {
    public static <T> void print(int c1){
        System.out.println();
        for(int i=1;i<=c1;i++){
            if(i == 1 || i == c1) System.out.print("+");
            else System.out.print("-");
        }
    }
    public static <T> void print(int c1 ,int c2) {
        System.out.println();
        for (int i = 1; i <= (c1 + c2); i++) {
            if (i == 1 || i == c1 || i == c1+c2) System.out.print("+");
            else System.out.print("-");
        }
    }
    public static <T> void print(int c1, int c2,int c3) {
        int c12 = c1 + c2;
        int c123 = c1 + c2 + c3;

        System.out.println();
        for (int i = 1; i <= (c123) ; i++) {
            if (i == 1 || i == c1 || i == c12 || i == c123) System.out.print("+");
            else System.out.print("-");
        }
    }

    public static <T> void print(int c1, int c2,int c3,int c4) {
        int c12 = c1 + c2;
        int c123 = c1 + c2 + c3;
        int c1234 = c1 + c2 + c3 + c4;

        System.out.println();
        for (int i = 1; i <= (c1234) ; i++) {
            if (i == 1 || i == c1 || i == c12 || i == c123 || i == c1234) System.out.print("+");
            else System.out.print("-");
        }
    }

    public static <T> void print(int c1, int c2,int c3,int c4,int c5) {
        int c12 = c1 + c2;
        int c123 = c1 + c2 + c3;
        int c1234 = c1 + c2 + c3 + c4;
        int c12345 = c1 + c2 + c3 + c4 + c5;

        System.out.println();
        for (int i = 1; i <= (c12345) ; i++) {
            if (i == 1 || i == c1 || i == c12 || i == c123 || i == c1234 || i == c12345) System.out.print("+");
            else System.out.print("-");
        }
    }
}
