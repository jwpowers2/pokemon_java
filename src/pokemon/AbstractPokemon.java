package pokemon;

public abstract class AbstractPokemon implements PokemonInterface {

	public Pokemon createPokemon(String name, int health, String type) {
		Pokemon p = new Pokemon(name, health, type);
		return p;
	}
	public void attackPokemon(Pokemon pokemon) {
		pokemon.setHealth(pokemon.getHealth() - 10);
	}	
	
}
