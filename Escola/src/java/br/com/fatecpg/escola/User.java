
package br.com.fatecpg.escola;

import java.util.ArrayList;

public class User {
 
    
    private long id;
    private String role;
    private String name;
    private String login;
    private long passwordHash;

    public User(long id, String role, String name, String login, long passwordHash) {
        this.id = id;
        this.role = role;
        this.name = name;
        this.login = login;
        this.passwordHash = passwordHash;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public long getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(long passwordHash) {
        this.passwordHash = passwordHash;
    }
    
    public static User getUser(String login, String pass) throws Exception{
    
        
        
        String SQL;
        SQL = "SELECT * FROM USERS WHERE LOGIN = ? AND PASSWORDHASS = ?";
        Object parameters[] = {login, pass.hashCode());        
        ArrayList<Object[]> list = login.Conector.getQuery(SQL, parameters)
    }
}
