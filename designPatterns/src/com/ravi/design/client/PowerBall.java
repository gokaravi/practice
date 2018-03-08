/**
 * 
 */
package com.ravi.design.client;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Ravi Goka
 * @email rgoka@nisum.com Jan 12, 2016
 */
public class PowerBall {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PowerBall power = new PowerBall();

		Integer totalTickets = 10;
		Integer maximumNumbers = 69;
		Integer noOfTickets = 25;
		
		List<List<Integer>> tickets = power.getPowerBalls(maximumNumbers, totalTickets);
		
		Set<Integer> indices = power.getDuplicate(tickets);
		for(Integer x : indices){			
			power.removeDuplicate(tickets, x);
		}
		
		int ticketsCount = tickets.size();
		outer: while(ticketsCount < noOfTickets){
			tickets = power.getPowerBalls(maximumNumbers, totalTickets);
			
			indices = power.getDuplicate(tickets);
			for(Integer x : indices){			
				power.removeDuplicate(tickets, x);
			}
			//ticketsCount = tickets.size();
			if(ticketsCount == noOfTickets){
				break outer;
			}
		}
		
		System.out.println("After deleting the duplicates...START");
		power.logTickets(tickets);
		System.out.println("After deleting the duplicates...END");
		
		// Get the white balls
		/*List<List<Integer>> tickets = power.getWhiteBalls(69, totalTickets);
		for (List<Integer> whiteBalls : tickets) {
			Collections.sort(whiteBalls);
		}
		
		
		System.out.println("Before deleting the duplicates...START");
		power.logTickets(tickets);
		System.out.println("Before deleting the duplicates....END");
		Set<Integer> indices = power.getDuplicate(tickets);
		for(Integer x : indices){			
			power.removeDuplicate(tickets, x);
		}
		

		for (List<Integer> ticket : tickets) {
			ticket.add(power.getPowerBall(26));
		}
		System.out.println("After deleting the duplicates...START");
		power.logTickets(tickets);
		System.out.println("After deleting the duplicates...END");*/
	}

	public List<List<Integer>> getWhiteBalls(int maxNumber, int numberOfTickets) {
		List<Integer> whiteBalls = null;
		List<List<Integer>> tickets = new ArrayList<List<Integer>>();
		for (int y = 0; y < numberOfTickets; y++) {
			whiteBalls = new ArrayList<Integer>();
			for (int x = 0; x < 5; x++) {
				whiteBalls.add((int) (Math.random() * maxNumber + 1));
			}
			tickets.add(whiteBalls);
		}
		return tickets;
	}

	public Integer getPowerBall(int maxNumber) {
		Integer powerBall = null;
		powerBall = (int) (Math.random() * maxNumber) + 1;
		return powerBall;
	}

	public Set<Integer> getDuplicate(List<List<Integer>> tickets) {
		Set<Integer> indices = new HashSet<Integer>();
		if(null != tickets && tickets.size() > 0){
		for (int index = 0; index < tickets.size(); index++) {
			List<Integer> whiteBalls = tickets.get(index);
			for (int x = 0; x < whiteBalls.size(); x++) {
				Integer number = whiteBalls.get(x);
				for (int y = 0; y < whiteBalls.size(); y++) {
					if (x != y) {
						if (number.equals(whiteBalls.get(y))) {
							indices.add(index);
						}
					}
				}
			}
		}
	}
		return indices;
	}	

	private void logTickets(List<List<Integer>> tickets) {
		for (List<Integer> ticket : tickets) {

			for (Integer number : ticket) {
				System.out.print(number);
				System.out.print(" ");
			}
			System.out.println("");

		}
	}
	

	private List<List<Integer>> removeDuplicate(List<List<Integer>> tickets,
			int index) {	
		
				System.out.println("The duplicate ticket: "+tickets.get(index)+" The index is: "+index);
				
				tickets.remove(index);			
		
				return tickets;
	}
	
	private List<List<Integer>> getPowerBalls(int maxNumbers, int totalTickets){
		PowerBall power = new PowerBall();
		List<List<Integer>> tickets = power.getWhiteBalls(maxNumbers, totalTickets);
		
		return tickets;
	}
}
