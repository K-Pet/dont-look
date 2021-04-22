/**
 * 
 */
package org.howard.edu.lsp.exam.question42;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
/**
 * @author Kobe
 *
 */
class SongsDatabaseTest {

	/**
	 * Test to add song to database
	 */
	@Test
	@DisplayName("Test for add songs")
	void testAddSongs() {
		SongsDatabase db = new SongsDatabase();
		db.addSong("Rap", "Savage");
		db.addSong("Rap", "Gin and Juice");
		db.addSong("Jazz", "Always There");
		String database = db.toString();
		assertEquals("{Rap=[Savage, Gin and Juice], Jazz=[Always There]}", database); 
		}
	/**
	 * Test to get songs from database
	 */
	@Test
	@DisplayName("Test for get songs")
	void testGetSongs() {
		SongsDatabase db = new SongsDatabase();
		db.addSong("Rap", "Savage");
		db.addSong("Rap", "Gin and Juice");
		db.addSong("Jazz", "Always There");
		Set<String> songs = new HashSet();
		songs.add("Always There");
		assertEquals(db.getSongs("Jazz"), songs);
		}
	/**
	 * Test to get genre of song
	 */
	@Test
	@DisplayName("Test for get genre")
	void testGetGenre() {
		SongsDatabase db = new SongsDatabase();
		db.addSong("Rap", "Savage");
		db.addSong("Rap", "Gin and Juice");
		db.addSong("Jazz", "Always There");
		String genre = db.getGenreOfSong("Savage");
		assertEquals("Rap", genre);
		}
	}