package com.mycompany.herancaanimal;

/**
 *
 * @author rafaz
 */
public class Animal {
    private String tipo;
    private String nome;
    
    public Animal(String tipo, String nome)
    {
        this.tipo = tipo;
        this.nome = nome;
    }
    
    public String getTipo()
    {
        return tipo;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public String toString() 
    {
       return "Tipo: " + tipo + ", Nome: " + nome;
    }
    
    public void nomear(String nome)
    {
        this.nome = nome;
    }
    
    
}
