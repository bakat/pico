package com.walmart.oms.testing.picocontainer.exemplo1;



public class Execution {

	private MovieCollection movieCollection;
	
	public Execution(MovieCollection movieCollection) {
		this.movieCollection = movieCollection;
	}
	
	public void play(){
		for (Movie movie : movieCollection.getMovies()) {
			System.out.println("===== Scenario =====");
			System.out.println("Now playing: " + movie.getTitle());
			System.out.println("Director: " + movie.getDirector());
			for (String staring : movie.getCasting()) {
				System.out.println("With actor: " + staring);
			}
		}
	}
}
