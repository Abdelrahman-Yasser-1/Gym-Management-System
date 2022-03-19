/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym;

/**
 *
 * @author LENOVO
 */
public class Employee {
    
    //////////Start declaring Variables
    private int id; 
    private String password;
    //////////End declaring Variables
    
    //////////Start Constractors
    public Employee(int id, String password) {
        this.id = id;
        this.password = password;
    }
    //////////End Constractors
    
    //////////Start Seters and Geters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    //////////End Seters and Geters
     
    
}
