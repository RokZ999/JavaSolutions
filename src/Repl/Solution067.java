package Repl;

public class Solution067 {
	public static void main(String[] args) {
		RGB zelena = new RGB(255);
		RGB.switchOnOff(false);
		RGB purple = new RGB(100,0,100);
		RGB.switchOnOff(true);

		System.out.printf("zelena: %b%npurple: %b%n", RGB.onOff, RGB.onOff);
		System.out.print(zelena + "" +purple);

	}

}
class RGB{
	int r,g,b;
	static boolean onOff = true;

	public RGB(int r, int g, int b) {
		this.r = r;
		this.g = g;
		this.b = b;
	}
	public RGB(int g) {
		this.r = 0;
		this.g = g;
		this.b = 0;
	}

	public void eliminateR(){
		r = 0;
	}
	public void eliminateG(){
		g = 0;
	}
	public void eliminateB(){
		b = 0;
	}

	static void switchOnOff (boolean f){
		onOff = f;
		System.out.printf("All lights are %s.%n", f ? "on" : "off");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Values: R:%d G:%d B:%d%n", r,g,b);
	}
}