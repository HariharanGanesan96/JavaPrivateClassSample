package song;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class SongClass {
      private String name,artist,songType;
      private double rating;
      private int numberOfDownloads;
      private Date dateDownloaded;
	@Override
	public String toString() {
		SimpleDateFormat formet=new SimpleDateFormat("dd-MM-yyyy");
		formet.format(dateDownloaded);
		return "name:" + name +
				"\nartist=" + artist +
				"\nsongType=" + songType +
				"\nrating=" + rating+
				"\nnumberOfDownloads=" + numberOfDownloads +
				"\ndateDownloaded=" + dateDownloaded;
	}
	public SongClass(String name, String artist, String songType, double rating, int numberOfDownloads,
			Date dateDownloaded) {
		super();
		this.name = name;
		this.artist = artist;
		this.songType = songType;
		this.rating = rating;
		this.numberOfDownloads = numberOfDownloads;
		this.dateDownloaded = dateDownloaded;
	}
	public SongClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getSongType() {
		return songType;
	}
	public void setSongType(String songType) {
		this.songType = songType;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public int getNumberOfDownloads() {
		return numberOfDownloads;
	}
	public void setNumberOfDownloads(int numberOfDownloads) {
		this.numberOfDownloads = numberOfDownloads;
	}
	public Date getDateDownloaded() {
		return dateDownloaded;
	}
	public void setDateDownloaded(Date dateDownloaded) {
		this.dateDownloaded = dateDownloaded;
	}
	@Override
	public int hashCode() {
		return Objects.hash(artist, name, songType);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SongClass other = (SongClass) obj;
		return Objects.equals(artist, other.artist) && Objects.equals(name, other.name)
				&& Objects.equals(songType, other.songType);
	}
	
}
