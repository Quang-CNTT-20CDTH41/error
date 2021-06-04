package advance.dev;

public class Teacher extends Person {
	String magv;
	double hsluong;
	public Teacher(String ten, String sdt, int tuoi, String magv, double hsluong) {
		super(ten, sdt, tuoi);
		this.magv = magv;
		this.hsluong = hsluong;
	}
	public double tinhLuong() {
		return hsluong;
	}
	@Override
	public String toString() {
		return "Teacher Ten: " + ten + "\t sdt: " + sdt + "\t tuoi: " + tuoi + "\t magv: " + magv + "\t hsluong: " + hsluong;
	}
	
}
