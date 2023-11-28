package Exercicios.provaFinal.questao01;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataUtil {
    public static String dataCorrente() {
        DateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");

        return formatter1.format(new Date());
    }

    public static int anoCorrente() {
        Calendar anoCorrente = Calendar.getInstance();
        return anoCorrente.get(Calendar.YEAR);
    }

    public static int mesCorrente() {
        Calendar mesCorrente = Calendar.getInstance();
        return mesCorrente.get(Calendar.MONTH);
    }

    public static int diaDoMesCorrente() {
        Calendar diaDoMesCorrente = Calendar.getInstance();
        return diaDoMesCorrente.get(Calendar.DAY_OF_MONTH);
    }

    public static int horaCorrente() {
        Calendar horaCorrente = Calendar.getInstance();
        return horaCorrente.get(Calendar.HOUR);
    }

    public static int minutoCorrente() {
        Calendar minutoCorrente = Calendar.getInstance();
        return minutoCorrente.get(Calendar.MINUTE);
    }

    public static int segundosCorrente() {
        Calendar segundosCorrente = Calendar.getInstance();
        return segundosCorrente.get(Calendar.SECOND);
    }
}
