package by.htp.photoalbum;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Создать объект класса Фотоальбом, используя классы Фотография,
		Страница. Методы: задать название фотографии, дополнить фотоальбом
		фотографией, вывести на консоль количество фотографий*/
		
		Photo phot1 = new Photo ("me", 1);
		Photo phot2 = new Photo ("me2", 2);
		Photo phot3 = new Photo ("me3", 3);
		Photo phot4 = new Photo ("me4", 4);
		Photo phot5 = new Photo ("me5", 5);
		Photo phot6 = new Photo ("me6", 6);
		Photo phot7 = new Photo ("me7", 7);
		Photo phot8 = new Photo ("me8", 8);
		
		AlbumPage albumPage1 = new AlbumPage(1, 6);
		AlbumPage albumPage2 = new AlbumPage(2, 6); 
		
		albumPage1.addPhoto(phot1);
		albumPage1.addPhoto(phot2);
		albumPage1.addPhoto(phot3);
		albumPage1.addPhoto(phot4);
		albumPage1.addPhoto(phot5);
		albumPage1.addPhoto(phot6);
		albumPage2.addPhoto(phot7);
		albumPage2.addPhoto(phot8);
		
		
		Album album = new Album(5);
		
		
		album.addAlbumpage(albumPage1);
		album.addAlbumpage(albumPage2);
		
		album.report();
		
		
		
	}	
}
