package com.monprojet.main;

import com.monprojet.factory.ProduitFactory;
import com.monprojet.produit.Produit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner pour récupérer les choix de l'utilisateur
        Scanner scanner = new Scanner(System.in);
        
        // Demande du type de produit
        System.out.println("Entrez le type de produit (Type1 ou Type2) :");
        String typeProduit = scanner.nextLine();
        
        // Demande de la catégorie
        System.out.println("Entrez la catégorie du produit (Categorie1 ou Categorie2) :");
        String categorieProduit = scanner.nextLine();
        
        // Créer la factory et générer le produit
        ProduitFactory factory = new ProduitFactory();
        
        try {
            Produit produit = factory.creerProduit(typeProduit, categorieProduit);
            produit.action(); // Exécuter l'action associée au produit
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        scanner.close();
    }
}
