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
    datos(String nom, String ape, int pass){
        this.nom = nom;
        this.ape = ape;
        this.pass = pass;
    }
     
    public int getpass(int pass){
        return pass;
    }
    public String getnom(){
        return nom;
    }
    public String getape(){
        return ape;
    }

    Object getpass() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
