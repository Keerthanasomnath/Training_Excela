package com.training.services;

public class StringService {

	public void stringEquals(String str1, String str2)
	{
		System.out.println("Is Values Same:="+str1.equals(str2));
		System.out.println("Are they pointing to same location:="+(str1==str2));
	}
	
	public void stringObjectEquals() {
		String ram = new String("Ram");
		String ramesh = new String("ram"); 
		
		
		String city = "CHENNAI";
		System.out.println(String.format("%s",city));
		
		System.out.println(String.format("%3$.4f, %2$.2f , %1$.2f", 100.456,200.4567,3000.78787878));
		
		System.out.println("Is Values Same:="+ram.equals(ramesh));
		System.out.println("Are they pointing to same location:="+(ram==ramesh));
	}
	
	public void usingTrim(String name) {
		System.out.println("Trim="+name.trim());
	}
	
	public void  lengthofString(String name) {
		System.out.println("String Length="+name.length());
	}
	
	public void removeSpaceofString(String name) {
		
//		String remove = usingTrirm(name); 
		System.out.println("Removed = "+name.trim().length());
	}
	public void usingSubString(String name) {
		System.out.println("SubString:"+name.substring(10));
		System.out.println(name.substring(5,14));
	}
	public void usingCharAtAndIndexof(String name) {
		System.out.println("Index position of k: "+name.indexOf("k"));
		System.out.println("CHarac At postition 3:="+name.charAt(4));
	}
	public void usingReplace(String name1, String name2) {
		System.out.println(name1.replace(".com", ".org"));
		System.out.println(name2.replace('c', 'm'));
	}
	public void usingConcat(String str1, String str2) {
		System.out.println("concate: "+(str1.concat(str2)));
		
		//String buillder is mutable can change 
		StringBuilder builder = new StringBuilder(str1);
		builder.append(str2);
		
		System.out.println(builder.toString());
	}
	public void usingCompareTo(String str1, String str2) {
		System.out.println("compared: "+(str1.compareTo(str2)));
	}
	public void usingStringFormat(String str1,double mark) {
		
		String frntString = String.format("%S",str1);
		System.out.println("formated: "+frntString);
		
		System.out.println(String.format("Mark %.2f",mark));
	}
	public void usingStringFormat(int mark) {
		System.out.println(String.format("Octal %o",mark));
		System.out.println(String.format("Hexa decimal %x",mark));
		
	}
	public void usingStringFormat(int mark1,int mark2) {
		System.out.println(String.format("Octal %1$o , %2$o",mark1, mark2));
		System.out.println(String.format("Hexa decimal %1$x , %2$x",mark1,mark2));
		
	}
	public void usingStringFormat(String str1,  String str2 ) {
		System.out.println(String.format(" %1$s , %2$S",str1, str2));

}
    public void usingStringFormat(long value) {
    	System.out.println(String.format("%+d",value));
    }
}
