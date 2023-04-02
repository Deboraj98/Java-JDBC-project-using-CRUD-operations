package com.starter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.football_player.manage.Player;
import com.football_player.manage.PlayerDAO;

public class Start {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Welcome to the Football Management Application");
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("Press 1 to Add players");
			System.out.println("Press 2 to Delete players");
			System.out.println("Press 3 to Display players");
			System.out.println("Press 4 to Update App");
			System.out.println("Press 5 to Exit App");
			
			int c=Integer.parseInt(br.readLine());
			
			if(c==1) {
				System.out.println("Enter Player's name: ");
				String name=br.readLine();
				
				System.out.println("Enter Player's age: ");
				int age =Integer.parseInt(br.readLine());
				
				System.out.println("Enter Player's nationality: ");
				String nationality = br.readLine();
				
				System.out.println("Enter Player's position: ");
				String position = br.readLine();
				
				System.out.println("Enter Player's club");
				String club = br.readLine();
				
				Player pl = new Player(name,age,nationality,position,club);
				boolean answer=PlayerDAO.insertPlayerToDB(pl);
				if(answer) {
					System.out.println("Player is added successfully...");
				}else {
					System.out.println("Something went wrong..");
				}
				
				System.out.println(pl);
				
			}else if(c==2) {
				System.out.println("Enter Player's ID to Delete: ");
				int id=Integer.parseInt(br.readLine());
				boolean f=PlayerDAO.deletePlayer(id);
				if(f) {
					System.out.println("Deleted...");
				}else {
					System.out.println("Something went wrong");
				}
			}else if(c==3) {
				PlayerDAO.showAllPlayer();
			}else if(c==4) {
				//code for updation
				System.out.println("Enter Player's ID to Update: ");
				int id=Integer.parseInt(br.readLine());

				System.out.println("Enter Player's new club: ");
				String club = br.readLine();
				boolean f=PlayerDAO.updatePlayerInfo(id,club);
				if(f) {
					System.out.println("Updated...");
				}else {
					System.out.println("Something went wrong");
				
			}
	
		}else if(c==5) {
			break;
		}
		}
		System.out.println("Thankyou for using the application...");
		System.out.println("See you soon!");
	}

}
