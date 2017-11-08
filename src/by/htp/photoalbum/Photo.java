package by.htp.photoalbum;

public class Photo {

	private String name;
	private double photoNumber;

	public Photo(String name, double photoNumber) {
		this.name = name;
		this.photoNumber = photoNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPhotoNumber() {
		return photoNumber;
	}

	public void setPhotoNumber(double photoNumber) {
		this.photoNumber = photoNumber;
	}

}
