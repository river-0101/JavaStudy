package chaptwo;

public class Practice2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v0=3;
		int accel=5;
		int time=10;
		
		float v=v0+accel*time;
		float S=v0*time+(float)0.5*accel*time*time;
		System.out.println("v= "+v+" S= "+S);

	}

}
