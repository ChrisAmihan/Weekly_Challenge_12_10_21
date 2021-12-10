package com.challenges;

//Chris Amihan

import java.util.Arrays;

/*
 * Standard Tuning for a Guitar: 
 * (E)	329.63 Hz
 * (B)	246.94 Hz
 * (G)	196.00 Hz
 * (D)	146.83 Hz
 * (A)	110.00 Hz
 * (E)	82.41  Hz
 * 
 * If 1-2% low return >o
 * If more than 2% low return >>o
 * If 1-2% high return o<
 * If more than 2% high return o<<
 * If tuned return OK
 * If 0 is given return -
 * 
 * Example:
 * Input: [280, 246, 196, 148, 108, 0]
 * Output: [>>o, OK, OK, o<, o<, -]
*/
public class GuitarTuner {
	
	public static String[] Tuner(int[] frequencies) {
		
		//array that represents perfect tuning frequencies rounded to a whole number
		int[] perfect = {329, 246, 196, 146, 110, 82};
		//array that represents 2% lower frequencies
		int[] low = {(int) (329*.98), (int) (.98*246), (int) (.98*196), (int) (.98*146), (int) (.98*110), (int) (.98*82)};
		//array that represents 2% higher frequencies
		int[] high = {(int) (329*1.02), (int) (246*1.02), (int) (196.00*1.02), (int) (146.83*1.02), (int) (110.0*1.02), (int) (82.41*1.02)};
		//initializes a string array as the output to be displayed
		String[] output = new String[6];
		//loop through each index in the array and set the output index based on 6 different conditions
		for(int i = 0;i<frequencies.length;i++) {
			if(frequencies[i]==perfect[i]) {
				output[i]="OK";
			} else if(frequencies[i]==0){
				output[i]="-";
			} else if(frequencies[i]<perfect[i]&&frequencies[i]>low[i]){
				output[i]=">o";
			} else if(frequencies[i]<=low[i]) {
				output[i]=">>o";
			} else if(frequencies[i]>perfect[i]&&frequencies[i]<high[i]) {
				output[i]="o<";
			} else if(frequencies[i]>=high[i]) {
				output[i]="o<<";
			}
		}
		
		return output;
	}
	
}
