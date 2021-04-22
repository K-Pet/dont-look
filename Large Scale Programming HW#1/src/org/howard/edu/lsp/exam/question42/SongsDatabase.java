/**
 * 
 */
package org.howard.edu.lsp.exam.question42;
import java.util.*;

/**
 * @author Kobe
 *
 */
public class SongsDatabase {
	private Map<String, Set<String>> map = new HashMap<String, Set<String>>();
	/**
	 * adds songs to database
	 * @param genre
	 * @param songTitle
	 */
	public void addSong(String genre, String songTitle) {
		Set<String> g = map.get(genre);
		if (g == null) {
			g= new HashSet<String>( );
			map.put(genre, g);
		}
		g.add(songTitle);
	}
	/**
	 * Gets songs from database
	 * @param genre
	 * @return
	 */
	public Set<String> getSongs(String genre) {
		return map.get(genre);
	}
	/**
	 * Gets genre from song
	 * @param songTitle
	 * @return
	 */
	public String getGenreOfSong(String songTitle) {
		Set<String> myKeySet = map.keySet( );
		for (String s : myKeySet) {
			if (map.get(s).contains(songTitle)) {
				return s;
			}
		}
		return null;
	}

/**
 * Creates string from map for testing
 */
public String toString() {
	return map.toString();
	}
}