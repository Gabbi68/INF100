package oppgaver;

public class FirstProgram {

	public static void main(String[] args) {
		
		int bilNummer = 20763; //Setter verdien som egentlig brukeren bør taste inn selv
		int manedNummer = bilNummer%10; //Modulo 10 gir oss resten som er det siste tallet (her = 3)
		
		//Fordi vi somregel ikke forstår noe av tall er mennesker mer mottakelige for skrift og navn
		//Derfor bruker vi en array her for å definere og hente månedene
		
		//Legg merke til at mnd = 0 er oktober og 9 er november slik at det stemmer med systemet vegvesenet bruker
		
		String[] maned = {"Oktober", "Januar", "Februar", "Mars", "April", "Mai", "Juni", "Juli", "August", "September"};
		
		System.out.println(maned[(manedNummer)]);
	}

}
