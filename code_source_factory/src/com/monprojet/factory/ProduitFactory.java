package com.monprojet.factory;

import com.monprojet.produit.Produit;
import com.monprojet.produit.ProduitA;
import com.monprojet.produit.ProduitB;
import com.monprojet.produit.ProduitC;

// Factory pour créer des produits
public class ProduitFactory {
    
    // Méthode pour créer un produit en fonction du type passé en paramètre
    public static Produit creerProduit(String type) {
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

