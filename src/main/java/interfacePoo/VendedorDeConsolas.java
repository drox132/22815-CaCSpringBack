package interfacePoo;

public class VendedorDeConsolas {
	
	public IJugable vender() {
		return new PlayStation("playJugable", "jugable");
	}
	
	public IJugable [] venderVarios () {
		PlayStation play2 = new PlayStation("Play 2", "Dos");
		PlayStation play3 = new PlayStation("Play 3", "Tres");
		Xbox xbox = new Xbox("Xbox", "Uno");
		Wii wii = new Wii("Wii", "NINT", 1);
		Table tble = new Table();
		
		return new IJugable[] {play2,play3,xbox,wii,tble};
	}
}
