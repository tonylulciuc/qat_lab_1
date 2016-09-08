/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package templeinfostorage.base.validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTextField;

/**
 *
 * @author Antony Lulciuc
 */
public class NumberAsString implements Validate {
    private static final Pattern pattern = Pattern.compile(".*\\D.*", Pattern.CASE_INSENSITIVE);
    private Matcher matcher;
    /**
     * Determines if said data matches signature in Validate Object
     * @param _object [in] data to validate
     * @return integer, result of validation process
     * @throws Exception 
     */
    @Override
    public boolean validate(Object _object){
        String str = (String)_object;
        matcher = pattern.matcher(str);
        return (!matcher.find());
    }
}
