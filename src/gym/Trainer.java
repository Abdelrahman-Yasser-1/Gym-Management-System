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
public class Trainer extends Person{

//    Dates[]dates = new Dates[20];
    
    ArrayList<Dates> dates = new ArrayList<Dates>();
    
    public Trainer() {
        super(0, 0, null, null);
    }
    public Trainer(int id, int age, String name, String gender) {
        super(id, age, name, gender);
    }

//    public Dates[] getDates() {
//        return dates;
//    }
//
//    public void setDates(Dates[] dates) {
//        this.dates = dates;
//    }

    public ArrayList<Dates> getDates() {
        return dates;
    }

    public void setDates(ArrayList<Dates> dates) {
        this.dates = dates;
    }
  
    
}
