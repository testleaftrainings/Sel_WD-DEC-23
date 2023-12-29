package week2.day2;

public class LearnString {

	public static void main(String[] args) {
		// compare a two string by using == it will compare the memory alloction of the String.
		
		
		//String Literal
		String x = "Testleaf";
		String y = "Testleaf";
		System.out.println(x==y);
		
		//String instantiation
		String a = new String("Testleaf");
		String b = new String("Testleaf");
		System.out.println(a);
		System.out.println(b);
		System.out.println(a==b);
		System.out.println(x==a);
		String z = "testLeaf";
		int num = 1234;
		
		int xLen = x.length();
		System.err.println(xLen);// err --> error --> to any error in the runTime
		boolean equals = y.equals(b);
		
		System.out.println(equals);//Compare the  text value
		System.out.println(y==b);//Compare memory address.
		System.out.println("z.equals(a)----->  "+z.equals(a));
		System.out.println("z.equalsIgnoreCase(a)----->  "+z.equalsIgnoreCase(a));// compare the text without case sensitive
		System.out.println("x.contains(\"Leaf\")----> "+x.contains("Leaf"));// compare a partial text with case sensitive
		
		String lowerCase = a.toLowerCase();
		System.out.println(lowerCase);
		String upperCase = a.toUpperCase();
		System.out.println(upperCase);
		
		char[] charArray = a.toCharArray();
		System.out.println(charArray[0]);
		System.out.println(charArray[3]);
		System.out.println("a.charAt(5)------->"+a.charAt(5));
		String name = "     Gokul       ";
		System.out.println("name-------->"+name);
		String nameWithoutWhiteSpace = name.trim();// remove white space before and after the text
		System.out.println("nameWithoutWhiteSpace--->" + nameWithoutWhiteSpace);
		String n = "     Hello      World    ";
		String trim = n.trim();
		System.out.println(trim);
		String text = "Welcome@123";
		String replaceFirst = text.replaceFirst("[0-9]", "");
		System.out.println("replaceFirst----->" +replaceFirst);
		String textWithoutNum = text.replaceAll("[0-9]", "");
		System.out.println("textWithoutNum---------->" +textWithoutNum);
		String numOnly = text.replaceAll("[^0-9]","");
		System.out.println("numOnly---------> "+numOnly);
		
		String[] split = text.split("@");
		System.out.println("split.length------>"+split.length);
		System.out.println("split[0]------>"+split[0]);
		System.out.println("split[1]------>"+split[1]);
		
		String[] split2 = a.split("");
		for (int i = 0; i < split2.length; i++) {
			System.out.println("split2["+i+"]----->"+split2[i]);
		}
		
		System.out.println("text.substring(8)-------->"+text.substring(8));
		System.out.println("text.substring(0,8)-------->"+text.substring(0,8));
		
		char[] textChar = text.toCharArray();
		int eCount=0;
		for (int i = 0; i < textChar.length; i++) {
			if(textChar[i]=='e') {
				eCount++;
			}
		}
		System.out.println("Number of e present in the "+text+" is "+ eCount);
		
	}

}
