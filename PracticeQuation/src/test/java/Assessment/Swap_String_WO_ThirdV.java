package Assessment;
public class Swap_String_WO_ThirdV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str="Shikha";
     String str1="Zombade";
     System.out.println("Befor swap "+str +"  "+str1);
     //Add first string into the second string
     str=str+str1;               //Shikha=Shikha+Zombade
     // subtract the string second string from first one and store it into the that second string veriable
     //we use string.length() subtract the string reffering string length from 0
     str1=str.substring(0,str.length()-str1.length());    //Zombade=str.ssubstring(0,5-12) it will take substring from 0 to 5     str1=Shikha
     str=str.substring(str1.length());                    //ShikhaZombade=str.ssubstring(5,12) it will take substring from  second string end that index     
     System.out.println("After swap "+str+"  "+str1);
     }

}
