package by.htp.photoalbum;

public class Album {

	private AlbumPage albumpages[];
	private int pageInAlbum;
	private int albumPageCount = 0;

	public Album(int pageInAlbum) {
		this.albumpages = new AlbumPage[pageInAlbum];
		this.pageInAlbum = pageInAlbum;
	}

	public void addAlbumpage(AlbumPage albumpage) {
		if (albumPageCount < albumpages.length) {
			albumpages[albumPageCount] = albumpage;
			albumPageCount++;
		} else {
			System.out.println("too much albumpages");
		}
	}

	public void report() {
		int result = 0;
		for (int i = 0; i < albumpages.length; i++) {
			AlbumPage page = albumpages[i];
			if (page != null) {
				result += page.getPhotoCount();
			}

		}

		System.out.println("We have " + result + " photos in album.");

	}

}
