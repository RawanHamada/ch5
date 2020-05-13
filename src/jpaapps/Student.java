/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpaapps;

import java.io.Serializable;
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
    private  String Major;
    private double Grade;

    public Student(){
        
    }
    
    public Student(int id, String name, String Major, double Grade) {
        this.id = id;
        this.name = name;
        this.Major = Major;
        this.Grade = Grade;
    }

    @Override
    public String toString() {
        return String.format("%-5s %-5s %-5s %-5s", id ,name ,Major ,Grade);
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

    public String getMajor() {
        return Major;
    }

    public void setMajor(String Major) {
        this.Major = Major;
    }

    public double getGrade() {
        return Grade;
    }

    public void setGrade(double Grade) {
        this.Grade = Grade;
    }
    
    
}
