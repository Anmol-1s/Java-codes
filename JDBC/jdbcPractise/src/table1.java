
public class table1 {

    public static <T> void print(int c1,T val1){
        String s1 = val1.toString();

        for(int i=1;i<=c1;i++){
            if(i==1) System.out.println();
            if(i==1 || i == c1) System.out.print("|");
            else if(i==2 || i>s1.length()+2 && i<c1) System.out.print(" ");
            else if (i==3) System.out.print(s1);
        }
    }

    public static <T> void print(int c1,T val1, int c2, T val2 ){
        String s1 = val1.toString();
        String s2 = val2.toString();

        for(int i=1;i<=(c1+c2)*2;i++){
            if(i==1) System.out.println();
            if(i==1 || i == c1 || i==(c1+c2)) System.out.print("|");
            else if(i==2 || i>s1.length()+2 && i<c1) System.out.print(" ");
            else if(i==c1+1 || i>s2.length()+c1+1 && i<(c1+c2)) System.out.print(" ");
            else if (i==3) System.out.print(s1);
            else if(i==c1+2) System.out.print(s2);
        }
    }

    public static <T> void print(int c1,T val1, int c2, T val2, int c3, T val3){
        String s1 = val1.toString();
        String s2 = val2.toString();
        String s3 = val3.toString();
        int c12 = c1+c2;
        int c123 = c1+c2+c3;

        for(int i=1;i<=(c123);i++){
            if(i==1) System.out.println();
            if(i==1 || i == c1 || i == c12 || i==(c123)) System.out.print("|");
            else if(i==2 || i>s1.length()+2 && i<c1) System.out.print(" ");
            else if(i==c1+1 || i>s2.length()+c1+1 && i<c12) System.out.print(" ");
            else if(i==c12+1 || i>s3.length()+c12+1 && i<(c123)) System.out.print(" ");
            else if (i==3) System.out.print(s1);
            else if(i==c1+2) System.out.print(s2);
            else if(i==c12+2) System.out.print(s3);
        }
    }

    public static <T> void print(int c1, T val1, int c2, T val2, int c3, T val3, int c4, T val4){
        String s1 = val1.toString();
        String s2 = val2.toString();
        String s3 = val3.toString();
        String s4 = val4.toString();
        int c12 = c1+c2;
        int c123 = c1+c2+c3;
        int c1234 = c1+c2+c3+c4;

        for(int i=1;i<=(c1234);i++){
            if(i==1) System.out.println();
            if(i==1 || i == c1 || i == c12 || i == c123 || i==(c1234)) System.out.print("|");
            else if(i==2 || i>s1.length()+2 && i<c1) System.out.print(" ");
            else if(i==c1+1 || i>s2.length()+c1+1 && i<c12) System.out.print(" ");
            else if(i==c12+1 || i>s3.length()+c12+1 && i<c123) System.out.print(" ");
            else if(i==c123+1 || i>s4.length()+c123+1 && i<(c1234)) System.out.print(" ");
            else if(i==3) System.out.print(s1);
            else if(i==c1+2) System.out.print(s2);
            else if(i==c12+2) System.out.print(s3);
            else if(i==c123+2) System.out.print(s4);
        }
    }

    public static <T> void print(int c1, T val1, int c2, T val2, int c3, T val3, int c4, T val4, int c5, T val5){
        String s1 = val1.toString();
        String s2 = val2.toString();
        String s3 = val3.toString();
        String s4 = val4.toString();
        String s5 = val5.toString();
        int c12 = c1+c2;
        int c123 = c1+c2+c3;
        int c1234 = c1+c2+c3+c4;
        int c12345 = c1+c2+c3+c4+c5;

        for(int i=1;i<=(c12345);i++){
            if(i==1) System.out.println();
            if(i==1 || i == c1 || i == c12 || i == c123 || i == c1234 || i == (c12345)) System.out.print("|");
            else if(i==2 || i>s1.length()+2 && i<c1) System.out.print(" ");
            else if(i==c1+1 || i>s2.length()+c1+1 && i<c12) System.out.print(" ");
            else if(i==c12+1 || i>s3.length()+c12+1 && i<c123) System.out.print(" ");
            else if(i==c123+1 || i>s4.length()+c123+1 && i<c1234) System.out.print(" ");
            else if(i==c1234+1 || i>s5.length()+c1234+1 && i<c12345) System.out.print(" ");
            else if(i==3) System.out.print(s1);
            else if(i==c1+2) System.out.print(s2);
            else if(i==c12+2) System.out.print(s3);
            else if(i==c123+2) System.out.print(s4);
            else if(i==c1234+2) System.out.print(s5);
        }
    }
}

