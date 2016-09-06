/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templeinfostorage;

/**
 *
 * @author Antony Lulciuc
 */
public interface Instruction {
    
    /**
     * Execute an instruction
     * @param _data [in] data to process
     * @throws Exception 
     */
    void execute(Object[] _data)throws Exception;
}
