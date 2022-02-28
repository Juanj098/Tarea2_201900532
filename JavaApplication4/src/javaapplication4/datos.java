/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author juanj
 */
public class datos {
    //atributos
    String nom;
    String ape;
    int pass;
    datos(String nom, int pass){
        this.nom = nom;
       // this.ape = ape;
        this.pass = pass;
    }
     
    public int getpass(){
        return pass;
    }
    public String getnom(){
        return nom;
    }
}
