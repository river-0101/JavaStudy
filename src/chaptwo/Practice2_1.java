package chaptwo;

public class Practice2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float v0=3;
		float accel=5;
		int time=10;
		
		float v=v0+accel*time;
		float S=v0*time+(float)0.5*accel*time*time;
		System.out.println("v= "+v+" S= "+S);

	}

}
