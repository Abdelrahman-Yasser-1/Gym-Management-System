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
public abstract class Person {
    
    //////////Start declaring Variables
    private int id;
    private int age;
    private String name;
    private String gender;
    //////////End declaring Variables

    //////////Start Constractors
    public Person(int id, int age, String name, String gender) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
    //////////End Constractors

    //////////Start Seters and Geters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    //////////End Seters and Geters
  
    
   public abstract void add (ArrayList<Person> arraylist ,Person obj);
   
   public abstract void edit (ArrayList<Person> arraylist ,int index, Person obj);
   
   public abstract void delete (ArrayList<Person> arraylist ,int index);
    
}
