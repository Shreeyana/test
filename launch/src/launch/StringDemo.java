package launch;

public class StringDemo {
	public static void main(String[] args) { 
		/*
		 * String Literols : string constant pool ma store garxa
		 * Shreeyana vanako object ho
		 * str is just reference for  the text shreeyana
		 */
		String str="Shreeyana";
		
		/*
		 *  heap memmory ma store garxa
		 * kadel vanako object ho
		 * str1 is just reference for  the text shreeyana
		 */
		
		String str1= new String ("Kadel");
		String str2 = str+str1;
		System.out.println("Full Name:" +str2);
		System.out.println(str.length());
		System.out.println(str.concat(" She is Computer Engineering Girl"));
	}
}
