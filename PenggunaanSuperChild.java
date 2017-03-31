public class PenggunaanSuperChild extends PenggunaanSuper {
	int num = 10;
	public void tampilkan() {
	System.out.println("Ini tampilkan dari sub kelas");
	}
	public void penggunaanSuper() {
	tampilkan();
	super.tampilkan();
	System.out.println("Nilai Variabel num pada sub kelas :" + num);
	System.out.println("Nilai Variabel num pada super kelas :" + super.num);

	}
public static void main (String args []){
	PenggunaanSuperChild cbj = new PenggunaanSuperChild();
	cbj.penggunaanSuper(); 
}
}