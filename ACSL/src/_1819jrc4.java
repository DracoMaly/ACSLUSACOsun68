import java.util.*;
/*
* + 4 5 - 3 1
@ - 8 9 7 + 4 2
@ - 3 5 - * 2 4 1 0
* 4 @ - 5 7 * 3 2 + 1 9
* + @ 4 6 9 @ - 3 8 1 7 2

 */
public class _1819jrc4 {
    public static final int O = 0, N = 1, T = 2;
    
    static Scanner in;
    
    static ArrayList<Integer> expression;
    static ArrayList<Integer> type;
    
    static String output;
    
    public static void main(String[] args) {
        in = new Scanner(System.in);
        for(int i = 0;i<5;i++) {
            init();
            solve();
            output();
        }
    }
    
    public static void init() {
        String line = in.nextLine();
        String[] line_s = line.split(" ");
        
        expression = new ArrayList<Integer>();
        type = new ArrayList<Integer>();
        
        for(int i = 0;i<line_s.length;i++) {
            if(line_s[i].charAt(0) == '@') {
                expression.add((int)line_s[i].charAt(0));
                type.add(T);
            }
            else if(Character.isDigit(line_s[i].charAt(0))) {
                expression.add(line_s[i].charAt(0) - '0');
                type.add(N);
            }
            else {
                expression.add((int)line_s[i].charAt(0));
                type.add(O);
            }
        }
        
        output = "";
    }
    
    public static void solve() {
        while(expression.size() > 1) {
            for(int i = 0;i<expression.size()-2;i++) {
                if(type.get(i) == T && type.get(i + 1) == N 
                                    && type.get(i + 2) == N
                                    && type.get(i + 3) == N) {
                    int s = solveTertiary(expression.get(i + 1), 
                                          expression.get(i + 2),
                                          expression.get(i + 3)
                            );
                    for(int j = 0;j<4;j++) {
                        expression.remove(i);
                        type.remove(i);
                    }
                    expression.add(i, s);
                    type.add(i, N);
                }
                if(type.get(i) == O && type.get(i + 1) == N && type.get(i + 2) == N) {
                    int s = solveEasy((char)(int)expression.get(i),
                                      expression.get(i + 1),
                                      expression.get(i + 2)
                            );
                    for(int j = 0;j<3;j++) {
                        expression.remove(i);
                        type.remove(i);
                    }
                    expression.add(i, s);
                    type.add(i, N);
                }
            }
        }
        output += expression.get(0);
    }
    
    public static void output() {
        System.out.println(output);
    }
    
    public static int solveEasy(char op, int a, int b) {
        if(op == '+') return a + b;
        else if(op == '-') return a - b;
        else return a * b;
    }
    
    public static int solveTertiary(int a, int b, int c) {
        if(a > 0) return b;
        else return c;
    }
}