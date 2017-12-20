package com.walmart.oms.testing.picocontainer;

import java.util.ArrayList;
import java.util.Collection;

import com.walmart.oms.testing.picocontainer.exemplo1.Movie;
import com.walmart.oms.testing.picocontainer.exemplo1.MovieCollection;

import cucumber.api.java.en.Given;

public class GivenSteps {

	private Movie movie;
	private MovieCollection movieCollection;

	public GivenSteps(MovieCollection movieCollection) {
		this.movieCollection = movieCollection;
	}
	
	@Given("^a movie called \"([^\"]*)\"$")
	public void a_movie_called(String title) throws Throwable {
		movie = new Movie();
		movie.setTitle(title);
	}

	@Given("^its director is \"([^\"]*)\"$")
	public void its_director_is(String director) throws Throwable {
		movie.setDirector(director);
	}

	@Given("^its casting contains the actors \"([^\"]*)\"$")
	public void its_casting_contains_the_actors(String casting) throws Throwable {
		Collection<String> castingCollection = new ArrayList<String>();
		for (String actor : casting.split(",")) {
			castingCollection.add(actor);
		}
		movie.setCasting(castingCollection);
		
		movieCollection.setMovie(movie);
	}

	
}
