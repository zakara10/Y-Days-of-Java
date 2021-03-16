package string_tokenizer_class;
/*
 Let's see the simple example of StringTokenizer class 
 that tokenizes   a string  on the basis of whitespace
 */
import java.util.StringTokenizer;

public class Demo1 {
	public static void main(String[] args) {
		StringTokenizer s = new StringTokenizer("Hey ..... I like chicken very much !!!");
		while(s.hasMoreElements()) {
			System.out.println(s.nextElement());
		}
	}
}
