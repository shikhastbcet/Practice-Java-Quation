package String_Operation;

	public class Occurance_char2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int i,j,count=0;
			String str ="aaabbccdd";
			str=str.replace(" ","");
			char ch[]=str.toCharArray();
			for(i=0;i<ch.length;i++) {
				int count1=1;
				for(j=i+1;j<ch.length;j++) {
					if(ch[j]==ch[i]) {
						count1++;
						ch[j]='y';
					}
				}
				if(count1>0 && ch[i]!='y') {
					System.out.println(ch[i]+"  count "+count1);
				}
			}
			
//			for(i=0;i<ch.length;i++) {				
//				for(j=0;j<ch.length;j++) {
//					if(ch[j]==ch[i]) {
//						count++;
//						ch[j]='f';
//					}
//				}
//			if(count>0 &&ch[i]!='f'] ) {
//					System.out.println(ch[i]+"  count "+count);
//			}
//				count=0;
//			}
		}
		}
