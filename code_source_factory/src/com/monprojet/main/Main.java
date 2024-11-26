package com.monprojet.main;

import com.monprojet.factory.ProduitFactory;
import com.monprojet.produit.Produit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Demander à l'utilisateur quel type de produit il souhaite créer
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Entrez le type de produit à créer (ProduitA, ProduitB, ProduitC) :");
        String typeProduit = scanner.nextLine();
        
        // Utiliser la factory pour créer le produit correspondant
        try {
            Produit produit = ProduitFactory.creerProduit(typeProduit);
            produit.action(); // Exécuter l'action associée au produit
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Gestion d'erreur si le type est invalide
        }
        
        scanner.close();
    }
}

