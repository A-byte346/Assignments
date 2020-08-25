package com.anant.course;
import static java.io.StreamTokenizer.TT_EOF;
import static java.io.StreamTokenizer.TT_NUMBER;
import static java.io.StreamTokenizer.TT_WORD;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.util.Scanner;
public class Streamtokenizerex {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner str = new Scanner(System.in);
		String s = str.nextLine();
		StringReader sr = new StringReader(s);
		StreamTokenizer st = new StreamTokenizer(sr);
		try {
			while(st.nextToken()!= TT_EOF)
			{
				switch(st.ttype)
				{
				case TT_WORD :
					System.out.println("string value : "+st.sval);
				case TT_NUMBER :
					System.out.println("number : "+st.nval);
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
	}

}
