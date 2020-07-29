package com.anant.course;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class Mystreamtokenizer {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fin = new FileInputStream("line.txt");
		InputStreamReader ir = new InputStreamReader(fin);
		StreamTokenizer st = new StreamTokenizer(ir);
		st.eolIsSignificant(true);
		st.wordChars(32, 255);
		st.whitespaceChars(0, 32);
		int token = 0 ;
		int count = 0 ;
		while(true)
		{
			token = st.nextToken();
			if(token==StreamTokenizer.TT_EOF)
				break;
			if(token==StreamTokenizer.TT_NUMBER)
				System.out.println("number "+st.nval);
			if(token==StreamTokenizer.TT_WORD)
				System.out.println("word "+st.sval);
			count++;
		}
		System.out.println("no of words in a file "+(--count));
	}

}
