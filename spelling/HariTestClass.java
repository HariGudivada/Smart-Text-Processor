package spelling;

import java.util.ArrayList;

import com.sun.xml.internal.ws.message.stream.StreamAttachment;

public class HariTestClass {
	public class StringArray{
		public ArrayList<Character> arrayList;
		public StringArray(ArrayList<Character> array, int size) {
			arrayList = new ArrayList<Character>(size);
		}
		public String toString(){
			String result="";
			for(char c : arrayList){
				result = result+ Character.toString(c);
			}
			return result;
		}
	}
	public static void main(String[] args){
//		String input = "hari";
//		//StringBuilder stringBuilder = new StringBuilder();
//		//stringBuilder.setLength(input.length()+input.length());
//		//stringBuilder.setLength(9);
//		ArrayList<Character> stringArray = new ArrayList<Character>(input.length()+input.length()+1);
//		int count =0;
//		System.out.println(stringArray.toString());
//		System.out.println("hari"+ stringArray.size());
//		for(int i = 1 ; i < stringArray.size() ;i=i+2){
//			if(count < input.length()){
//				System.out.println("charAt: "+ count +","+input.charAt(count));
//				stringArray.set(i, input.charAt(count));
//			}
//			else{
//				break;
//			}
//			count++;
//		}
//		//stringBuilder.trimToSize();
//		
//		System.out.println("req: "+stringArray.toString().replaceAll("\\s+",""));
//		System.out.println("stringB length: "+stringArray.size()+", "+"sB data: "+stringArray.toString());
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("hari");
		System.out.println(stringBuilder.toString());
		stringBuilder.insert(1,"X");
		System.out.println(stringBuilder.toString());
		
	}
		
}
