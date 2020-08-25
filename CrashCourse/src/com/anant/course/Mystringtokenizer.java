package com.anant.course;

import java.util.StringTokenizer;

public class Mystringtokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "country=india;capital=delhi;country=japan;city=tokyo;";
		StringTokenizer st = new StringTokenizer(s,";=");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}

}
