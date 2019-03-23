
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

class Alpha {
	
	Alpha() throws ClassNotFoundException, SQLException {
		long start_time_alpha = System.currentTimeMillis();
//VACANCY
		String[] address = new String[21];
	
		address[0] = "https://hh.ru/search/vacancy?text=Java&only_with_salary=false&specialization=1.221&area=1002&enable_snippets=true&clusters=true&no_magic=true&salary=&from=suggest_post";
		address[1] = "https://hh.ru/search/vacancy?text=C%2B%2B&only_with_salary=false&specialization=1.221&area=1002&enable_snippets=true&clusters=true&no_magic=true&salary=&from=suggest_post";
		address[2] = "https://hh.ru/search/vacancy?text=C%23&only_with_salary=false&clusters=true&area=1002&specialization=1.221&no_magic=true&enable_snippets=true&salary=&from=suggest_post";
		address[3] = "https://hh.ru/search/vacancy?text=Swift&only_with_salary=false&clusters=true&area=1002&specialization=1.221&no_magic=true&enable_snippets=true&salary=&from=suggest_post";
		address[4] = "https://hh.ru/search/vacancy?text=Python&only_with_salary=false&clusters=true&area=1002&specialization=1.221&no_magic=true&enable_snippets=true&salary=&from=suggest_post";
		address[5] = "https://hh.ru/search/vacancy?text=PHP&only_with_salary=false&clusters=true&area=1002&specialization=1.221&no_magic=true&enable_snippets=true&salary=&from=suggest_post";
		address[6] = "https://hh.ru/search/vacancy?text=Java+junior&only_with_salary=false&specialization=1.221&area=1002&enable_snippets=true&clusters=true&no_magic=true&salary=&from=suggest_post";
		
		address[7] = "https://hh.ru/search/vacancy?text=Java&only_with_salary=false&specialization=1.221&area=1&enable_snippets=true&clusters=true&no_magic=true&salary=&from=suggest_post";
		address[8] = "https://hh.ru/search/vacancy?text=C%2B%2B&only_with_salary=false&specialization=1.221&area=1&enable_snippets=true&clusters=true&no_magic=true&salary=&from=suggest_post";
		address[9] = "https://hh.ru/search/vacancy?text=C%23&only_with_salary=false&clusters=true&area=1&specialization=1.221&no_magic=true&enable_snippets=true&salary=&from=suggest_post";
		address[10] = "https://hh.ru/search/vacancy?text=Swift&only_with_salary=false&clusters=true&area=1&specialization=1.221&no_magic=true&enable_snippets=true&salary=&from=suggest_post";
		address[11] = "https://hh.ru/search/vacancy?text=Python&only_with_salary=false&clusters=true&area=1&specialization=1.221&no_magic=true&enable_snippets=true&salary=&from=suggest_post";
		address[12] = "https://hh.ru/search/vacancy?text=PHP&only_with_salary=false&clusters=true&area=1&specialization=1.221&no_magic=true&enable_snippets=true&salary=&from=suggest_post";		
		address[13] = "https://hh.ru/search/vacancy?text=Java+junior&only_with_salary=false&specialization=1.221&area=1&enable_snippets=true&clusters=true&no_magic=true&salary=&from=suggest_post";
		
		address[14] = "https://hh.ru/search/vacancy?text=Java&only_with_salary=false&specialization=1.221&area=2&enable_snippets=true&clusters=true&no_magic=true&salary=&from=suggest_post";
		address[15] = "https://hh.ru/search/vacancy?text=C%2B%2B&only_with_salary=false&specialization=1.221&area=2&enable_snippets=true&clusters=true&no_magic=true&salary=&from=suggest_post";
		address[16] = "https://hh.ru/search/vacancy?text=C%23&only_with_salary=false&clusters=true&area=2&specialization=1.221&no_magic=true&enable_snippets=true&salary=&from=suggest_post";
		address[17] = "https://hh.ru/search/vacancy?text=Swift&only_with_salary=false&clusters=true&area=2&specialization=1.221&no_magic=true&enable_snippets=true&salary=&from=suggest_post";
		address[18] = "https://hh.ru/search/vacancy?text=Python&only_with_salary=false&clusters=true&area=2&specialization=1.221&no_magic=true&enable_snippets=true&salary=&from=suggest_post";
		address[19] = "https://hh.ru/search/vacancy?text=PHP&only_with_salary=false&clusters=true&area=2&specialization=1.221&no_magic=true&enable_snippets=true&salary=&from=suggest_post";
		address[20] = "https://hh.ru/search/vacancy?text=Java+junior&only_with_salary=false&specialization=1.221&area=2&enable_snippets=true&clusters=true&no_magic=true&salary=&from=suggest_post";
		
//RESULT for writing to db
		String[] value = new String[21];
			for(int i = 0; i < address.length; i++) {
				value[i] = extract(search_v_vacancyes(web(address[i])));
			}
		System.out.println(System.currentTimeMillis() - start_time_alpha);
		
//RESUME
/////////////////////////////////////////////////////////////////////////////////////////////////
		String[] address_r = new String[21];
		
		address_r[0] = "https://hh.ru/search/resume?text=Java&logic=normal&pos=full_text&exp_period=all_time&specialization=1.221&area=1002&relocation=living_or_relocation&salary_from=&salary_to=&currency_code=RUR&education=none&age_from=&age_to=&gender=unknown&order_by=publication_time&search_period=0&items_on_page=20&from=suggest_post";
		address_r[1] = "https://hh.ru/search/resume?text=C%2B%2B&clusters=true&exp_period=all_time&logic=normal&pos=full_text&order_by=publication_time&specialization=1.221&area=1002&clusters=true&from=suggest_post";
		address_r[2] = "https://hh.ru/search/resume?text=C%23&clusters=true&exp_period=all_time&logic=normal&pos=full_text&clusters=true&area=1002&specialization=1.221&order_by=publication_time&no_magic=false&from=suggest_post";
		address_r[3] = "https://hh.ru/search/resume?text=SWIFT&clusters=true&exp_period=all_time&logic=normal&pos=full_text&clusters=true&area=1002&specialization=1.221&order_by=publication_time&no_magic=false&from=suggest_post";
		address_r[4] = "https://hh.ru/search/resume?text=Python&clusters=true&exp_period=all_time&logic=normal&pos=full_text&clusters=true&area=1002&specialization=1.221&order_by=publication_time&no_magic=false&from=suggest_post";
		address_r[5] = "https://hh.ru/search/resume?text=PHP&clusters=true&exp_period=all_time&logic=normal&pos=full_text&clusters=true&area=1002&specialization=1.221&order_by=publication_time&no_magic=false";		
		address_r[6] = "https://hh.ru/search/resume?text=Java+Junior&logic=normal&pos=full_text&exp_period=all_time&specialization=1.221&area=1002&relocation=living_or_relocation&salary_from=&salary_to=&currency_code=RUR&education=none&age_from=&age_to=&gender=unknown&order_by=publication_time&search_period=0&items_on_page=20&from=suggest_post";
			
		address_r[7] = "https://hh.ru/search/resume?text=Java&logic=normal&pos=full_text&exp_period=all_time&specialization=1.221&area=1&relocation=living_or_relocation&salary_from=&salary_to=&currency_code=RUR&education=none&age_from=&age_to=&gender=unknown&order_by=publication_time&search_period=0&items_on_page=20&from=suggest_post";
		address_r[8] = "https://hh.ru/search/resume?text=C%2B%2B&clusters=true&exp_period=all_time&logic=normal&pos=full_text&order_by=publication_time&specialization=1.221&area=1&clusters=true&from=suggest_post";
		address_r[9] = "https://hh.ru/search/resume?text=C%23&clusters=true&exp_period=all_time&logic=normal&pos=full_text&clusters=true&area=1&specialization=1.221&order_by=publication_time&no_magic=false&from=suggest_post";
		address_r[10] = "https://hh.ru/search/resume?text=SWIFT&clusters=true&exp_period=all_time&logic=normal&pos=full_text&clusters=true&area=1&specialization=1.221&order_by=publication_time&no_magic=false&from=suggest_post";
		address_r[11] = "https://hh.ru/search/resume?text=Python&clusters=true&exp_period=all_time&logic=normal&pos=full_text&clusters=true&area=1&specialization=1.221&order_by=publication_time&no_magic=false&from=suggest_post";
		address_r[12] = "https://hh.ru/search/resume?text=PHP&clusters=true&exp_period=all_time&logic=normal&pos=full_text&clusters=true&area=1&specialization=1.221&order_by=publication_time&no_magic=false&from=suggest_post";
		address_r[13] = "https://hh.ru/search/resume?text=Java+Junior&logic=normal&pos=full_text&exp_period=all_time&specialization=1.221&area=1&relocation=living_or_relocation&salary_from=&salary_to=&currency_code=RUR&education=none&age_from=&age_to=&gender=unknown&order_by=publication_time&search_period=0&items_on_page=20&from=suggest_post";
		
		address_r[14] = "https://hh.ru/search/resume?text=Java&logic=normal&pos=full_text&exp_period=all_time&specialization=1.221&area=2&relocation=living_or_relocation&salary_from=&salary_to=&currency_code=RUR&education=none&age_from=&age_to=&gender=unknown&order_by=publication_time&search_period=0&items_on_page=20&from=suggest_post";
		address_r[15] = "https://hh.ru/search/resume?text=C%2B%2B&clusters=true&exp_period=all_time&logic=normal&pos=full_text&order_by=publication_time&specialization=1.221&area=2&clusters=true&from=suggest_post";
		address_r[16] = "https://hh.ru/search/resume?text=C%23&clusters=true&exp_period=all_time&logic=normal&pos=full_text&clusters=true&area=2&specialization=1.221&order_by=publication_time&no_magic=false&from=suggest_post";
		address_r[17] = "https://hh.ru/search/resume?text=SWIFT&clusters=true&exp_period=all_time&logic=normal&pos=full_text&clusters=true&area=2&specialization=1.221&order_by=publication_time&no_magic=false&from=suggest_post";
		address_r[18] = "https://hh.ru/search/resume?text=Python&clusters=true&exp_period=all_time&logic=normal&pos=full_text&clusters=true&area=2&specialization=1.221&order_by=publication_time&no_magic=false&from=suggest_post";
		address_r[19] = "https://hh.ru/search/resume?text=PHP&clusters=true&exp_period=all_time&logic=normal&pos=full_text&clusters=true&area=2&specialization=1.221&order_by=publication_time&no_magic=false&from=suggest_post";		
		address_r[20] = "https://hh.ru/search/resume?text=Java+Junior&logic=normal&pos=full_text&exp_period=all_time&specialization=1.221&area=2&relocation=living_or_relocation&salary_from=&salary_to=&currency_code=RUR&education=none&age_from=&age_to=&gender=unknown&order_by=publication_time&search_period=0&items_on_page=20&from=suggest_post";
		
//Resul for write to data bases
		String[] value_r = new String[21];
			for(int i = 0; i < address_r.length; i++) {
				value_r[i] = extract(search_v_resumes(web(address_r[i])));
			}
			
//	////////////////////////////////////////////////////////////////////////////////////////////

		System.out.println();
		System.out.println("*********************************************************************");
		System.out.println();
		System.out.println("VACANCY");
		System.out.println("Minsk, Java: " + value[0] + ", C++: " + value[1] + ", C#: " + value[2] + ", Swift: " + value[3] + ", Python: " + value[4] + ", PHP: " + value[5] + ", Java junior: " + value[6]);
		System.out.println("Moscow, Java: " + value[7] + ", C++: " + value[8] + ", C#: " + value[9] + ", Swift: " + value[10] + ", Python: " + value[11] + ", PHP: " + value[12] + ", Java junior: " + value[13]);
		System.out.println("S. Petersburg, Java: " + value[14] + ", C++: " + value[15] + ", C#: " + value[16] + ", Swift: " + value[17] + ", Python: " + value[18] + ", PHP: " + value[19] + ", Java junior: " + value[20]);
		
		System.out.println("-------------------------------");
		
		System.out.println("RESUME");
		System.out.println("Minsk, Java: " + value_r[0] + ", C++: " + value_r[1] + ", C#: " + value_r[2] + ", Swift: " + value_r[3] + ", Python: " + value_r[4] + ", PHP: " + value_r[5] + ", Java junior: " + value_r[6]);
		System.out.println("Moscow, Java: " + value_r[7] + ", C++: " + value_r[8] + ", C#: " + value_r[9] + ", Swift: " + value_r[10] + ", Python: " + value_r[11] + ", PHP: " + value_r[12] + ", Java junior: " + value_r[13]);
		System.out.println("S. Petersburg, Java: " + value_r[14] + ", C++: " + value_r[15] + ", C#: " + value_r[16] + ", Swift: " + value_r[17] + ", Python: " + value_r[18] + ", PHP: " + value_r[19] + ", Java junior: " + value_r[20]);
		System.out.println();
		System.out.println("*********************************************************************");
		System.out.println();
//=================================================================================================
		write_db(value, value_r);		
	}

