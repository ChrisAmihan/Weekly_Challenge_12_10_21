package com.challenges;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Averages{
	
	public static int arithmeticMean(int[] intArray) {
		
		int avg = 0;
		int sum = 0;
		
		for(int i = 0;i<intArray.length;i++) {
			sum += intArray[i];
		}
		
		avg = sum/intArray.length;
		
		return avg;
	}
	
	public static BigDecimal quadraticMean(int[] intArray, int precision) {
		
		double avg = 0;
		double sum = 0;
		
		for(int i=0;i<intArray.length;i++) {
			sum += intArray[i]*intArray[i];
		}
		
		avg = Math.sqrt(sum/intArray.length);
		
		BigDecimal bd = new BigDecimal(avg).setScale(precision,RoundingMode.HALF_UP);

		return bd;
	}
	
	public static BigDecimal harmonicMean(int[] intArray, int precision) {
		
		double avg = 0;
		double sum = 0;
		
		for(int i = 0;i<intArray.length;i++) {
			sum += (1.0/intArray[i]);
		}
		
		avg = 1.0/(sum/intArray.length);
		
		BigDecimal bd = new BigDecimal(avg).setScale(precision,RoundingMode.HALF_UP);

		return bd;
	}
	
	public static BigDecimal geometricMean(int[] intArray, int precision) {
		
		double avg;
		double product = 1;
		double num = intArray.length;
		
		for(int i = 0;i<intArray.length;i++) {
			product = product*intArray[i];
		}
		
		avg = Math.pow(product, (1.0/intArray.length));
		
		BigDecimal bd = new BigDecimal(avg).setScale(precision,RoundingMode.HALF_UP);
		
		return bd;
	}
	
}
