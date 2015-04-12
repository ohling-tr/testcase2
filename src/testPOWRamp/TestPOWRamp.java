package testPOWRamp;

public class TestPOWRamp {
	public static void main(String[] args) {
		
		double iPower = 2.5;
		System.out.println("Hello Joystick Ramp with " + iPower);
		double[] jy = new double[]{-1.0,-0.8,-0.6,-0.4,-0.2,0,0.2,0.4,0.6,0.8,1};
		for (int i=0; i < jy.length; i++) {
			System.out.println("Ramp " + jy[i] + " " + Math.pow(jy[i], iPower));
		}
		
		
	}

}
