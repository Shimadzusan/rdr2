
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Web {
	public static String result;
	public static String symb;
	public static String s10;
	static public int a;

	public static void web(String s){
		
		Document doc = null;
		try {
			doc = Jsoup.connect(s).get();
		} catch (IOException e) {
			e.printStackTrace();
		}

			result = doc.text(); //result ---> Исходный текст

		//work();
		search();
		extract();
			
	}
	
	public static void search(){
		
		char[] mass = result.toCharArray();

		String s1 = "";
		
		for(int i = 0; i < mass.length; i++){
			
			//накарте307вакансий
			
				if(mass[i] == 'д' && mass[i+1] == 'р' && mass[i+2] == 'о' && mass[i+3] == 'б' && mass[i+4] == 'н' && mass[i+5] == 'е' && mass[i+6] == 'е'){
					
					s1 = "" + mass[i+7] + mass[i+8] + mass[i+9] + mass[i+10] + mass[i+11]+ mass[i+12];			
			}
			}
		//System.out.println(s1);
		//нашли кусок интересующего нас текста и извлекли его присвоив некоторой переменной String
		symb = s1;
		
	}
	
	public static void extract(){
		
		//из извлеченного куска, что нас интересует извлекается число и преобразуется в тип INT
		
		String s5 = "";
		
		char[] mass5 = symb.toCharArray();
		
		for(int i = 0; i < mass5.length; i++){
			
			
				if(Character.isDigit(mass5[i])){
					s5 = s5 + mass5[i];		
			}
		}
		
		int a = Integer.parseInt(s5);
		System.out.println("value: " + a + " ...is extract");
		s10 = s5;
		
	}

}
