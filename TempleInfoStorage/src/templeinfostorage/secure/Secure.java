/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templeinfostorage.secure;

/**
 *
 * @author tonyl
 */
public interface Secure {
    
    /**
     * Determines if said data matches 
     * signature in Secure Object
     * @param _object [in] data to validate
     * @return integer, result of validation process
     * @throws Exception 
     */
    int validate(Object _object)throws Exception;
}
