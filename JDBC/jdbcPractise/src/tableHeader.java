
public class tableHeader {
    public static <T> void print(int ColLength,T Col1Name, T Col2Name, T Col3Name, T Col4Name ){
        int c = ColLength;
        print(c, Col1Name, c, Col2Name, c, Col3Name, c, Col4Name);
    }

    public static <T> void print(int c1,T Col1Name){
        String s1 = Col1Name.toString();

        for(int i=1;i<=c1*3;i++){

            if(i<=c1){
                if(i == 1 || i == c1) System.out.print("+");
                else System.out.print("-");
            }
            else if(i>c1 && i<=c1*2){
                if(i==c1+1) System.out.println();
                if(i==c1+1 || i == c1*2) System.out.print("|");
                else if(i==c1+2 || i>s1.length()+c1+2 && i<c1*2) System.out.print(" ");
                else if (i==c1+3) System.out.print(s1);
            }
            else{
                if(i==c1*2+1) System.out.println();
                if(i == c1*2+1 || i == c1*3) System.out.print("+");
                else System.out.print("-");
            }
        }
    }

    public static <T> void print(int c1,T Col1Name , int c2,T Col2Name ){
        String s1 = Col1Name.toString();
        String s2 = Col2Name.toString();
        int c12 = c1+c2;

        for(int i=1;i<=c12*3;i++){
            if(i<=c12){
                if(i == 1 || i == c1 || i == c12) System.out.print("+");
                else System.out.print("-");
            }
            else if(i>c12 && i<=c12*2){
                if(i==c12+1) System.out.println();
                if(i==c12+1 || i == c1+c12 || i == c12*2) System.out.print("|");
                else if(i==c12+2 || i>s1.length()+c12+2 && i<c1+c12) System.out.print(" ");
                else if(i==c1+c12+1 || i>s2.length()+c1+c12+1 && i<c12*2) System.out.print(" ");
                else if (i==c12+3) System.out.print(s1);
                else if (i==c1+c12+2) System.out.print(s2);
            }
            else{
                if(i == c12*2+1) System.out.println();
                if(i == c12*2+1 || i == c1+c12*2|| i == c12*3) System.out.print("+");
                else System.out.print("-");
            }
        }
    }

    public static <T> void print(int c1,T Col1Name , int c2,T Col2Name , int c3,T Col3Name ){
        String s1 = Col1Name.toString();
        String s2 = Col2Name.toString();
        String s3 = Col3Name.toString();
        int c12 = c1+c2;
        int c123 = c1+c2+c3;

        for(int i=1;i<=c123*3;i++){
            if(i<=c123){
                if(i == 1 || i == c1 || i == c12 || i == c123) System.out.print("+");
                else System.out.print("-");
            }
            else if(i>c123 && i<=c123*2){
                if(i==c123+1) System.out.println();
                if(i==c123+1 || i == c1+c123 || i == c12+c123 || i == c123*2) System.out.print("|");
                else if(i==c123+2 || i>s1.length()+c123+2 && i<c1+c123) System.out.print(" ");
                else if(i==c1+c123+1 || i>s2.length()+c1+c123+1 && i<c12+c123) System.out.print(" ");
                else if(i==c12+c123+1 || i>s3.length()+c12+c123+1 && i<c123*2) System.out.print(" ");
                else if (i==c123+3) System.out.print(s1);
                else if (i==c1+c123+2) System.out.print(s2);
                else if (i==c12+c123+2) System.out.print(s3);
            }
            else{
                if(i==c123*2+1) System.out.println();
                if(i == c123*2+1 || i == c1+c123*2|| i == c12+c123*2 || i == c123*3) System.out.print("+");
                else System.out.print("-");
            }
        }
    }

