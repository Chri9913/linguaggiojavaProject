package com.mycompany.metodi;

import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
/*
        pTx("ciao");
        pTx("tutto bene?");
        String nome = "Christian";
        String msg = "eccoci arrivati " + nome;
        pTx(msg);
        pTx("boia faus");
        */
        /*
        int quanti = (int) chiediNumero("inserisci numero di righe nell'elenco");

        //METODI RICHIAMATI
        stampaNumeri(quanti);
        float prezzo = chiediNumero("inserisci il prezzo del prodotto");
        float sconto = chiediNumero("inserisci sconto");
        float scontato = scontaPrezzo(prezzo, sconto);

        System.out.println("€" + scontato);

        int totale = calcoloSomma(22, 34);
        System.out.println(totale);

        float totdivisione = calcoloDivisione(10, 5);
        System.out.println(totdivisione);
     */
        /*
        float valore= scorporoIva(444000, 22);
        String testo= "prezzo scorporato= " + valore;
        pTx(testo);
        */
        /*
        float prezzo= chiediNumero("inseirsci il prezzo");
        float iva= chiediNumero("inserisci il valore iva");
        float valore= scorporoIva(prezzo, iva);
        String testo = " prezzo scorporato= " + valore;
        pTx(testo);
        */
        
        float prezzo= chiediNumero("inseirsci il prezzo");
        float iva= chiediNumero("inserisci il valore iva");
        float valore= scorporoIva(prezzo, iva);
        String testo = " prezzo scorporato= " + valore;
        pTx(testo);
        String saluto= ("grazie per aver comprato da noi, le auguriamo una buona giornata!");
        pTx (saluto);
    }
    
    static float scorporoIva(float prezzo, float iva) {
        
        float ris=0;
        ris= (prezzo*100)/(100+iva);
        return ris;
        
    }
    
    static void pTx(String testo) {
        System.out.println();
        System.out.println(testo);
    }
    

    static float calcoloDivisione(float dividendo, float divisore) {

        float ris = 0;

        if (divisore == 0) {
            ris = -9999;
        } else {
            ris = dividendo / divisore;
        }

        return ris;

    }

    static int calcoloSomma(int valore1, int valore2) {

        int ris = 0;

        ris = valore1 + valore2;

        return ris;

    }

    static float scontaPrezzo(float prezzo, float sconto) {
        float ris = 0;

        /*
        100 e 20
        100*20/100---> 20 da togliere calcolo la percentuale
        100-20--->80 da restituire  prezzo scontato
        togliere= prezzo*sconto/100
        finale=prezzo-togliere
         */
        ris = prezzo - (prezzo * sconto / 100);

        return ris;

    }

    static void stampaNumeri(int quanti) {

        for (int i = 1; i <= quanti; i++) {
            String inizio = "";
            if (i < 10) {
                inizio = "   ";
            } else if (i < 100) {
                inizio = "  ";
            }
            if (i < 1000) {
                inizio = " ";
            }
            String barra = ") ______________________________";
            String rigafinale = inizio + i + barra;

            System.out.println(rigafinale);

        }

    }

    static float chiediNumero(String testodomanda) {

        float ris = 0;

        String txnumero = JOptionPane.showInputDialog(testodomanda);
        ris = Float.parseFloat(txnumero);

        return ris;

    }
    
}

    
