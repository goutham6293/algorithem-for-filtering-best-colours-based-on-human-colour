
import java.awt.SystemColor;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.util.*;

public class Solution {

    public LinkedList<Long> divide(final long temp) {
        long x= temp;
        LinkedList<Long> store = new LinkedList();
//        System.out.println(x);
        do {

            store.add(x % 10);
            
            
            x = x / 10;
            

        } while (x % 10 > 0 || x/10!=0);
//        store.forEach(y->System.out.println(y));
        return store;
    }

    public long fact(long x) {
        long temp = 1;
        for (long i = x; i >= 1; i--) {
            temp = temp * i;
        }
//        System.out.println(temp);
        return temp;
    }

    public long fac(LinkedList<Long> x) {
        long temp = 0;
        for (long i : x) {

            temp = temp + this.fact(i);
        }
//        System.out.println(temp);
        return temp;
    }

    public long f(long i) {
        LinkedList<Long> temp = this.divide(i);
//        temp.forEach(x->System.out.println(x));
        return this.fac(temp);
    }

    public long s(long x) {
        LinkedList<Long> temp = this.divide(x);
//        temp.forEach(y->System.out.print(" "+y));
//        System.out.println("");
        long temp1 = 0;
        for (long i : temp) {
            temp1 += i;
        }
        
        return temp1;
    }
    public long sf(long x){
//        System.out.println(this.s(this.f(x)));
        return this.s(this.f(x));
        
        
        
        }

    public long g(final long y) {

        for (long p = 1; p <= 100000000; p++) {
//            System.out.println(p+"**********"+this.sf(p));
//           System.out.println(p+"   "+ this.s(this.f(p)));
            if (y == this.sf(p)) {
//                System.out.println(this.sf(p));
////           System.out.println(this.s(this.f(p)));
////               System.out.println(y);
//System.out.print("-------"+p);
                return p;
            }
        }
        return 0;
    }

    public long sum_sg(long i) {
        long sum = 0;
        for (long j = 1; j <= i; j++) {

            long temp = this.sg(j);
            sum = sum + temp;
//            System.out.println(sum);
        }
//        System.out.println(sum);
        return sum;
    }

    public long sg(final long i) {
        
        long temp3=this.g(i);
//        System.out.println("************************"+temp3);
//        this.divide(temp3).forEach((x)->System.out.println(x+" "));
        LinkedList<Long> temp = this.divide(temp3);
        
        long sum = 0;
        for (long j : temp) {
              
            sum += j;
        }
        return sum;
    }

    public static void main(String[] args) throws IOException{
        Solution a = new Solution();
        var scanner = new BufferedReader(new InputStreamReader(System.in));
        Long q=Long.parseLong(scanner.readLine());
       
        
        LinkedList<Long> jg=new LinkedList<>();
        LinkedList<Long> jg1=new LinkedList<>();
        for(long i=q;i>=1;i--){
             String n=scanner.readLine();
             String[] sp=n.split(" ");
//        System.out.println(a.sum_sg(20));
        jg.add(Long.parseLong(sp[0]));
        jg1.add(Long.parseLong(sp[1]));
            
        
        }
        for (int i=1;i<=q;i++){
           
           
            System.out.println(a.sum_sg(jg.get((i-1))));
        }
        
//        System.out.println(a.g(5));
//        System.out.println(a.sum_sg(20));

       
//a.divide(456).forEach((x)->System.out.println(x));
    
//        System.out.println(a.f(342));
//
//        System.out.println(a.s(a.f(25)));
//        System.out.println(a.g(9));
//System.out.println(a.s(a.f(8)));
//        System.out.println(a.sum_sg(20));
//        System.out.println(a.sg(5));


        /* Enter your code here. Read input from STDIN. Prlong output to STDOUT. Your class should be named Solution. */
    }
}
