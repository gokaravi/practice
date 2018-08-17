/**
 * 
 */
package com.ravi.design.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Ravi Goka
 * @email ravikumargoka@gmail.com
 * Jan 13, 2016
 */
public class MyPowerBall {
	
	
	public static void main (String[] args){
		final int NUMBER_OF_TICKETS = 5;
		final int MAX_NUMBER = 69;
		final int POWER_BALL_MAX = 26;
		MyPowerBall powerBall = new MyPowerBall();
		
		List<Set<Integer>> tickets = powerBall.getWhiteBalls(NUMBER_OF_TICKETS, MAX_NUMBER, POWER_BALL_MAX);
		
		List<List<Integer>> whiteBallTickets = powerBall.convertToList(tickets);
		
		//Find the duplicates
		for(List<Integer> whiteBallTicket : whiteBallTickets){
			powerBall.isDuplicate(whiteBallTicket);
			}
		
		//Add the power ball for each ticket
		if(null != whiteBallTickets && whiteBallTickets.size() > 0){
			for(List<Integer> whiteBallTicket : whiteBallTickets){
				whiteBallTicket.add(powerBall.getPowerBall(POWER_BALL_MAX));
			}			
		}
		
		//Get the final tickets with two digits
		List<List<String>> finalTickets = powerBall.getFinalTickets(whiteBallTickets);
		
		//Display the tickets
		powerBall.logTickets(finalTickets);
		
	}
	
	/**
	 * Method to get the white balls
	 * @param numberOfTickets
	 * @param maxNumber
	 * @param powerBallMaxNumber
	 * @return List<Set<Integer>>
	 */
	private List<Set<Integer>> getWhiteBalls(int numberOfTickets, int maxNumber, int powerBallMaxNumber){
		List<Set<Integer>> whiteBalls = new ArrayList<Set<Integer>>();
		MyPowerBall powerBall = new MyPowerBall();
		for(int x = 0; x < numberOfTickets; x++){
			Set<Integer> oneBall = powerBall.getWhiteBall(maxNumber);
			while(null == oneBall){
				oneBall = powerBall.getWhiteBall(maxNumber);
			}			
			whiteBalls.add(oneBall);
		}		
		return whiteBalls;
	}
	
	
	/**
	 * Method to get the white balls based on the maximum allowable number
	 * @param maxNumber
	 * @return Set<Integer>
	 */
	public Set<Integer> getWhiteBall(int maxNumber) {
		Set<Integer> whiteBalls = new TreeSet<Integer>();			
			for (int x = 0; x < 5; x++) {
				whiteBalls.add((int) (Math.random() * maxNumber + 1));
			}
		if(whiteBalls.size() == 5){
		return whiteBalls;
		}
		
		else{
			return null;
		}
	}
	
	/**
	 * Method to check whether any duplicates in the same ticket
	 * @param ticket
	 * @return boolean
	 */
	private boolean isDuplicate(List<Integer> whiteBallTicket) {	
		boolean isDuplicate = false;
		for (int x = 0; x < whiteBallTicket.size() - 1; x++) {			
				Integer number = whiteBallTicket.get(x);
				for (int y = 0; y < whiteBallTicket.size(); y++) {
					if (x != y) {
						if (number.equals(whiteBallTicket.get(y))) {
							System.out.println("Duplicate items: "+whiteBallTicket);
							isDuplicate = true;
							return isDuplicate;
						}
					}				
			}
	}
		return isDuplicate;
	}
	
	/**
	 * Method to get the power ball number based on the maximum number
	 * @param powerBallMaxNumber
	 * @return powerBall
	 */
	public Integer getPowerBall(int powerBallMaxNumber) {
		Integer powerBall = null;
		powerBall = (int) (Math.random() * powerBallMaxNumber) + 1;
		return powerBall;
	}
	
	/**
	 * Method to log the ticket numbers
	 * @param tickets
	 */
	private void logTickets(List<List<String>> tickets) {
		
		if(null != tickets && tickets.size() > 0){
			for(int x = 0; x < tickets.size(); x++){
				List<String> ticket = tickets.get(x);
				if(null != ticket && ticket.size() > 0){
					for(int y = 0; y < ticket.size(); y++){
						String number = ticket.get(y);
						if(y <= 4){
						System.out.print(number);
						System.out.print(" ");
						}
						else{
							System.out.print(" || ");
							System.out.print(number);							
						}
					}
				}
				System.out.println("");
			}
		}		
	}
	
	/**
	 * Method to convert list of Set of Integers to list of list of Integers
	 * @param tickets
	 * @return List<List<Integer>>
	 */
	private List<List<Integer>> convertToList(List<Set<Integer>> tickets){
		List<List<Integer>> convertedTickets = new ArrayList<List<Integer>>();
		for(Set<Integer> number : tickets){
			List<Integer> listNumbers = new ArrayList<Integer>();
			for(Integer element : number){
				listNumbers.add(element);
			}
			convertedTickets.add(listNumbers);
		}
		return convertedTickets;
	}
	
	/**
	 * Method to convert the list of list of numbers to list of list of Strings
	 * @param allBalls
	 * @return List<List<String>>
	 */
	
	private List<List<String>> getFinalTickets(List<List<Integer>> allBalls){
		List<List<String>> finalTickets = new ArrayList<List<String>>();
		for(List<Integer> numbers : allBalls){
			List<String> ticket = new ArrayList<String>();
			for(Integer number : numbers){
				String numberString = number.toString();
				if(null != numberString && numberString.length() == 1){
					numberString = "0"+numberString;					
				}
				ticket.add(numberString);
			}
			finalTickets.add(ticket);
		}		
		return finalTickets;
	}

}
