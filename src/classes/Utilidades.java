
package classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utilidades {
    
    public static boolean isNumeric(String Numero){
        try {
            Integer.parseInt(Numero);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
    
    public static Date StringtoDate(String Date){
        SimpleDateFormat formatotexto = new SimpleDateFormat("yyyy/MM/dd");
        Date x = null;
        try {
            x = formatotexto.parse(Date);
        } catch (ParseException ex) {
            
        }
        return x;
    }
    public static String formatDate(Date Data){
        SimpleDateFormat formatotexto = new SimpleDateFormat("yyyy/MM/dd");
        return formatotexto.format(Data);
    }
    
    
    
    public static int objectToInt(Object in){
        int NumInt = Integer.parseInt(objectToString(in));
        return NumInt;
    }
 
    public static double objectToDouble(Object in){
        String msg = in.toString();
        double NumDouble = Double.parseDouble(msg);
        return NumDouble;
        
    }
 
    public static boolean objectToBoolean(Object in){
        String CadBool = objectToString(in);
        Boolean bool = Boolean.valueOf(CadBool);
        return bool;
        
    }
 
    public static String objectToString(Object in){
        String msg = "";
        
        if(in != null){
            msg = in.toString();
        }
        return msg;
    }
 
}
