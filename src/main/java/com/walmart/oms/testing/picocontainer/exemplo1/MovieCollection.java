package com.walmart.oms.testing.picocontainer.exemplo1;

import java.util.ArrayList;
import java.util.Collection;

public class MovieCollection {

	private Collection<Movie> movies = null;

	public Collection<Movie> getMovies() {
		return movies;
	}

	public void setMovies(Collection<Movie> movies) {
		if(movies == null){
			movies = new ArrayList<Movie>();
		}
		this.movies = movies;
	}
	
	public void setMovie(Movie movie){
		if(movies == null){
			movies = new ArrayList<Movie>();
		}
		movies.add(movie);
	}
	
}
