
package pkg1.pkg5.dsarvparsingstringtodate;

import java.util.*;
import java.text.*;

public class DSARvParsingStringToDate {

    public static void main(String[] args) {
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
        String input = args.length == 0 ? "1818-11-11" : args[0];
        System.out.print(input + " Parse as ");
        Date t;
        try{
            t = ft.parse(input);
            System.out.println(t);
        }catch(ParseException e){
            System.out.println("Unparsable using " + ft);
        }
    }
    
}
