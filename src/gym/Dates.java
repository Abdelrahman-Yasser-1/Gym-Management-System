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
public class Dates {
    
    int time;
    String day;

    public Dates() {
    }

    public Dates(String daye, int time) {
        this.time = time;
        this.day = daye;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getDaye() {
        return day;
    }

    public void setDaye(String day) {
        this.day = day;
    }
     
}
