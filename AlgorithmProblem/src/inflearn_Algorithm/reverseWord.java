package inflearn_Algorithm;

import java.util.Scanner;

public class reverseWord {
	public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    String word = in.nextLine();
	    if(word instanceof String) {

	    	char[] arr = word.toCharArray();

	    	word = "";
	    	for(int i=arr.length-1; i>=0; i--) {
	    		word += arr[i];

	    	}
	    	System.out.println(word);
	    }else {
	    	System.out.println("");
	    }
}
}
