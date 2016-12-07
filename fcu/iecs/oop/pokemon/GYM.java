package fcu.iecs.oop.pokemon;

import java.util.Random;
public class GYM {
	public static  Player fight(Player p1,Player p2){
		Random dice=new Random();
		int wins_p1=0,wins_p2=0;
		int result;
		for(int i=0;i<3;i++){
			PokemonType p1_type=p1.getPokemons()[i].getType();
			PokemonType p2_type=p2.getPokemons()[i].getType();
			int p1_cp=p1.getPokemons()[i].getCp();
			int p2_cp=p2.getPokemons()[i].getCp();
			if(p1_type!=p2_type){
				if(p1_type==PokemonType.FIRE&&p2_type==PokemonType.GRASS)wins_p1++;
				else if(p1_type==PokemonType.GRASS&&p2_type==PokemonType.WATER)wins_p1++;
				else if(p1_type==PokemonType.WATER&&p2_type==PokemonType.FIRE)wins_p1++;
				else wins_p2++;
			}
			else{
				if(p1_cp>p2_cp)wins_p1++;
				else if(p1_cp<p2_cp)wins_p2++;
				else{
					result=dice.nextInt(2);
					if(result==1)wins_p1++;
					else wins_p2++;
				}
			}
		}
		if(wins_p1>wins_p2){
			p1.setLevel(p1.getLevel()+1);
			System.out.println("Winner is "+p1.getPlayerName()+", and his/her level becomes "+p1.getLevel()+".");
			return p1;
		}
		else {
			p2.setLevel(p2.getLevel()+1);
			System.out.println("Winner is "+p2.getPlayerName()+", and his/her level becomes "+p2.getLevel()+".");
			return p2;
		}
	}

}

