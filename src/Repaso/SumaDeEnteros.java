package Repaso;

public class SumaDeEnteros {

    static short num1 = 1, num2 = 2;

    public static void sumar(short num1, short num2){
        int ResSuma = num1 + num2;
        System.out.println("El resultado de la suma es" +ResSuma);
    }

    public static void main(String[] args) {
        sumar(num1,num2);
    }

}
