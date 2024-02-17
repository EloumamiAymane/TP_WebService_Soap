package org.example;

import proxy.BanqueService;
import proxy.Compte;
import proxy.IBanqueService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BanqueService proxy=new IBanqueService().getBanqueServicePort();
        System.out.println("*******************************");
        System.out.println(proxy.conversionEuroToDh(100));
        System.out.println("*******************************");
        System.out.println("code :"+proxy.getCompte(1).getCode());
        System.out.println("DateCreation: " +proxy.getCompte(1).getDateCreation());
        System.out.println("Montant:"+proxy.getCompte(1).getMontant());
        List<Compte> compteList=proxy.listComptes();
        System.out.println("*******************************");
        compteList.forEach(compte -> {System.out.println("code :"+compte.getCode());
                                      System.out.println("montant:"+compte.getMontant());
                                       System.out.println("date Creation:"+compte.getDateCreation());
                });

    }
}
