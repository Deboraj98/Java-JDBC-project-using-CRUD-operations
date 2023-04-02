package com.football_player.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class PlayerDAO {

	public static boolean insertPlayerToDB(Player pl) {
	    
		boolean f = false;
		try {
			
			//jdbc code..
			Connection con=CP.createC();
			String q = "insert into players(p_name,p_age,p_nationality,p_position,p_club) values(?,?,?,?,?)";
            //PreparedStatement
			PreparedStatement pr=con.prepareStatement(q);
			//set the values of params
			//pr.setInt(0, pl.getPlayerId());
			pr.setString(1, pl.getPlayerName());
			pr.setInt(2, pl.getPlayerAge());
			pr.setString(3, pl.getPlayerNationality());
			pr.setString(4, pl.getPlayerPosition());
			pr.setString(5, pl.getPlayerClub());
			
			//execute
			pr.executeUpdate();
			f=true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static boolean deletePlayer(int id) {
	    
		boolean f = false;
		try {
			
			//jdbc code..
			Connection con=CP.createC();
			String q = "delete from players where p_id = ?";
            //PreparedStatement
			PreparedStatement pr=con.prepareStatement(q);
			//set the values of params
			pr.setInt(1,id);
		
			
			//execute
			pr.executeUpdate();
			f=true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return f;
		
	}

	public static void showAllPlayer() {
		
		try {
			
			//jdbc code..
			Connection con=CP.createC();
			String q = "select * from players";
            Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(q);
			//execute
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);
				String nationality = rs.getString(4);
				String position = rs.getString(5);
				String club = rs.getString(6);
				System.out.println("ID: "+id);
				System.out.println("Name: "+name);
				System.out.println("Age: "+age);
				System.out.println("Nationality: "+nationality);
				System.out.println("Position: "+position);
				System.out.println("Club: "+club);
				System.out.println("+++++++++++++++++++");
				
				
				
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	 
		
	}
	
	public static boolean updatePlayerInfo(int id,String club) {
		boolean f = false;
		Player pl;
		try {
			
			//jdbc code..
			Connection con=CP.createC();
			String q = "update players set p_club =? WHERE p_id =?";
            //PreparedStatement
			PreparedStatement pr=con.prepareStatement(q);
			//set the values of params
			pr.setString(1,club);
			pr.setInt(2, id);
		
			
			//execute
			pr.executeUpdate();
			f=true;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	
}
