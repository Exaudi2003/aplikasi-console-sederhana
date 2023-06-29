/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AplikasiPeduliSehatFinall;

/**
 *
 * @author My Laptop
 */

public abstract class Pengunjung extends Auth{
    private String username, password;
    public abstract void biodata();
    /**
     *
     * @return
     */
    public String  getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
            
            
}


