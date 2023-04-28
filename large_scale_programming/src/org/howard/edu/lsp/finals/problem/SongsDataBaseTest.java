package org.howard.edu.lsp.finals.problem;

import static org.junit.Assert.assertEquals;

import java.util.Set;

import org.junit.jupiter.api.Test;

public class SongsDataBaseTest {
	
	@Test
	public void testAddSong() {
		SongsDatabase songDatabase = new SongsDatabase();
		songDatabase.addSong("Rap", "Savage");
		songDatabase.addSong("Rap", "Gin and Juice");
		songDatabase.addSong("RnB", "Cranes in the Sky");
		songDatabase.addSong("RnB", "Break from Toronto");
		songDatabase.addSong("RnB", "Adorn");
		songDatabase.addSong("Jazz", "Always There");
		
		
		Set<String> rapSongs = songDatabase.getSongs("Rap");
		assertEquals(2, rapSongs.size());
		assertEquals(true, rapSongs.contains("Gin and Juice"));
		assertEquals(true, rapSongs.contains("Savage"));
		
		Set<String> RnBSongs = songDatabase.getSongs("RnB");
		assertEquals(3, RnBSongs.size());
		assertEquals(true, RnBSongs.contains("Cranes in the Sky"));
		assertEquals(true, RnBSongs.contains("Break from Toronto"));
		assertEquals(true, RnBSongs.contains("Adorn"));
		
		Set<String> jazzSongs = songDatabase.getSongs("Jazz");
		assertEquals(1, jazzSongs.size());
		
		Set<String> countrySongs = songDatabase.getSongs("Country");
		assertEquals(0, countrySongs.size());
	}
	
	@Test
	public void testGetSongs() {
		SongsDatabase songDatabase = new SongsDatabase();
		songDatabase.addSong("Rap", "Savage");
		songDatabase.addSong("Rap", "Gin and Juice");
		songDatabase.addSong("RnB", "Cranes in the Sky");
		songDatabase.addSong("RnB", "Break from Toronto");
		songDatabase.addSong("RnB", "Adorn");
		songDatabase.addSong("Jazz", "Always There");
		
		Set<String> rapSongs = songDatabase.getSongs("Rap");
		assertEquals(2, rapSongs.size());
		assertEquals(true, rapSongs.contains("Gin and Juice"));
		assertEquals(true, rapSongs.contains("Savage"));
		
		Set<String> RnBSongs = songDatabase.getSongs("RnB");
		assertEquals(3, RnBSongs.size());
		assertEquals(true, RnBSongs.contains("Cranes in the Sky"));
		assertEquals(true, RnBSongs.contains("Break from Toronto"));
		assertEquals(true, RnBSongs.contains("Adorn"));
		
		Set<String> jazzSongs = songDatabase.getSongs("Jazz");
		assertEquals(1, jazzSongs.size());
		
		Set<String> countrySongs = songDatabase.getSongs("Country");
		assertEquals(0, countrySongs.size());
		
	}
	
	@Test
	public void testGetGenreOfSong() {
		SongsDatabase songDatabase = new SongsDatabase();
		songDatabase.addSong("Rap", "Savage");
		songDatabase.addSong("Rap", "Gin and Juice");
		songDatabase.addSong("RnB", "Cranes in the Sky");
		songDatabase.addSong("RnB", "Break from Toronto");
		songDatabase.addSong("RnB", "Adorn");
		songDatabase.addSong("Jazz", "Always There");
		
		
		assertEquals("Rap", songDatabase.getGenreOfSong("Savage"));
		assertEquals("Rap", songDatabase.getGenreOfSong("Gin and Juice"));
		assertEquals("RnB", songDatabase.getGenreOfSong("Cranes in the Sky"));
		assertEquals("RnB", songDatabase.getGenreOfSong("Adorn"));
		assertEquals("RnB", songDatabase.getGenreOfSong("Break from Toronto"));
		assertEquals("Jazz", songDatabase.getGenreOfSong("Always There"));
		
		Set<String> rapSongs = songDatabase.getSongs("Rap");
		System.out.println("Rap Songs:" + rapSongs);
		
		String adornGenre = songDatabase.getGenreOfSong("Adorn");
		System.out.println("The genre of the song Adorn is: " + adornGenre);
		
		String ginAndJuiceGenre = songDatabase.getGenreOfSong("Gin and Juice");
		System.out.println("The genre of the song Gin and Juice is: " + ginAndJuiceGenre);
		
		
	
		
		
		
	}
	
}
