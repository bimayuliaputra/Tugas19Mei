public class SegiTiga {
	private int alas;
	private int tinggi;
	private int garisMiring;
	private double luas;
	private double keliling;

	public SegiTiga(int a, int t, int m){
		alas = a;
		tinggi = t;
		garisMiring = m;
	}

	public void TampilkanSegitiga(){
		System.out.println("=== S E G I T I G A ===");
		System.out.println("Alas = " +alas);
		System.out.println("Tinggi = " +tinggi);
		System.out.println("Sisi Miring = " +garisMiring);
	}

	public void HitungSegitiga(){
		luas = 0.5*alas*tinggi;
		System.out.println("Luas Segitiga : " +luas);

		keliling = alas+tinggi+garisMiring;
		System.out.println("Keliling Segitiga : " +keliling);
	}
}