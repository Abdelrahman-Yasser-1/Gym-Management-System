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
    
    ArrayList<Dates> dates = new ArrayList<>();
    
    public Trainer() {
        super(0, 0, null, null);
    }
    public Trainer(int id, int age, String name, String gender) {
        super(id, age, name, gender);
    }

    public ArrayList<Dates> getDates() {
        return dates;
    }

    public void setDates(ArrayList<Dates> dates) {
        this.dates = dates;
    }

    @Override
    public void add(ArrayList<Person> trainers, Person newTrainer) {
          
        trainers.add(newTrainer);
        
    }
    
    /*
     * This function return boolean.
     * True if id of new trainer is exist.
     * False if all data are valied.
     */
    public boolean add(ArrayList<Trainer>trainers,Trainer newTrainer)
    {
        ArrayList<Person> t = new ArrayList<>();
        for (int i = 0; i < trainers.size(); i++) {
           t.add(trainers.get(i));
        }
        
        boolean flage = false;
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getId()==newTrainer.getId()) {
                 flage=true;
                 break;
            }
        }
        if (flage) {
            return true;
        }else{
            this.add(t, newTrainer);

            trainers.clear();
            for (int j = 0; j < t.size(); j++) {
                trainers.add((Trainer)t.get(j));
            } 
            
            return false;
        }
    }
    @Override
    public void edit(ArrayList<Person> trainers, int index, Person trainer) {
        
         trainers.set(index, (Trainer)trainer);
        
    }
    public void edit( Trainer trainer ,ArrayList<Trainer> trainers) {
      ArrayList<Person> t = new ArrayList<>();

        for (int i = 0; i < trainers.size(); i++) {
            t.add(trainers.get(i));
        }
        int index = -1;
        for (int i = 0; i < trainers.size(); i++) {
            if (trainers.get(i).getId()==trainer.getId()) {
                 index=i;
                 break;
            }

        }
        this.edit(t, index, trainer);
        for (int i = 0; i < t.size(); i++) {
           trainers.set(i, (Trainer)t.get(i));
        }
    }

    @Override
    public void delete(ArrayList<Person> trainers, int index) {
  
        trainers.remove(index);
        
    }
    public static void delete(int id,ArrayList<Trainer> trainers){

        Trainer t=new Trainer();
        ArrayList<Person> newtrainer = new ArrayList<>();

        for (int i = 0; i < trainers.size(); i++) {
            newtrainer.add(trainers.get(i));
        }
        int index = -1;
        for (int i = 0; i < trainers.size(); i++) {
            if(id== trainers.get(i).getId())
            {
                index = i;
                break;
            } 
        }

        t.delete(newtrainer, index);
        trainers.clear();
        for (int j = 0; j < newtrainer.size(); j++) {
            trainers.add((Trainer)newtrainer.get(j));
        }

    }
  
    
}
