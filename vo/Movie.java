package vo;

public class Movie {
	private int id;
	private String title;
	private int years;
	private float rating;
	private String genre;
	private String ratio;
	private String director;
	public int getId() {
		return id;
	}
	public Movie setId(int id) {
		this.id = id;
		return this;
	}
	public String getTitle() {
		return title;
	}
	public Movie setTitle(String title) {
		this.title = title;
		return this;
	}
	public int getYears() {
		return years;
	}
	public Movie setYears(int years) {
		this.years = years;
		return this;
	}
	public float getRating() {
		return rating;
	}
	public Movie setRating(float rating) {
		this.rating = rating;
		return this;
	}
	public String getGenre() {
		return genre;
	}
	public Movie setGenre(String genre) {
		this.genre = genre;
		return this;
	}
	public String getRatio() {
		return ratio;
	}
	public Movie setRatio(String ratio) {
		this.ratio = ratio;
		return this;
	}
	public String getDirector() {
		return director;
	}
	public Movie setDirector(String director) {
		this.director = director;
		return this;
	}
}
