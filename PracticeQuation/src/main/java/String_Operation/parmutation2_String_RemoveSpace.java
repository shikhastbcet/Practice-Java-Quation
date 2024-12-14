package String_Operation;

public class parmutation2_String_RemoveSpace{

		public static void main(String[] args) {
	String s="ABC";
	permute(0,s);
		}
	public static String swap(String s,int a,int b)
	{
		char ch[]=s.toCharArray();
		char p=ch[a];
		ch[a]=ch[b];
		ch[b]=p;
		return String.valueOf(ch);
	}
	public static void permute(int index,String s)
	{
		if(index==s.length()-1)
		{
			System.out.println(s);
			return;
		}
		for(int i=0;i<s.length();i++)
		{
			s=swap(s,i,index);
			permute(index+1,s);
			s=swap(s,i,index);    
			
			
		}
	}}


//=====================================================================================
//RemoveSpace
//=====================================================================================
// class RemoveSpace {
//
//	public static void main(String[] args) {
//
//				String str="This is Shikha";
//		//		\s used for find white space in string
//				System.out.println(str.replace("\s",""));
//			}
//}
