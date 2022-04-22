/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ug;

import frontend.BazaFrame;

/**
 *
 * @author mateu
 */
public class Starter {

    public static void main(String[] args) {
       // utworzyć obiekt z BazaFrame
        BazaFrame bf = new BazaFrame();
        // zmienić pasek tytułowy formatki
        bf.setTitle("Baza Danych Uczelni");
        // zmienić rozmiar na 640x480
        bf.setSize(886,503);
        //wyświetlić formatki
        bf.setVisible(true);
    }
    
}
