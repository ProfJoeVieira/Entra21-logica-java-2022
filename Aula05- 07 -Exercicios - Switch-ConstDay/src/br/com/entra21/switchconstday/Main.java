package br.com.entra21.switchconstday;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Escolhendo o dia da semana

		String dayString;
        
        @SuppressWarnings("resource")
		Scanner day1 = new Scanner(System.in);
    	byte dayoftheweek;
    	
    	System.out.println("Type a number from 1 to 7 and I'll tell you the day of the week");
    	  dayoftheweek = day1.nextByte();
        
        // switch statement with int data type
        switch (dayoftheweek) {
        case 1:
            dayString = "Monday";
            break;
        case 2:
            dayString = "Tuesday";
            break;
        case 3:
            dayString = "Wednesday";
            break;
        case 4:
            dayString = "Thursday";
            break;
        case 5:
            dayString = "Friday";
            break;
        case 6:
            dayString = "Saturday";
            break;
        case 7:
            dayString = "Sunday";
            break;
        default:
            dayString = "Invalid day";
        }
        
        
        System.out.println(" The number is a " + dayString);
    }
		
	}


