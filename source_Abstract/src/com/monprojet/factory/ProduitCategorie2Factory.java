package com.monprojet.factory;

import com.monprojet.produit.Produit;
import com.monprojet.produit.ProduitCategorie1;
import com.monprojet.produit.ProduitType1;
import com.monprojet.produit.ProduitType2;

public class ProduitCategorie2Factory extends AbstractFactory {

    @Override
    public Produit creerProduit(String typeProduit, String categorie) {
        // Vérifie si la catégorie est "Categorie1" et crée un produit selon le type
        if (categorie.equals("Categorie1")) {
            if (typeProduit.equals("Type1")) {
                return new ProduitType1();  // Produit de type 1 pour catégorie 1
            } else if (typeProduit.equals("Type2")) {
                return new ProduitType2();  // Produit de type 2 pour catégorie 1
            }
        }
        throw new IllegalArgumentException("Catégorie ou type de produit incorrect pour Catégorie 1");
    }
}
