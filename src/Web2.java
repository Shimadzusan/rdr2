

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

// THIS JAVA CLASS WORK WITH RESUME FROM HH.RU

public class Web2 {
	
	public static String result;
	public static String symb;
	public static String s10;
	static public int a;
	//Извлечение текста по URL
	
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
		}
		
		public static void search(){
			
			char[] mass = result.toCharArray();
			String s1 = "";
			
			for(int i = 0; i < mass.length; i++){
				//катель с - ***
				
					if(mass[i] == 'а' && mass[i+1] == 'к' && mass[i+2] == ' ' && mass[i+3] == 'с' && mass[i+4] == 'д' && mass[i+5] == 'е' && mass[i+6] == 'л'){
						s1 = "" + mass[i] + mass[i+1] + mass[i+2] + mass[i+3] + mass[i+4]+ mass[i-14] + mass[i-13] + mass[i-12] + mass[i-11] + mass[i-10] + mass[i-9] + mass[i-8] + mass[i-7];
					}
				}
			//System.out.println(s1);
			//result = "";//обнкление переменной, иначе происходит накопление значения в методе work
//System.out.println(s1);
			//нашли кусок интересующего нас текста и извлекли его присвоив некоторой переменной String
			String[] text20 = s1.split(" "); //УДАЛЕНИЕ ПРОБЕЛОВ
			String ss = "";
			for(int i = 0; i < text20.length; i++){
				//System.out.println(text20[i]);
				ss = ss + text20[i];
				
			}
			//System.out.println(ss);
			symb = ss;
			
			char[] text30 = s1.toCharArray();
			//
			ArrayList list = new ArrayList();
			
			for(int i = 0; i < text30.length; i++) {
				if(Character.isDigit(text30[i])){
					//System.out.println(text30[i]);
				char c = text30[i];
				
				list.add(c);
				}
				
			}
			String list2 = "";
			for(int i = 0; i < list.size(); i++) {
				char b = (Character) list.get(i);
				list2 = list2 + b;
				
			}
			System.out.println("value: " + list2 + " ...is extract");
			
			//LIST2 ЭТО ОЧИЩЕННЫЙ СТРИНГ!!!
			s10 = list2;
		}

}
