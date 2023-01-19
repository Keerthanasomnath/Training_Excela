package com.example.demo;

import java.util.*;
import java.util.Map.Entry;
class Program {
    public static void main(String[] args)
    {
        Bowling game = new Bowling();
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<3;i++) {
            String input = sc.nextLine();
            String[] values = input.split(" ");
            String name = values[0];
            int points = Integer.parseInt(values[1]);
            game.addPlayer(name, points);
        }
        game.getWinner();
    }
}

class Bowling {
	HashMap<String, Integer> players;

	Bowling() {
		players = new HashMap<String, Integer>();
	}

	public void addPlayer(String name, int p) {
        players.put(name, p);
    }

	public void getWinner()
    {
		int maxValueInMap = (Collections.max(players.values()));
		 
        // Iterate through HashMap
        for (Entry<String, Integer> entry :
             players.entrySet()) {
 
            if (entry.getValue() == maxValueInMap) {
 
                // Print the key with max value
                System.out.println(entry.getKey());
            }
//		 System.out.println(Collections.max(players.values()));
}
}
