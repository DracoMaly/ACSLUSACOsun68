import java.util.*;
import java.io.*;

public class _1819jrc4 {
	
    public static void main(String[] args) {
    	//find the first number and operation to the left of it
    	//find second number
    	//do the problem and replace those 3 with the new num
    	//loop
    	
    	Scanner in = new Scanner(System.in);
    	for(int a = 0; a < 5; a++) {
    		String ting = in.nextLine().replace(" ", "");
    		
    		
    		Stack<Character> eqn = new Stack<Character>();
            Stack<Integer> nums = new Stack<Integer>();
            
            for(int i = 0; i < ting.length(); i++) {
            	eqn.push(ting.charAt(i));
            }
            
            while(!eqn.isEmpty()) {
            	if(Character.isDigit(eqn.peek())) {
            		nums.push(eqn.pop()-'0');
            	}else {
            		if(eqn.peek() == '+') {
            			nums.push(nums.pop()+nums.pop());
            		}else if(eqn.peek() == '-') {
            			nums.push(nums.pop()-nums.pop());
            		}else if(eqn.peek() == '*') {
            			nums.push(nums.pop()*nums.pop());
            		}else if(eqn.peek() == '@') {
            			if(nums.pop() > 0) {
            				int temp = nums.pop();
            				nums.pop();
            				nums.push(temp);
            			}else {
            				nums.pop();
            			}
            		}
            		System.out.println(nums);
            		eqn.pop();
            	}
            }
            System.out.println(nums.peek());
    	}
    }
}




/*
* + 4 5 - 3 1
@ - 8 9 7 + 4 2
@ - 3 5 - * 2 4 1 0
* 4 @ - 5 7 * 3 2 + 1 9
* + @ 4 6 9 @ - 3 8 1 7 2

 */