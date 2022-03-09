package com.studyopedia;
public class fib{
    public static void main(String[] args) {
        int n1 = 1, n2 = 1, k = 10,count;
        int[] a=new int[20];
        a[0]=n1;
        a[1]=n2;
        for(int i=2;i<=10;i++) {
            int n3;
            n3 = n1+ n2;
            n1 = n2;
            n2 = n3;
            a[i]=n3;
    }
        for(int i=0;i<=10;i++){
            for(int j=i+1;j<=10;j++){
                for(int g=j+1;g<=10;g++){
            if(Math.random()==k)
            {
                count=2;
                System.out.println(count);
            }}}}}}
