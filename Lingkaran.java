public class Lingkaran {
	private int jari;
	private double luasLinkaran;
	private double kelLinkaran;

	public Lingkaran(int r){
		jari = r;
	}

	public void TampilkanLingkaran(){
		System.out.println("=== L I N G K A R A N ===");
		System.out.println("Jari-Jari lingkaran = " +jari);
	}

	public void HitungLingkaran(){
		luasLinkaran = Math.PI*jari*jari;
		System.out.println("Luas Lingkaran : " +luasLinkaran);

		kelLinkaran = Math.PI*(jari+jari);
		System.out.println("Kelililng Lingkaran : " +kelLinkaran);
	}
}