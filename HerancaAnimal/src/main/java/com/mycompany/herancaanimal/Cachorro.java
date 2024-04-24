package com.mycompany.herancaanimal;

/**
 *
 * @author rafaz
 */
public class Cachorro extends Animal {
    private boolean adotado;
    
    public Cachorro(String tipo, String nome, boolean adotado)
    {
         super(tipo, nome);
         this.adotado = adotado;
    }
    
    public void adotar()
    {
        this.adotado = true;
    }
    
    @Override
    public void nomear(String nome)
    {
        super.nomear(nome);
    }
    
    @Override
    public String toString()
    {
        return "Tipo: " + super.getTipo() + ", Nome: " + super.getNome() + ", Adotado: " + adotado;
    }
}
