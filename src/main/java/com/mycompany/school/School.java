/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.school;

/**
 *
 * @author User
 */
public class School {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    Taksi t1 = new Taksi("01","Ergastirio01");
    Taksi t2 = new Taksi("02","Ergastirio02");
    Taksi t3 = new Taksi("03","Ergastirio03");
    Taksi t4 = new Taksi("04","Ergastirio04");
    Taksi t5 = new Taksi("05","Ergastirio05");
    Mathima m1 = new Mathima("001","Φυσική",t1);
    Mathima m2 = new Mathima("002","Χημεία",t2);
    Mathima m3 = new Mathima("003","Pascal",t3);
    Mathima m4 = new Mathima("004","PHP",t4);
    Mathima m5 = new Mathima ( "005","OpenGL",t5);
    Kathigitis k1 = new Kathigitis("Giorgos","Gewrgioy",1538 , m1);
    Kathigitis k2 = new Kathigitis("Dimitris","Gewrgioy",1522, m2);
    Kathigitis k3 = new Kathigitis("John","Gewrgioy",43234, m3);
    Kathigitis k4 = new Kathigitis("MewMew","Gewrgioy",53728, m4);
    Kathigitis k5 = new Kathigitis("Fluffy","Gewrgioy",483274, m5);
    
    Mathima[] mathimata = new Mathima[5];
  
}

