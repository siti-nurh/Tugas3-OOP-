import java.util.Scanner;

public class CallConstructorMahasiswa {
	public static void main (String[] args){


		Scanner input = new Scanner(System.in);
		int beratBadan;
		int tinggiBadan;

		System.out.print("Masukan Berat Badan : ");
		beratBadan = input.nextInt();

		System.out.print("Masukan tinggiBadan : ");
		tinggiBadan = input.nextInt();


		Mahasiswa mhs = new Mahasiswa("Siti Nurhasanah");
		System.out.println(mhs.nama);
		System.out.println(beratBadan);
		System.out.println(tinggiBadan);

	}
}