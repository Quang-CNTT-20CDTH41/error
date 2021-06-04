package advance.dev;

public class Student extends Person {
	private double toan, ly, hoa;
	private String masv, lop;
	public Student(String ten, String sdt, int tuoi, double toan, double ly, double hoa, String masv, String lop) {
		super(ten, sdt, tuoi);
		this.toan = toan;
		this.ly = ly;
		this.hoa = hoa;
		this.masv = masv;
		this.lop = lop;
	}
	public double diemTrungBinh() {
		double dtb = (toan + ly + hoa) / 3;
		return dtb;
	}
	@Override
	public String toString() {
		return "Student Ten: " + ten + "\t Tuoi: " + tuoi  + "\t SDT: " + sdt + "\t Toan: " + toan + "\t Ly: " + ly + "\t Hoa: " + hoa + "\t masv: " + masv + "\t Lop: " + lop;
	}
	
}
