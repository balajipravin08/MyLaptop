package com.Hospital.View;
import java.util.Scanner;
public final class MyScanner{
	private MyScanner(){}
	private static Scanner sc = null;
	public static Scanner getScannerInstance(){
		if(sc==null) sc = new Scanner(System.in);
		return sc;
	}
}
