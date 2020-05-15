/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpaapps;

import java.io.Serializable;
//import javax.persistence.Entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;


/**
 *
 * @author jit
 */
@Entity
@NamedQueries({
    @NamedQuery(name="StudentQueryFindALL", query="SELECT s FROM Student s"),
    @NamedQuery(name="StudentQueryFindByID", query="SELECT s FROM Student s WHERE s.id= :id ")
})
public class Student implements Serializable {
     @Id
    private int id;
    private String name;
    private  String major;
    private double grade;

    public Student(){
        
    }
    
  

    @Override
    public String toString() {
        return String.format("%-5s %-5s %-5s %-5s", id ,name ,major ,grade);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int id, String name, String major, double grade) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

   
    
    
}
