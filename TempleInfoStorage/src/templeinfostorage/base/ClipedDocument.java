/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package templeinfostorage.base;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Antony Lulciuc
 */
public class ClipedDocument extends PlainDocument{
    private int m_iMinLength;
    private int m_iMaxLength;
    
    /**
     * Constructor
     * @param _iMinLength pin[ minimum length (inclusive) if -1 no limit
     * @param _iMaxLength  [in] maximum length (inclusive) if -1 no limit
     */
    public ClipedDocument(int _iMinLength, int _iMaxLength){
        super();
        m_iMinLength = _iMinLength;
        m_iMaxLength = _iMaxLength;
    }
    
    /**
     * Set limit to input size..
     * @param _off
     * @param _string
     * @param _attributeSet
     * @throws BadLocationException 
     */
    @Override
    public void insertString(int _off, String _string, AttributeSet _attributeSet)
            throws BadLocationException{
        if (m_iMaxLength > -1){
            if (this.getLength() + _string.length() <= m_iMaxLength)
                super.insertString(_off, _string, _attributeSet);
        }else{
            super.insertString(_off, _string, _attributeSet);
        }
    }
}
