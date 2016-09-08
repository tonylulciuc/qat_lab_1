/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package templeinfostorage.base.instruction;

import javax.swing.JTextField;
import templeinfostorage.base.validate.Validate;

/**
 *
 * @author Antony Lulciuc
 */
public class ValidateLimitProcess  implements Instruction{
    /**
     * Execute an instruction
     * @param _data [in] data to process
     * @throws Exception 
     */
    @Override
    public void execute(Object[] _data)throws Exception{
        Object[] raw;
        Object[] data;
        Object[] res;
        Integer index;
        JTextField text;
        Integer limit;
        Boolean bMinValue;
        Validate validate;
        
        if (_data.length != 3)
            throw (new Exception("Error - invalid length of " + 
                                 _data.length + " must be 3"));
        
        raw = (Object[])_data[0];
        limit = (Integer)_data[1];
        bMinValue   = (Boolean)_data[2];
                
        if (raw.length != 3)
            throw (new Exception("Error - invalid length of " + 
                                 _data.length + " must be 3"));
        
        data     = (Object[])raw[0];
        res      = (Object[])data[0];
        index    = (Integer)data[1];
        validate = (Validate)data[2];
        text     = (JTextField)data[3];
        
        if (bMinValue){
            res[index] = null;
        }else{
            text.setText(text.getText().substring(0, limit > 0 ? limit - 1 : 0));
            if (validate.validate(text))
                res[index] = true;
            else
                res[index] = null;  
        }
    }
}
