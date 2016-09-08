/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package templeinfostorage.ui;

import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import sun.rmi.runtime.Log;

import templeinfostorage.base.instruction.Instruction;

/**
 *
 * @author Antony Lulciuc
 */
public class JTextReadyListener implements DocumentListener {
    private Instruction m_Insert;
    private Instruction m_Remove;
    private Instruction m_Change;
    private Object[] m_Data;
    
    /**
     * Constructor
     * @param _insert [in] key insertion instruction
     * @param _remove [in] key removal instruction
     * @param _change [in] key change instruction
     * @param _data   [in] data to process by instruction
     */
    public JTextReadyListener(Instruction _insert, Instruction _remove, Instruction _change, Object[] _data){
        m_Insert = _insert;
        m_Remove = _remove;
        m_Change = _change;
        m_Data   = new Object[] {_data, null};
    }
    
    /**
     * 
     * @param e 
     */
    @Override
    public void insertUpdate(DocumentEvent e) {
        m_Data[1] = e;
        this.execute(0);
    }

    /**
     * 
     * @param e 
     */
    @Override
    public void removeUpdate(DocumentEvent e) {
        m_Data[1] = e;
        this.execute(1);
    }

    /**
     * 
     * @param e 
     */
    @Override
    public void changedUpdate(DocumentEvent e) {
        m_Data[1] = e;
        this.execute(2);
    }
    
    /**
     * Execute instruction 
     * @param _id [in] instruction to execute
     */
    private void execute(int _id){
        try{
            if (_id == 0 && m_Insert != null)
                    m_Insert.execute(m_Data);
            else{       
                if (_id == 1 && m_Remove != null)
                        m_Remove.execute(m_Data);
                else{
                    if (_id == 2 && m_Change != null)
                        m_Change.execute(m_Data);
                }
            }
        }catch (Exception err){
            System.out.println("error : " + err.getMessage());
            System.exit(1);
        }
    }
}
