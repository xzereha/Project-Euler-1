/*
 * This is my solution to Problem 1 from https://projecteuler.net/
 */

package se.xzereha.projecteuler1;

public class ProjectEuler1 {
	
	public static void main (String[] args) {
		int sum = 0;
		//fill all multiples of 3, except those that are divisible by 5
		for (int i = 1; (3*i)<1000; i++){
			if((3*i)%5 != 0){ //use modulo to check if it is divisible by 5
				sum+=3*i;
			}
		}
		//fill all multiples of 5
		for (int i = 1; (5*i)<1000; i++){
			sum+=5*i;
		}
		System.out.println(sum);
	}

}
