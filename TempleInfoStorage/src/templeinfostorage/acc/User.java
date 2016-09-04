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
public interface User {
    
    /**
     * Getter Methods
     */
    
    /**
     * Returns a instance of user information
     * @return user information
     */
    UserInfo getUserInfo();
    
    /**
     * Setter Methods
     */
   
    /**
     * Modifies user information
     * @param _userInfo [information to copy
     */
    void setUserInfo(UserInfo _userInfo);
}
