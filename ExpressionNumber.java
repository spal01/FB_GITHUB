package com.regexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;


public class ExpressionNumber {

	public static void main(String[] args) {
		// TODO Auto-generate
		ExpressionNumber  ob=new ExpressionNumber();
		//String number=ob.getNumber("xyz123");
		String number=ob.getNumber("xyz113");
		System.out.println("Number is " + number);
		
		
		try{
		int x=10/Integer.parseInt(number);
		System.out.println("Value of x is " +x);
		}
		catch(NumberFormatException nfe){
			System.out.println(nfe.getMessage());	
		}
		catch(ArithmeticException ae){
			System.out.println(ae.getMessage());
		}
	}
	
	public String getNumber(String line){
		
		String regularExpeassion="\\d+";
		
		//String regularExpeassion="\\d{{}}}+";
		
		try{
			Pattern pat=Pattern.compile(regularExpeassion);
			Matcher mat=pat.matcher(line);
			if(mat.find()){
				System.out.println("Number " + mat.group());
				return mat.group();
				
			}
			else
			{
				return "Number not found";
			}
			
			
		}
		catch(PatternSyntaxException pse){
			
			return pse.getMessage();
		}
		catch(NullPointerException npe){
			return npe.getMessage();
		}
		
		
		
		
	}

}