	private String web(String address) {
		Document doc = null;
			try {
				doc = Jsoup.connect(address).get();
			} catch (IOException e) {
				e.printStackTrace();
			}

			String web_text = doc.text(); //Исходный текст
				return web_text;
	}
	
	private String search_v_vacancyes(String s){
		char[] mass = s.toCharArray();
			s = "";
		
		for(int i = 0; i < mass.length; i++){
			if(mass[i] == 'д' && mass[i+1] == 'р' && mass[i+2] == 'о' && mass[i+3] == 'б' && mass[i+4] == 'н' && mass[i+5] == 'е' && mass[i+6] == 'е'){
				s = "" + mass[i+7] + mass[i+8] + mass[i+9] + mass[i+10] + mass[i+11]+ mass[i+12];			
			}
		}
			return s;
	}
	
	private String search_v_resumes(String s){
		char[] mass = s.toCharArray();
		s = "";
		
		for(int i = 0; i < mass.length; i++){
			if(mass[i] == 'Н' && mass[i+1] == 'а' && mass[i+2] == 'й' && mass[i+3] == 'д' && mass[i+4] == 'е' && mass[i+5] == 'н' && mass[i+6] == 'о'){
				s = "" + mass[i+7] + mass[i+8] + mass[i+9] + mass[i+10] + mass[i+11]+ mass[i+12] + mass[i+13] + mass[i+14] + mass[i+15] + mass[i+16];
			}
		}
			return s;
	}
	
	private String extract(String s) {
		char[] array = s.toCharArray();
			s = "";
			
				for(int i = 0; i < array.length; i++) {
					if(Character.isDigit(array[i])) {
						s += array[i];		
					}
				}
	System.out.println("value: " + s + " ...is extract");
					return s;
		}
	private void  write_db(String[] s, String[] s2) throws ClassNotFoundException, SQLException {
		Data_base.Conn();
		Data_base.CreateDB();
		Data_base.WriteDB(s, s2);	
	}
	
}