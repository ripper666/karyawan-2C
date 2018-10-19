public class Karyawan{
	String nama;
	String alamat;
	private int gaji;
	public int getGaji(){
		return this.gaji;
	}
	public void setGaji(int uang){
		this.gaji=uang;
	}
	public void setNama(String nama){
		System.out.println("nama = "+nama);
	}
	public void setAlamat(String alamat){
		System.out.println("alamat = "+alamat);
	}
	public void tampilKar(){
		System.out.println("nama = "+nama);
		System.out.println("alamat = "+alamat);
		System.out.println("gaji = "+gaji);

	}
	public void setGaji(int uang, String pesan){
		gaji = uang;
		System.out.println(uang);
		System.out.println(pesan);
	}
}