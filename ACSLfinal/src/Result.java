import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {
    
    public static void main(String[] args) {
    	System.out.println(findDigitSum(100, 9, 88));
    }
    
    
    public static int findDigitSum(int num, int base, int start) {
        String[] nums = new String[num];
        
         
        
        int count = start;
        for(int i = 0; i < nums.length; i++){
            String temp = "" + count;
            
            if(temp.contains(""+base)){                  //helps to figure out when to reset
                count = reset(temp, ""+base);
            }
            
            nums[i] = count+"";
            System.out.println(nums[i]);
            count++;
        }   
        
        int sum = 0;
        
        //another for loop to find sum of digits
        for(int i = 0; i < nums.length; i++){
            String tempN = nums[i];
            for(int j = 0; j < tempN.length(); j++){
                sum+= Integer.parseInt(tempN.substring(j, j+1));
            }
        }
        
        return sum;
    }
    
    public static int reset(String num, String base){
    	
    	int ibad = num.indexOf(base);
    	int power = num.length()-num.indexOf(base);
    	
    	int baseint = Integer.parseInt(base);
    	int rNum = Integer.parseInt(num);
    	
    	int index = ibad-1;
    	while(help(""+rNum, baseint)) {
    		for(int i = 0; i < power; i++) {
    			rNum -=baseint*(int)Math.pow(10, i);
    		}
    		rNum+=(int)Math.pow(10, power);
    	}
    	
    	return rNum;
        
    }
    
    public static boolean help(String num, int base) {
    	for(int i = 0; i < num.length(); i++) {
    		if(Integer.parseInt(num.substring(i,i+1)) >= base) {
    			return true;
    		}
    	}
    	return false;
    }

}