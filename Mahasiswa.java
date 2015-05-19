public class Mahasiswa {
    private String namamahasiswa;
    private int umur;

    public Mahasiswa(String nama, int u){
        namamahasiswa = nama;
    umur=u;
    }

    public void setnamamahasiswa(String nama){
    namamahasiswa=nama;
    }
    public void setUmur(int u){
    umur=u;
    }
    public String getnamamahasiswa(){
        return namamahasiswa;
    }
    public int getumur(){
    return umur;
    }
    public void tampilkanBiodata(){
		System.out.println("=== B I O D A T A ===");
        System.out.println("Nama mahasiswa : "+ namamahasiswa);
        System.out.println("Umur mahasiswa : "+ umur);
    }
}