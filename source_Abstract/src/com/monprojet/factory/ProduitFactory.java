package com.monprojet.factory;

import com.monprojet.produit.Produit;
import com.monprojet.produit.ProduitCategorie1;
import com.monprojet.produit.ProduitCategorie2;
import com.monprojet.produit.ProduitType1;
import com.monprojet.produit.ProduitType2;

// Factory principale qui crée des produits en fonction de leur type et catégorie
public class ProduitFactory extends AbstractFactory {
    
    @Override
    public Produit creerProduit(String typeProduit, String categorie) {
        if (typeProduit.equals("Type1")) {
            if (categorie.equals("Categorie1")) {
                return new ProduitCategorie1(); // Produit de catégorie 1 pour le type 1
            } else if (categorie.equals("Categorie2")) {
                return new ProduitCategorie2(); // Produit de catégorie 2 pour le type 1
            }
        } else if (typeProduit.equals("Type2")) {
            if (categorie.equals("Categorie1")) {
                return new ProduitCategorie1(); // Produit de catégorie 1 pour le type 2
            } else if (categorie.equals("Categorie2")) {
                return new ProduitCategorie2(); // Produit de catégorie 2 pour le type 2
            }
        }
        
        throw new IllegalArgumentException("Produit ou catégorie inconnu");
    }
}
