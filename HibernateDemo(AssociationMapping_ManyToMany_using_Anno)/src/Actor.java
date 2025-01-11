
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "hib_actor")
public class Actor {
	@Id
	@Column(name = "actor_id")
	private int actorId;

	@Column(name = "actor_name", length = 20, nullable = true)
	private String actorName;

	@ManyToMany
	@JoinTable(name = "hib_actor_movie", joinColumns = @JoinColumn(name = "actId"), inverseJoinColumns = @JoinColumn(name = "movId"))
	Set<Movie> movies;

	public Actor(int actorId, String actorName, Set<Movie> movies) {
		super();
		this.actorId = actorId;
		this.actorName = actorName;
		this.movies = movies;
	}

	public Actor() {
	}

	public int getActorId() {
		return actorId;
	}

	public void setActorId(int actorId) {
		this.actorId = actorId;
	}

	public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

	public Set<Movie> getMovies() {
		return movies;
	}

	public void setMovies(Set<Movie> movies) {
		this.movies = movies;
	}

	@Override
	public String toString() {
		return "Actor [actorId=" + actorId + ", actorName=" + actorName + ", movies=" + movies + "]";
	}

}