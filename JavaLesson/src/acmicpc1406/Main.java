package acmicpc1406;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException{
        Stack<Character> Lcursor = new Stack<Character>();
        Stack<Character> Rcursor = new Stack<Character>();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String txt = in.readLine();
        for(int i = 0; i < txt.length(); i++) {
            Lcursor.push(txt.charAt(i));
        }
        
        int n = Integer.parseInt(in.readLine());
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < n; i++) {
            String line = in.readLine();
            char command = line.charAt(0);
            if(command == 'L') {
                if(!Lcursor.isEmpty()) {
                    Rcursor.push(Lcursor.pop());
                }
            }else if(command== 'D') {
                if(!Rcursor.isEmpty()) {
                    Lcursor.push(Rcursor.pop());
                }
            }else if(command == 'B') {
                if(!Lcursor.isEmpty()) {
                    Lcursor.pop();
                }
            }else if(command== 'P') {
                Character dolla = line.charAt(2);
                Lcursor.push(dolla);
            }
        }
        while(!Lcursor.isEmpty()) {
            Rcursor.push(Lcursor.pop());
        }
        while(!Rcursor.isEmpty()) {
            sb.append(Rcursor.pop());
        }
        
        System.out.println(sb);
    }
}

/*
dmih
11
B
B
P x
L
B
B
B
P y
D
D
P z
 */
