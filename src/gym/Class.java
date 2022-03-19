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
public class Class {
    
    private String type;
    private String description;
    private int trainer_id;
    private int class_id;
    private String day;
    private int time;
    public int num_of_members;

    public Class(String type, String description, int trainer_id, int class_id, String day, int time, int num_of_members) {
        this.type = type;
        this.description = description;
        this.trainer_id = trainer_id;
        this.class_id = class_id;
        this.day = day;
        this.time = time;
        this.num_of_members = num_of_members;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

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

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getNum_of_members() {
        return num_of_members;
    }

    public void setNum_of_members(int num_of_members) {
        this.num_of_members = num_of_members;
    }
    
    public void increment_num_of_members()
    {
        this.num_of_members+=1;
    }  
    public void decrement_num_of_members()
    {
        this.num_of_members-=1;
    }  
    
}
