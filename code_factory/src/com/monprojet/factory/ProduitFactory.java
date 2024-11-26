package com.monprojet.factory;

import com.monprojet.factory.Factory;
import com.monprojet.produit.Produit;
import com.monprojet.produit.ProduitA;
import com.monprojet.produit.ProduitB;
import com.monprojet.produit.ProduitC;

public class ProduitFactory extends Factory {
    
    public Produit creerProduit(String type) {
        switch (type) {
            case "ProduitA":
                return new ProduitA();
            case "ProduitB":
                return new ProduitB();
            case "ProduitC":
                return new ProduitC();
            default:
                throw new IllegalArgumentException("Type de produit inconnu");
        }
    }
}
