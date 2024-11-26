package com.monprojet.factory;

import com.monprojet.produit.Produit;

public abstract class Factory {
    public abstract Produit creerProduit(String type);
}
