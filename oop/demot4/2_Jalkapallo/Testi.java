
public class Testi {

	public static void main(String[] args) {
		Jalkapallojoukkue a = new Jalkapallojoukkue("kerava");
		Jalkapallonpelaaja b = new Jalkapallonpelaaja("Matti",32,"5");
		Jalkapallonpelaaja c = new Jalkapallonpelaaja("Teppo",43,"6");
		Jalkapallonpelaaja d = new Jalkapallonpelaaja("Pekka",3,"7");
		a.asetaPALKKAKATTO(1300);
		b.asetaPalkka(200.98);
		c.asetaPalkka(900.0);
		d.asetaPalkka(29.0);
		a.lisaaPelaaja(b);
		a.lisaaPelaaja(d);
		a.lisaaPelaaja(c);
		a.tulostaPelaajatPalkka(2); 
		Jalkapallonpelaaja e = new Jalkapallonpelaaja("Seppo",3,"7");
		e.asetaPalkka(300);
		a.tulostaBudjetti();
		a.lisaaPelaaja(e);
		
		
	}

}
