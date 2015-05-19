public class TestBangun {
	public static void main(String[] args) {
		SegiTiga stg = new SegiTiga(7, 8, 9);
		stg.TampilkanSegitiga();
		System.out.println("");
		stg.HitungSegitiga();

		System.out.println();
		System.out.println();

		Lingkaran lkg = new Lingkaran(13);
		lkg.TampilkanLingkaran();
		System.out.println("");
		lkg.HitungLingkaran();
	}
}