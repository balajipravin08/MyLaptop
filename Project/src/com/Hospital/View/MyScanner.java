package com.Hospital.View;
import java.util.Scanner;
public final class MyScanner{
	private MyScanner(){}
	private static Scanner sc = null;
	public static Scanner getScannerInstance(){
		if(sc==null) sc = new Scanner(System.in);
		return sc;
	}
	public static void close(){
		if(sc!=null){
			try {
				sc.close();
			}catch (Exception e){
				System.out.println("Scanner Closing Failed");
			}
		}
	}
}
