/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alberobindiricerca;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author matteo.pagano
 */
public class main {
	public static void main(String[] args) throws FileNotFoundException {
		AlberoBinDiRicerca albero = new AlberoBinDiRicerca();
		/*albero.add(4); albero.add(2); albero.add(9); albero.add(1); albero.add(3); albero.add(8); albero.add(10); albero.add(6); albero.add(5); albero.add(7);
		System.out.println(albero.visitaSimmetrica());
		System.out.println(albero.visitaAnticipata());
		System.out.println(albero.visitaDifferita());
		albero.search(10);*/
		albero.leggiDaFile("C:\\Users\\matteo.pagano.LAP.000\\Documents\\NetBeansProjects\\AlberoBinDiRicerca\\src\\alberobindiricerca\\Name");
		System.out.println(albero.visitaSimmetrica());
		
	}
}
