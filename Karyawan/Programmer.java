public class Programmer extends Karyawan{
	public void setGaji(int uang){
		if(uang<=90){
			System.out.println("Gaji anda sebesar = "+uang);
		}else{
			System.out.println("maaf gaji anda terlalu banyak");
		}
	}
}