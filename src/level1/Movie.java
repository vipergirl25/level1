package level1;

//1. Instantiate some Movie objects (at least 5).

	//2. Use the Movie class to get the ticket price of one of your movies.

	//3. Instantiate a NetflixQueue.
	//4. Add your movies to the Netflix queue.
	//5. Print all the movies in your queue.
	
	//6. Use your NetflixQueue object to finish the sentence "the best movie is...."
	//7. Use your NetflixQueue to finish the sentence "the second best movie is...." 


public class Movie implements Comparable<Movie> {
	public static void main(String[] args) {
		Movie movie1 = new Movie("bsgMiniseries", 1283);
		Movie movie2 = new Movie("Petes Dragon", 6);
		Movie movie3 = new Movie("Glee", 5);
		Movie movie4 = new Movie("Supernatural", 4);
		Movie movie5 = new Movie("Twilight", 1);
		NetflixQueue netflix = new NetflixQueue();
		netflix.addMovie(movie1);
		netflix.addMovie(movie2);
		netflix.addMovie(movie3);
		netflix.addMovie(movie4);
		netflix.addMovie(movie5);
		netflix.printMovies();
		netflix.getBestMovie();
		netflix.sortMoviesByRating();
		Movie bestMovie = netflix.getBestMovie();
		Movie secondBestMovie = netflix.getSecondBestMovie();
		System.out.println("The best movie is" + bestMovie);
		System.out.println("The second best movie is" + secondBestMovie);
	}
	private String title;
	private int stars;

	public Movie(String title, int stars) {
		this.title = title;
		this.stars = stars;
	}

	public String getTitle() {
		return this.title;
	}

	public int getRating() {
		return this.stars;
	}

	public String toString() {
		return "\"" + title + "\" - " + stars + " stars";
	}

public String getTicketPrice() {
		if (this.stars > 2) {
			return "That will be $12 please.";
		} else if (this.title.contains("Twilight")) {
			return "This movie is so bad, we'll pay YOU to watch it!";
		} else {
			return "Don't waste your money on this horrible rubbish.";
		}
	}
 

	public int compareTo(Movie otherMovie) {
		int compareQuantity = otherMovie.getRating();

		// return this.stars - compareQuantity; //ascending order
		return compareQuantity - this.stars; // descending order
	}
}




