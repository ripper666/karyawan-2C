public class Desain extends Karyawan{
	public void setGaji(int gaji){
		if(gaji<=70){
			System.out.println("Gaji anda sebesar= "+gaji);
		}else{
			System.out.println("Maaf gaji anda terlalu banyak");
		}
	}
}