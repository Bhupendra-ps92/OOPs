package PracticePrograms;

public class Cuboid {
	int length;
	int width;
	int height;

	Cuboid(int l, int w, int h) {
		length = l;
		width = w;
		height = h;
	}

	public void areaCuboid() {
		double volume = length * width * height;
		double surfacearea = 2 * (length * width + width * height + height * length);
		System.out.println("SurfaceArea of cuboid is: " + surfacearea);
		System.out.println("Volume of cuboid is: " + volume);
	}

}