    public static <T> void print(int c1,T Col1Name , int c2,T Col2Name , int c3,T Col3Name , int c4,T Col4Name){
        String s1 = Col1Name.toString();
        String s2 = Col2Name.toString();
        String s3 = Col3Name.toString();
        String s4 = Col4Name.toString();

        int c12 = c1+c2;
        int c123 = c1+c2+c3;
        int c1234 = c1+c2+c3+c4;

        for(int i=1;i<=c1234*3;i++){
            if(i<=c1234){
                if(i == 1 || i == c1 || i == c12 || i == c123 || i == c1234) System.out.print("+");
                else System.out.print("-");
            }
            else if(i>c1234 && i<=c1234*2){
                if(i==c1234+1) System.out.println();
                if(i==c1234+1 || i == c1+c1234 || i == c12+c1234 || i == c123 + c1234|| i == c1234*2) System.out.print("|");
                else if(i==c1234+2 || i>s1.length()+c1234+2 && i<c1+c1234) System.out.print(" ");
                else if(i==c1+c1234+1 || i>s2.length()+c1+c1234+1 && i<c12+c1234) System.out.print(" ");
                else if(i==c12+c1234+1 || i>s3.length()+c12+c1234+1 && i<c123+c1234) System.out.print(" ");
                else if(i==c123+c1234+1 || i>s4.length()+c123+c1234+1 && i<c1234*2) System.out.print(" ");
                else if (i==c1234+3) System.out.print(s1);
                else if (i==c1+c1234+2) System.out.print(s2);
                else if (i==c12+c1234+2) System.out.print(s3);
                else if (i==c123+c1234+2) System.out.print(s4);
            }
            else{
                if(i==c1234*2+1) System.out.println();
                if(i == c1234*2+1 || i == c1+c1234*2|| i == c12+c1234*2 || i == c123+c1234*2 || i == c1234*3) System.out.print("+");
                else System.out.print("-");
            }
        }
    }

    public static <T> void print(int c1,T Col1Name , int c2,T Col2Name , int c3,T Col3Name , int c4,T Col4Name , int c5,T Col5Name){
        String s1 = Col1Name.toString();
        String s2 = Col2Name.toString();
        String s3 = Col3Name.toString();
        String s4 = Col4Name.toString();
        String s5 = Col5Name.toString();

        int c12 = c1+c2;
        int c123 = c1+c2+c3;
        int c1234 = c1+c2+c3+c4;
        int c12345 = c1+c2+c3+c4+c5;

        for(int i=1;i<=c12345*3;i++){
            if(i<=c12345){
                if(i == 1 || i == c1 || i == c12 || i == c123 || i == c12345) System.out.print("+");
                else System.out.print("-");
            }
            else if(i>c12345 && i<=c12345*2){
                if(i==c12345+1) System.out.println();
                if(i==c12345+1 || i == c1+c12345 || i == c12+c12345 || i == c123 + c12345|| i == c1234+c12345 || i == c12345*2) System.out.print("|");
                else if(i==c12345+2 || i>s1.length()+c12345+2 && i<c1+c12345) System.out.print(" ");
                else if(i==c1+c12345+1 || i>s2.length()+c1+c12345+1 && i<c12+c12345) System.out.print(" ");
                else if(i==c12+c12345+1 || i>s3.length()+c12+c12345+1 && i<c123+c12345) System.out.print(" ");
                else if(i==c123+c12345+1 || i>s4.length()+c123+c12345+1 && i<c1234+c12345) System.out.print(" ");
                else if(i==c1234+c12345+1 || i>s5.length()+c1234+c12345+1 && i<c12345*2) System.out.print(" ");
                else if (i==c12345+3) System.out.print(s1);
                else if (i==c1+c12345+2) System.out.print(s2);
                else if (i==c12+c12345+2) System.out.print(s3);
                else if (i==c123+c12345+2) System.out.print(s4);
                else if (i==c1234+c12345+2) System.out.print(s5);
            }
            else{
                if(i==c12345*2+1) System.out.println();
                if(i == c12345*2+1 || i == c1+c12345*2|| i == c12+c12345*2 || i == c123+c12345*2 || i == c1234+c12345 ||i == c12345*3) System.out.print("+");
                else System.out.print("-");
            }
        }
    }
}
