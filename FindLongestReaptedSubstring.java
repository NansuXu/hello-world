package myPackage;
import java.util.*;

public class FindLongestReaptedSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(fLRS("bananananananan"));
	}
	
	public static String fLRS(String s) {
		String longest = "";
		int res = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.substring(i).indexOf(s.charAt(i)) < 0) {
				continue;
			}
			for(int j = i + 1; j <= s.length(); j++) {
				String sub = s.substring(i,j);
				if(s.substring(i + 1).indexOf(sub) >= 0) {
					if(res < sub.length()) {
						res = sub.length();
						longest = sub;
					}
				}
			}
		}				
		return longest;
	}

}
