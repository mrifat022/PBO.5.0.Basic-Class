public class Mahasiswa {
	public String nama;
	public int umur;
	public Mahasiswa(String x, int y) {
		nama = x;
		umur = y;
	} 
	public void tampilkanBiodata() {
		System.out.println("::: BIODATA :::");
		System.out.println("Nama:\t"+nama);
		System.out.println("Umur:\t"+umur);
	}
	public void setUmur(int y){
		this.umur = y;
	}
}