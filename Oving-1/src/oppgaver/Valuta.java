package oppgaver;

public class Valuta {

 public static void main(String[] args) {

   double nok = 750.00;// <-- nok med små bokstaver
   final double KURS = 9.46; // <-- glemte å avslutte linje ";" endret også denne til final
   
   /*
    * Slike verdier som en kurs forandrer seg fra dag til dag
    * og bør heller lastes ned fra nettet før bruk...
    */
 
   double eur = nok/KURS;

   System.out.println("Med kurs " + KURS + " er " + nok + " kroner verdt " + eur +  " Euro"); // <-- Igjenn flere trykkfeil

 }
}
