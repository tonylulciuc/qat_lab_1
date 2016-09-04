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
    private int    m_iStatus;
    
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
     * Getter Methods
     */
    
    /**
     * First name
     * @return string, represents users first name
     */
    public String getFirstName(){
        return (m_strFirstName);
    }
    
    /**
     * Last name
     * @return string, represents users last name
     */
    public String getLastName(){
        return (m_strLastName);
    }
     
    /**
     * Middle name
     * @return string, represents users middle name
     */
    public String getMiddleName(){
        return (m_strMiddleName);
    }
    
    /**
     * Temple user ID
     * @return string, represents users TUID
     */
    public String getTUID(){
        return (m_strTUID);
    }
    
    /**
     * Major
     * @return string, represents users makor
     */
    public String getMajor(){
        return (m_strMajor);
    }
    
    /**
     * Status
     * @return integer, represents user status in university,
     */
    public int getStatus(){
        return (m_iStatus);
    }
    
    /**
     * Setter Methods
     */
    
}
