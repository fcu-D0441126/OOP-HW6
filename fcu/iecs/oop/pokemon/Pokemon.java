package fcu.iecs.oop.pokemon;

public class Pokemon {
	private final String name;
	private final PokemonType type;//finalÃþ¦üconst
	private int cp;
	
	Pokemon(String name,PokemonType type,int cp){
		this.name=name;
		this.type=type;
		this.cp=cp;
	}
	
	public int getCp(){
		return cp;
	}
	
	public void setCp(int cp){
		this.cp=cp;
	}
	
	public String getName(){
		return name;
	}
	
	public PokemonType getType(){
		return type;
	}

}
