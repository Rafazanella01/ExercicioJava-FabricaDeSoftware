package com.mycompany.herancaanimal;

/**
 *
 * @author rafaz
 */
public class Main {
    public static void main(String[] args){
        Cachorro ca = new Cachorro("Cachorro domestico", "Toby", false);
        
        ca.adotar();
        
        System.out.println(ca);
    }
}
