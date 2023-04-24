package vetoresEColecoes.atividadeMod6;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataUtil {
    public static final String pattern  = "dd/MM/yyyy";
    public static String dataFormatada(Date data){
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(data.getTime());
    }

    public static Date hoje(){
        return Calendar.getInstance().getTime();

    }

}
