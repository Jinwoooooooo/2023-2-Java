package assignment4;

public class TV {
	private String model;
	private int year, inch;
	
	public TV(String model, int year, int inch) {
		this.model = model;
		this.year = year;
		this.inch = inch;
	}
	public void show() {
		System.out.println(model + "에서 만든 " + year + "년형 " + inch + "인치 TV");
	}
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32); //LG에서 만든 2017년 32인치
		myTV.show();
	}

}