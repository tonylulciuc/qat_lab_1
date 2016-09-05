/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package templeinfostorage.ui;

import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Antony Lulciuc
 */
public class JTextEmptyListener implements DocumentListener {
    private Object[] m_Data;
    private int m_ciInsert = 0;
    private int m_iIndex = 0;
    
    public JTextEmptyListener(Object[] _data){
        m_iIndex = (Integer)_data[1];
        m_Data = (Object[])_data[0];
        m_Data[m_iIndex] = null;
    }
    
    @Override
    public void insertUpdate(DocumentEvent e) {
        ++m_ciInsert;
        m_Data[m_iIndex] = 0;
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
         if (m_ciInsert > 0){
             if (--m_ciInsert == 0)
                 m_Data[m_iIndex] = null;
         }
         else
             m_Data[m_iIndex] = null;
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
    }
}
