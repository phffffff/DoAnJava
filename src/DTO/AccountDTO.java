/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author mizuk
 */
public class AccountDTO {
    private int idAccount;
    private String username;
    private String displayName;
    private String password;
    private int type;
    
    
        public AccountDTO(){
    }
    
    public AccountDTO( int idAccount, String username, String displayName, String password, int type){
        setIdAccount(idAccount);
        setUsername(username);
        setDisplayName(displayName);
        setPassword(password);
        setType(type);
    }
    
    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }
   
    
    public String getUsername() {
        return username;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getPassword() {
        return password;
    }

    public int getType() {
        return type;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setType(int type) {
        this.type = type;
    }

    
    
}
