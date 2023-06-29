/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AplikasiPeduliSehatFinall;

/**
 *
 * @author My Laptop
 */
public class admin extends Auth {

    private String username, password;

    public admin(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    @Override
    public boolean authentikasi(String username, String password) {
        if(this.username.equals(username) && this.password.equals(password)){
            return true;
        }
        return false;
    }
    
}
