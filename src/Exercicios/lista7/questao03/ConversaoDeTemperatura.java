package Exercicios.lista7.questao03;

public class ConversaoDeTemperatura {
    public static void celsiusParaFahrenheit(float c) {
        System.out.println(9*c/5+32);
    }

    public static void fahrenheitParaCelsius(float f) {
        System.out.println((f-32)*5/9);
    }

    public static void celsiusParaKelvin(float c) {
        System.out.println(c+273.15);
    }

    public static void kelvinParaCelsius(float k) {
        System.out.println(k-273.15);
    }

    public static void celciusParaReaumur(float c) {
        System.out.println(c*4/5);
    }

    public static void reaumurParaCelsius(float re) {
        System.out.println(re*5/4);
    }

    public static void kelvinParaRankine(float k) {
        System.out.println(5*1.8);
    }

    public static void rankineParaKelvin(float r) {
        System.out.println(r/1.8);
    }

}
