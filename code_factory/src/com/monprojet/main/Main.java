package com.monprojet.main;

import com.monprojet.factory.ProduitFactory;
import com.monprojet.produit.Produit;

public class Main {
    public static void main(String[] args) {
        ProduitFactory factory = new ProduitFactory();
        
        Produit produitA = factory.creerProduit("ProduitA");
        produitA.action();

        Produit produitB = factory.creerProduit("ProduitB");
        produitB.action();

        Produit produitC = factory.creerProduit("ProduitC");
        produitC.action();
    }
}
