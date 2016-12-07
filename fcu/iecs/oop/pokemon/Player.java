package fcu.iecs.oop.pokemon;

public class Player {
	private String playerName;
	private Pokemon[] pokemons;
	private int level;
	Player (String playerName){
		this.playerName=playerName;
		this.level=1;
	}
	public String getPlayerName(){
		return playerName;
	}
	public void setPlayerName(){
		this.playerName = playerName;
	}
	public Pokemon[] getPokemons(){
		return pokemons;
	}
	public void setPokemons(Pokemon[] pokemons) {
		this.pokemons = pokemons;
	}
	public int getLevel(){
		return level;
	}
	public void setLevel(int level){
		this.level = level;
	}
}
