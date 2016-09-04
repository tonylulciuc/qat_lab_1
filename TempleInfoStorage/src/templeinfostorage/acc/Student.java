/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package templeinfostorage.acc;

import templeinfostorage.acc.properties.UserInfo;

/**
 *
 * @author Antony Lulciuc
 */
public class Student implements User{
    private UserInfo m_StudentInfo = new UserInfo();
    
    /**
     * Default Constructor
     */
    public Student(){
    }
    
    /**
     * Constructor
     * @param _userInfo [in] student information
     */
    public Student(UserInfo _userInfo){
        m_StudentInfo.copyInfo(_userInfo);
    }
    
    /**
     * Copy-Constructor
     * @param _student [in] student instance containing user information
     */
    public Student(Student _student){
        this.setUserInfo(_student.getUserInfo());
    }
    
    /**
     * Returns a non-mutable instance of user information
     * @return student information
     */
    @Override
    public final UserInfo getUserInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public final void setUserInfo(UserInfo _userInfo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
