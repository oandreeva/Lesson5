package by.htp.photoalbum;

public class AlbumPage {

	private int pageNumber;
	private int photoOnPage;
	private Photo photos[];
	private int photoCount = 0;

	public AlbumPage(int pageNumber, int photoOnPage) {
		this.pageNumber = pageNumber;
		this.photoOnPage = photoOnPage;
		this.photos = new Photo[photoOnPage];
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public int getPhotoonPage() {
		return photoOnPage;
	}

	public void setPhotoonPage(int photoOnPage) {
		this.photoOnPage = photoOnPage;
	}
	
	public int getPhotoCount() {
		return photoCount;
	}

	public void addPhoto(Photo photo) {
		if (photoCount < photos.length) {
			photos[photoCount] = photo;
			photoCount++;
		} else {
			System.out.println("Page is full of photo");
		}

	}
}
