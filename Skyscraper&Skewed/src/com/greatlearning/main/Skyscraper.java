package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.service.Construction;

public class Skyscraper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
				Scanner obj = new Scanner(System.in);
				System.out.println("Enter the no of floors in the building");
				
				//process input
				int N = obj.nextInt();
				int floorSizes[] = new int[N];
				for(int i = 1; i <= N; i++) {
					System.out.println("Enter the floor size given on day : " + i);
					floorSizes[i-1] = obj.nextInt(); 
				}
				obj.close();
				
				
				Construction construction = new Construction();

				construction.ConstructAlgo(N, floorSizes);
				construction.display();
			
		
		

	}

}
