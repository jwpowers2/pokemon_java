package pokemon;

public class Pokedex extends AbstractPokemon {

	public String pokemonInfo(Pokemon pokemon) {
		String output = String.format("%s %s %s",pokemon.getName(), pokemon.getHealth(), pokemon.getType());
		return output;
	}    
}

