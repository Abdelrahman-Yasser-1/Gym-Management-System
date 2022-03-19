/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym;

import java.util.ArrayList;

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

    public Class(String type, String description, int trainer_id, int class_id, String day, int time) {
        this.type = type;
        this.description = description;
        this.trainer_id = trainer_id;
        this.class_id = class_id;
        this.day = day;
        this.time = time;
    }
    
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
    

    /*
     * This function return integer.
     * 1 if id of new class is exist.
     * 2 if choosen tariner has another class in chosen day and time.
     * 3 if all data are valied.
     */ 
    public int add (ArrayList<Class> classes, Class newClasse, ArrayList<Trainer> trainers)      
    {
    
        boolean flage0 = false;
        for (int i = 0; i < classes.size(); i++) {
            if (classes.get(i).getClass_id() == class_id) {
                flage0 = true;
                break;
            }
        }
        
        if(flage0 == true)
        {
        return 1;
        }
        else{
            //Start check if trainer has class in chosen day and time.
            boolean flage = false;
            int position = 0;
            for (int i = 0; i < trainers.size(); i++) {
                if (trainers.get(i).getId()== trainer_id) {
                    position = i;
                    break;
                }
            }

            ArrayList<Dates> d = new ArrayList<Dates>();
            d = trainers.get(position).getDates();
            for (int j = 0; j < d.size(); j++) {
                if (d.get(j).day.equals(day) && d.get(j).time == time) {
                   flage = true; 
                }
            }
            //End check if trainer has class in chosen day and time.

            if (flage == true) {
                return 2;
            }
            else
            {
                //add day and time to trainer data.
                trainers.get(position).dates.add(new Dates(day,time));

                //Add new class to data.
                classes.add(newClasse); 
                
                return 3;
            }
        }
    }
    
    
     /*
     * This function return boolean.
     * True if choosen tariner has another class in chosen day and time.
     * False if all data are valied.
     */
    public boolean edit (ArrayList<Class> classes, Class updateClasse, ArrayList<Trainer> trainers)
    {
        //Start check if trainer has class in chossen day and time.
        boolean flage = false;
        int position = 0;
        for (int i = 0; i < trainers.size(); i++) {
            if (trainers.get(i).getId()== trainer_id) {
                position = i;
                break;
            }
        }

        ArrayList<Dates> d = new ArrayList<Dates>();
        d = trainers.get(position).getDates();
        for (int j = 0; j < d.size(); j++) {
            if (d.get(j).day.equals(day) && d.get(j).time == time) {
               flage = true; 
            }
        }
        //End check if trainer has class in chossen day and time.

        if (flage == true) {
            return true;
        }
        else{
            // Get the index of class to be able to make updta on it.
            int index = -1;
            for (int i = 0; i < classes.size(); i++) {
                if (classes.get(i).getClass_id() == class_id) {
                    index=i;
                }
            } 

            // Reblace old data with updated data.
            classes.set(index, updateClasse); 

            return false;
        }
 
    }
    
    public static void delete(ArrayList<Class> classes, int id)
    {
        //Get index of member that will be deleted .
        int index = -1;
        for (int i = 0; i < classes.size(); i++) {
            if(id==classes.get(i).getClass_id())
            {
                index = i;
                break;
            }  
        }
        
        classes.remove(index);
    }
    
}
