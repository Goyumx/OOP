/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserManage;

/**
 *
 * @author goyum
 */
public class Users {
    private String UserID;
    private String Password;

    public Users() {
    }

    public Users(String UserID, String Password) {
        this.UserID = UserID;
        this.Password = Password;
    }

    /**
     * @return the UserID
     */
    public String getUserID() {
        return UserID;
    }

    /**
     * @param UserID the UserID to set
     */
    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    /**
     * @return the Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    @Override
    public String toString() {
        return "Users{" + "UserID=" + UserID + ", Password=" + Password + '}';
    }
    
    
}
