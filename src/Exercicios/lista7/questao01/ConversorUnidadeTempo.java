public class ConversorUnidadeTempo {
    
    public static int converteMinutosEmSegundos(int minutos) {
        int segundos = minutos * 60;
        return segundos;
    }

    public static int converteHorasEmMinutos(int horas) {
        int minutos = horas * 60;
        return minutos;
    }

    public static int converteDiasEmHoras(int dias) {
        int horas = dias * 24;
        return horas;
    }

    public static int converteSemanaEmDias(int semanas) {
        int dias = semanas * 7;
        return dias;
    }

    public static int converteMesemDias(int meses) {
        int dias = meses * 30;
        return dias;
    }

    public static int converteAnosEmDias(int anos) {
        int dias = anos * 365;
        return dias;
    }
}