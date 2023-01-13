package Review3;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println("hello " + i);
        }
        for (int a = 0; a < 8; a += 4) {

            System.out.println("bye");
        }
        System.out.println("------------------");

        for (int i = 2; i > 10; i++) {

            System.out.println(i);


        }  /*System.out.println("------------------");
        for (int j = 3; j <10 ; j--) {
            System.out.println(j);
            */
for (int i=1; i<=6; i++){
    if (i%2==0){
        System.out.println(" even number " +i);
    }
    int c=1;
    while (c<=4){

        System.out.println("hello");
        c++;
    }
    /*
    lets ask a user if he is tired
     as long as user is not tired--> we will say let's study java
     */
    Scanner scan=new Scanner(System.in);
    System.out.println("Are you Tired");
    boolean tired=scan.nextBoolean();

    while (!tired){
        System.out.println("This is great");
        System.out.println("Let's study java");
        System.out.println("Are you tired");
        tired=scan.nextBoolean();
        System.out.println();


    }

        }



    }}
