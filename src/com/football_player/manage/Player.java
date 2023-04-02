package com.football_player.manage;

public class Player {
	
	private int playerId;
	private String playerName;
	private int playerAge;
	private String playerNationality;
	private String playerPosition;
	private String playerClub;
	
	public Player(int playerId, String playerName, int playerAge, String playerNationality, String playerPosition,
			String playerClub) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.playerAge = playerAge;
		this.playerNationality = playerNationality;
		this.playerPosition = playerPosition;
		this.playerClub = playerClub;
	}

	public Player(String playerName, int playerAge, String playerNationality, String playerPosition,
			String playerClub) {
		super();
		this.playerName = playerName;
		this.playerAge = playerAge;
		this.playerNationality = playerNationality;
		this.playerPosition = playerPosition;
		this.playerClub = playerClub;
	}

	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getPlayerAge() {
		return playerAge;
	}

	public void setPlayerAge(int playerAge) {
		this.playerAge = playerAge;
	}

	public String getPlayerNationality() {
		return playerNationality;
	}

	public void setPlayerNationality(String playerNationality) {
		this.playerNationality = playerNationality;
	}

	public String getPlayerPosition() {
		return playerPosition;
	}

	public void setPlayerPosition(String playerPosition) {
		this.playerPosition = playerPosition;
	}

	public String getPlayerClub() {
		return playerClub;
	}

	public void setPlayerClub(String playerClub) {
		this.playerClub = playerClub;
	}

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", playerAge=" + playerAge
				+ ", playerNationality=" + playerNationality + ", playerPosition=" + playerPosition + ", playerClub="
				+ playerClub + "]";
	}
	
	
    


}
