package alberobindiricerca;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("F:\\Scuola\\Informatica\\Quarta\\AlberoBinarioDiRicerca\\AlberoBinDiRicerca\\src\\alberobindiricerca\\Name");
        Scanner scan = new Scanner(file);
        AlberoBinDiRicerca albero = new AlberoBinDiRicerca();
        while (scan.hasNextLine()) {
            albero.add(scan.nextLine());
        }
        if (albero.isEmpty()) {
            System.out.println(albero.visitaSimmetrica());
        }
        System.out.println(albero.leaves());
    }
}
