package classesEObjetos.pacote5;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Datas {

    public static void main(String[] args){
        Calendar data = Calendar.getInstance();
        System.out.println(data.getTime());

        data.add(Calendar.MONTH, 1);
        System.out.println(data.getTime());

        data.add(Calendar.DAY_OF_MONTH, 5);
        System.out.println(data.getTime());

        data.add(Calendar.DAY_OF_MONTH, -5);
        System.out.println(data.getTime());

        data.set(Calendar.MONTH, Calendar.AUGUST);
        System.out.println(data.getTime());

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(sdf.format(data.getTime()));
    }

}
