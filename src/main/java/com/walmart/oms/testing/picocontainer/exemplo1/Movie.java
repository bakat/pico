package com.walmart.oms.testing.picocontainer.exemplo1;

import java.util.Collection;

public class Movie {

	private String title;
	private String director;
	private Collection<String> casting;
	
	public Movie() {
		// TODO Auto-generated constructor stub
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public Collection<String> getCasting() {
		return casting;
	}

	public void setCasting(Collection<String> casting) {
		this.casting = casting;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", director=" + director
				+ ", casting=" + casting + "]";
	}
	
}
