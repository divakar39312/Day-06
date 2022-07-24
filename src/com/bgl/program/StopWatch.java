package com.bgl.program;

import java.util.Scanner;

public class StopWatch {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		char start=sc.next().charAt(0);
		long starttimer=System.currentTimeMillis();
		System.out.println("Enter any char to stop");
		Scanner sc1=new Scanner(System.in);
		char stop=sc1.next().charAt(0);
		long stoptimer=System.currentTimeMillis();
		double elapsedTime=stoptimer-starttimer;
		System.out.println("Time elapsed "+elapsedTime/1000 +"seconds");
	}
}
