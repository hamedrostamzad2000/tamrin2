package com.company;

public class Main {

    public static void main(String[] args) {
    int i;
    int j;
    int k;
    int s;
	for(i=1;i<=7;i+=2){
	    j=1;
	    k=(7-i)/2;
	    for(s=1;s<=k;s++){
	        System.out.print(" ");
        }

	    for(j=1;j<=i;j++){
	        System.out.print("*");

        }
        System.out.println();
    }


    for(i=5;i>=1;i-=2){
	    j=1;
	    k=(7-i)/2;
	    for(s=1;s<=k;s++){
	        System.out.print(" ");
        }

        for(j=1;j<=i;j++){
	        System.out.print("*");
        }

        System.out.println();
    }


    }
}
