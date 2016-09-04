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
public class UserInfo implements Info{
    public static final int USER_GRADUATE      = 0x00000001;
    public static final int USER_UNDERGRADUATE = 0x00000002;
    private String m_strFirstName;
    private String m_strLastName;
    private String m_strMiddleName;
    private String m_strPhoneNumber;
    private String m_strTUID;
    private String m_strMajor;
    private int    m_bStatus;
    
    /**
     * Getter Methods
     */
    
    /**
     * If the argument passed is compatible with the caller,
     * copy data specified by method.
     * @param _info [in] data to copy
     * @return boolean, true on a successful copy, else false.
     */
    @Override
    public boolean copyInfo(Info _info){
        // TODO : add logic for coping user information
        return (false);
    }
    
    /**
     * Setter Methods
     */
    
}
