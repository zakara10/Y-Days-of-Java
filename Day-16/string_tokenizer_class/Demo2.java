package string_tokenizer_class;

import java.util.StringTokenizer;

public class Demo2 {
	public static void main(String[] args) {
		StringTokenizer s = new StringTokenizer("Hey,my,name,is,Roshan,Kumar");
		while(s.hasMoreElements()) {
		System.out.println(s.nextToken(","));
		}
	}
}
