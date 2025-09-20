public class FirstnonRepeting {

	public static void main(String[] args) {
		String str ="prathamesh";
		char res=0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			int count=0;
			for(int j=0;j<str.length();j++) {
				if(ch == str.charAt(j)) {
					count++;
				}
			}
			if(count==1) {
				res=ch;
				break;
			}
		}
		if(res==0) {
			System.out.println("First Non-Repating Character In String : "+res);
		}else {
			System.out.println("No Any Character Repeated In String");
		}
	}

}

