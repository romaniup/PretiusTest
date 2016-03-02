import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		double suma=0;
		String wynik = "";
		StringBuilder str = new StringBuilder(wynik);
		String tab[] = null ;
		String tab2[]=null;
		
		System.out.println("Podaj sciezke do pliku z danymi");
		Scanner wej = new Scanner(System.in);
		String arg = wej.nextLine();
		
		Scanner odczyt = new Scanner(new File(arg));
		int licz=0;
		for(int i=0;arg!=null;i++){
			try{
		String in = odczyt.nextLine();
		str.append(in);
		//System.out.println(in);
			}catch(NoSuchElementException e){
				break;
			}
			licz++;
		}
		//System.out.println(licz);liczba linii
		//for(int i=0;i<tab.length;i++)
		//System.out.println(tab[i]);
		wynik = str.toString();
		//System.out.println(wynik);
		tab = wynik.split("@");
		for(int i=0;i<tab.length;i++) {
			//System.out.println(tab[i]);
			if(tab[i].startsWith("amount")){
				String part = tab[i];
				part=part.substring(7);
				tab2=part.split("PLN");
				for(int j=0;j<tab2.length;j++) {
					System.out.println(tab2[j]);
				String liczba = tab2[j];
				liczba = liczba.replace(',','.');
				double liczba2 = Double.parseDouble(liczba);
				suma+=liczba2;
				}
				
			}
		}
		System.out.println("Suma to "+suma+"PLN");
	}

}
