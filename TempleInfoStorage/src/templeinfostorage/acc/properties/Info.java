/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templeinfostorage.acc.properties;

/**
 *
 * @author tonyl
 */
public interface Info {
    
    /**
     * If the argument passed is compatible with the caller,
     * copy data specified by method.
     * @param _info [in] data to copy
     * @return boolean, true on a successful copy, else false.
     */
    boolean copyInfo(Info _info);
}
