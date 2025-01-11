

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="hib_movie")
public class Movie {
    @Id
    @Column(name="movie_id")
    private int movieId;

    @Column(name="movie_name", length=20)
    private String movieName;

    @ManyToMany(mappedBy="movies")
    Set<Actor> actors;

	public Movie() {
	}

	public Movie(int movieId, String movieName, Set<Actor> actors) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.actors = actors;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public Set<Actor> getActors() {
		return actors;
	}

	public void setActors(Set<Actor> actors) {
		this.actors = actors;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + "]";
	}
	
    
}