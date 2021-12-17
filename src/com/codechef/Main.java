package com.codechef;
public class Main {

    public static void main(String[] args) throws Exception {
	// use of throw and throws to achieve user defined exceptions:
        PowerCalculator p1 = new PowerCalculator();
        long power = p1.power(78,0);
        System.out.println(power);
    }
}
class PowerCalculator{
    long power(long n, long p) throws Exception {
        if(n<0 || p<0){
            throw new Exception ("n or p can not be negative");
        }
        else if(n==0 || p==0){
            throw new Exception("n or p should not be zero");
        }
        else{
            return (long) Math.pow(n,p);
        }
    }
}
// in this the throws keyword is used to warn the compiler that an exception can be occur: