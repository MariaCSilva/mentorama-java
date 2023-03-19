package Variaveis;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegulares {
    public static void main(String[] args){
        String cpf = "111.111.111-00";

        String regex = "\\b([0-9]{3})\\.([0-9]{3})\\.([0-9]{2})";
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher("111.111.111-00");
        System.out.println(match.find());
    }
}
