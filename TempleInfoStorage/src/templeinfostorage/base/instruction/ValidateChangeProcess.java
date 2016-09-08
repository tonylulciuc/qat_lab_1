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
public class ValidateChangeProcess implements Instruction{
    /**
     * Execute an instruction
     * @param _data [in] data to process
     * @throws Exception 
     */
    @Override
    public void execute(Object[] _data)throws Exception{
        Object[] data;
        Object[] res;
        Integer index;
        Validate validate;
        JTextField text;
        
        if (_data.length != 2)
            throw (new Exception("Error - invalid length of " + 
                                 _data.length + " must be 2"));
        
        // REINTERPRET DATA FOR PROCESSING
        data = (Object[])_data[0];
        res  = (Object[])data[0];
        index = (Integer)data[1];
        validate = (Validate)data[2];
        text = (JTextField)(data[3]);
        
        if (validate.validate(text.getText())){
            res[index] = true;
        }else{
            res[index] = null;
        }
    }
}
