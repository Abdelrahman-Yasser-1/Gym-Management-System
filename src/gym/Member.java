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
public class Member extends Person{
 
    //////////Start declaring Variables
    private int trainer_id;
    private int class_id;
    private String membership;
    //////////End declaring Variables
    
    //////////Start Constractors
    public Member(int trainer_id, int class_id, String membership, int id, int age, String name, String gender) {
        super(id, age, name, gender);
        this.trainer_id = trainer_id;
        this.class_id = class_id;
        this.membership = membership;
    }
    //////////End Constractors
    
    //////////Start Seters and Geters
    public int getTrainer_id() {
        return trainer_id;
    }

    public void setTrainer_id(int trainer_id) {
        this.trainer_id = trainer_id;
    }

    public int getClass_id() {
        return class_id;
    }

    public void setClass_id(int class_id) {
        this.class_id = class_id;
    }

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }
    //////////End Seters and Geters
    
    
    
}
