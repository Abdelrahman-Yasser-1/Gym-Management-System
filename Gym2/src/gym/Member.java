/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym;

import java.awt.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Member extends Person{
 
    //////////Start declaring Variables
    public int trainer_id;
    private int class_id;
    private String membership;
    //////////End declaring Variables
    
    //////////Start Constractors
    
    public Member() {
        super(0, 0, "", "");
    }

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

    @Override
    public void add(ArrayList<Person> members, Person newMember) {
          
        members.add(newMember);
        
    }

    /*
     * This function return integer.
     * 1 if id of new member is exist.
     * 2 if chosen class has limited number of members (limited number of members seted manula as 11).
     * 3 if all data are valied.
     */
    public int add(ArrayList<Member> members, Member newMember, ArrayList<Class> Classes) {
        ArrayList<Person> m = new ArrayList<>();
        for (int i = 0; i < members.size(); i++) {
           m.add(members.get(i));
        }
         
        boolean flage = false;
        for (int i = 0; i < m.size(); i++) {
            if (m.get(i).getId()==newMember.getId()) {
                flage=true;
                break;
            }
        }
        if (flage) {
          return 1;  
        }else{
            int num_of_members = 0; 

            int i;
            for (i = 0; i < Classes.size(); i++) {
                if(newMember.getClass_id() == Classes.get(i).getClass_id())
                {
                num_of_members = Classes.get(i).getNum_of_members();
                break;
                } 
            }

            if(num_of_members < 11)
            {
                //Add new member to data.
                this.add(m, newMember);
                members.clear();
                for (int j = 0; j < m.size(); j++) {
                   members.add((Member)m.get(j));
                }

                // Increment number of member of class that user join it.
                Classes.get(i).increment_num_of_members(); 

                return 2;
            }
            else{
            return 3;
            }
        } 
    }
    
    @Override
    public void edit(ArrayList<Person> members, int index, Person member) {
        
         members.set(index, (Member)member);
        
    }
    
    /* This function return boolean.
     * True if in user chosed class has limited number of members (limited number of members seted manula as 11).
     * False in all data are valied.
     */
    public boolean edit(ArrayList<Member> members, Member member, ArrayList<Class> Classes) {
                
        ArrayList<Person> m = new ArrayList<>();

        for (int i = 0; i < members.size(); i++) {
           m.add(members.get(i));
        }
        
        
        int num_of_members = 0;

        for (int i = 0; i < Classes.size(); i++) {
            if(member.getClass_id() == Classes.get(i).getClass_id())
            {
            num_of_members = Classes.get(i).getNum_of_members();
            break;
            } 
        }

        // Get the index of member to be able to make updta on it.
         int index = -1;
         for (int i = 0; i < members.size(); i++) {
             if (members.get(i).getId()==member.getId()) {
                 index=i;
                 break;
             }
        }
        if(num_of_members < 11 || class_id == members.get(index).getClass_id())
        {
            // Decrement number of member of class that user leave it.
            for (int i = 0; i < Classes.size(); i++) {
                if (Classes.get(i).getClass_id() == members.get(index).getClass_id()) {
                    Classes.get(i).decrement_num_of_members();
                    break;
                }
            }

            // Increment number of member of class that user join it.
            for (int i = 0; i < Classes.size(); i++) {
                 if (Classes.get(i).getClass_id() == class_id) {
                    Classes.get(i).increment_num_of_members();
                    break;
                }
            }

            // Reblace old data with updated data.
            this.edit(m, index, member);
            for (int i = 0; i < members.size(); i++) {
               members.set(i, (Member)m.get(i));
            }

            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public void delete(ArrayList<Person> members, int index) {
  
       members.remove(index);
        
    }
    public static void delete(ArrayList<Member> members, int id,ArrayList<Class> classes) {
        Member temp =new Member();
        ArrayList<Person> m = new ArrayList<>();

        for (int i = 0; i < members.size(); i++) {
           m.add(members.get(i));
        }
        int index = -1;
        for (int i = 0; i < members.size(); i++) {
            if(id == members.get(i).getId())
            {
            index = i;
            break;
            } 
        }
        
        temp.delete(m, index);
        
        // Decrement number of member of class that user was on it. 
        for (int i = 0; i < classes.size(); i++) {
         if (classes.get(i).getClass_id()== members.get(index).getClass_id()) {
             classes.get(i).decrement_num_of_members();
             break;
         }
        }
        
        members.clear();
        for (int j = 0; j < m.size(); j++) {
           members.add((Member)m.get(j));
        }
    }
    
}
