/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validaciones;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 * @author David Grande
 */
public class validar {

    public static int tlf(String tlf) {
        Pattern pattern = Pattern.compile("^(\\+34|0034|34)?[6|7|8|9][0-9]{8}$");
        
        if (pattern.matcher(tlf).matches()) {
            return 1;
        } else {
            return 0;
        }

    }
    
}
