// 삼성 아카데미 문제 2027 홀수만 더하기

import java.util.Scanner;
import java.io.FileInputStream;
 
class Solution_2072{
    public static void main(String args[]) throws Exception{
         
        Scanner sc = new Scanner(System.in);
        int T;
        int total = 0;
        int num;
         
        T=sc.nextInt();
 
        for(int test_case = 1; test_case <= T; test_case++){
            for(int num_cnt = 0; num_cnt < 10; num_cnt++){
                num = sc.nextInt();
                if(num%2 != 0)
                    total += num;
            }
            System.out.println("#" + test_case + " " + total); 
            total = 0;
        }
    }
}
