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
        if (_info != null && _info instanceof UserInfo){
            final UserInfo info = (UserInfo)_info;
            
            this.m_strFirstName   = info.m_strFirstName;
            this.m_strLastName    = info.m_strLastName;
            this.m_strMiddleName  = info.m_strMiddleName;
            this.m_strMajor       = info.m_strMajor;    
            this.m_strPhoneNumber = info.m_strPhoneNumber;
            this.m_strTUID        = info.m_strPhoneNumber;       
            this.m_iStatus        = info.m_iStatus;
            return (true);
        }
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
     * @return string, represents users major
     */
    public String getMajor(){
        return (m_strMajor);
    }
    
    /**
     * Phone number
     * @return string, represents users phone number
     */
    public String getPhoneNumber(){
        return (m_strPhoneNumber);
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
    
    /**
     * First Name
     * @param _strFirstName [in] users first name
     */
    public void setFirstName(String _strFirstName){
        m_strFirstName = _strFirstName;
    }
    
    /**
     * Last Name
     * @param _strLastName [in] users last name
     */
    public void setLastName(String _strLastName){
        m_strLastName = _strLastName;
    }
    
    /**
     * Middle Name 
     * @param _strMiddleName [in] users middle name
     */
    public void setMiddleName(String _strMiddleName){
        m_strMiddleName = _strMiddleName;
    }
    
    /**
     * Temple ID
     * @param _strTUID [in] users temple university ID
     */
    public void setTUID(String _strTUID){
        m_strTUID = _strTUID;
    }
    
    /**
     * Major
     * @param _strMajor [in] users major
     */
    public void setMajor(String _strMajor){
        m_strMajor = _strMajor;
    }
    
    /**
     * Phone number
     * @param _strPhoneNumber [in] users phone number
     */
    public void setPhoneNumber(String _strPhoneNumber){
        m_strPhoneNumber = _strPhoneNumber;
    }
    
    /**
     * Status
     * @param _iStatus [in] users status
     */
    public void setStatus(int _iStatus){
        m_iStatus = _iStatus;
    }
    
}
