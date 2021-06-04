package advance.dev;

public class Person {
	protected String ten;
	protected String sdt;
	protected int tuoi;
	public Person(String ten, String sdt, int tuoi) {
		this.ten = ten;
		this.sdt = sdt;
		this.tuoi = tuoi;
	}
	@Override
	public String toString() {
		return "Person Ten=" + ten + "\t sdt=" + sdt + "\t tuoi=" + tuoi;
	}
	
}
