/* Author: Anand Jasti
 * Date: 01-24-2022
 * Description: finds the sum & average of 5 positive numbers
 */

 import java.util.Scanner;
 public class Code12422{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int sum = 0;
        for(int i=0; i<5; i++){
            System.out.print("Please enter 5 positive values: ");
            int num = in.nextInt(); // take input
            if(num < 0){ //check if the input is positive
                System.out.println("Invalid Value");
                i--;
            }
            else{
                sum += num; // calculate sum
            }
        }
        System.out.println("Sum = " + sum + "."); // print sum
        System.out.println("Average = "+ (sum/5.0)); // calculate and print average
    }

 }