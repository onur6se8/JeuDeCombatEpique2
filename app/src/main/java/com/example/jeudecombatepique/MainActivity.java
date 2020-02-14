package com.example.jeudecombatepique;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    private int joueur1;
    private int joueur2;

    private int personnage[] = {0,1,2};

    private int niveau;
    private int force;
    private int agilite;
    private int intelligence;

    private int attaqueBasique;
    private int attaqueSpeciale;

    private Scanner sc = new Scanner(System.in);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        System.out.println("Création du personnage du Joueur 1");

        System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)");

        joueur1 = sc.nextInt();


        System.out.println(joueur1);
    }
}
