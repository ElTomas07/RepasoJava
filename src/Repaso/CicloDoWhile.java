package Repaso;

public class CicloDoWhile {

    public static void main(String[] args) {
        int i= 1;
        do {
            int res = 3*i;
            System.out.println("3x"+i+"="+res);
            i++;
        }while(i <=15);
    }
}
