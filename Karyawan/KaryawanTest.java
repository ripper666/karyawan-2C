public class KaryawanTest{
	public static void main(String[] args) {
	System.out.println("  ");
	System.out.println("Jabatan Project Manager");
	Pm p = new Pm();
	p.setNama("Kukuh");
	p.setAlamat("Jonggol");
	p.setGaji(60);
	System.out.println(" ");

	System.out.println("Jabatan Programmer");
	Programmer pr = new Programmer();
	pr.setNama("Adjie");
	p.setAlamat("Pecuk");
	p.setGaji(85);
	System.out.println(" ");

	System.out.println("Jabatan Desainer");
	Desain d = new Desain();
	d.setNama("Parayoga");
	d.setAlamat("Jangga");
	d.setGaji(50);
	}
}