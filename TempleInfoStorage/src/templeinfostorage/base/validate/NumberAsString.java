/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package templeinfostorage.base.validate;

import javax.swing.JTextField;

/**
 *
 * @author Antony Lulciuc
 */
public class NumberAsString implements Validate {
    /**
     * Determines if said data matches signature in Validate Object
     * @param _object [in] data to validate
     * @return integer, result of validation process
     * @throws Exception 
     */
    @Override
    public boolean validate(Object _object){
        try{
            Integer.parseInt(((JTextField)_object).getText());
            return (true);
        }catch (Exception err){
            return (false);
        }
    }
}
