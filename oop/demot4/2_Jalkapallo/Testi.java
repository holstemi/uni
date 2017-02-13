public class Testi {

	public static void main(String[] args) {
		Jalkapallojoukkue a = new Jalkapallojoukkue("kerava");
		Jalkapallonpelaaja c = new Jalkapallonpelaaja("Matti",32,"5");
		Jalkapallonpelaaja g = new Jalkapallonpelaaja("Teppo",43,"6");
		Jalkapallonpelaaja j = new Jalkapallonpelaaja("Pekka",3,"7");
		j.asetaPalkka(200.98);
		c.asetaPalkka(900.0);
		g.asetaPalkka(29.0);
		a.lisaaPelaaja(j);
		a.lisaaPelaaja(g);
		a.lisaaPelaaja(c);
		a.tulostaPelaajatPalkka(2); // annettavan numeron on oltava <= jalkapallojoukkueen koko
	}

}
