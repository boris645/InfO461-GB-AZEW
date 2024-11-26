package com.monprojet.factory;

import com.monprojet.produit.Produit;

public abstract class AbstractFactory {
    // Méthode abstraite pour créer un produit de type donné
    public abstract Produit creerProduit(String typeProduit, String categorie);
}
