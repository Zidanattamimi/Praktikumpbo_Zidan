package Praktikum5;

public abstract class Hewan {
	protected static String name;
	protected abstract void eat();
}

class Cat extends Hewan {
	String warna;
	int berat;
	public void identitas(String namaKucing, String warnaKucing, int beratkucing) {
		Cat.name = namaKucing;
		warna = warnaKucing;
		berat = beratkucing;
	}
	public void eat() {
		System.out.println(Cat.name+" Makan Wishkas");
	}
	String ambilNama() {
		return Cat.name;
	}
	String ambilWarna() {
		return warna;
	}
	int ambilBerat() {
		return berat;
	}
	
}