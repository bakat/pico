Feature: Testing behavior sharing with Picocontainer

Scenario: Container should hold the list of movies
	Given a movie called "Capote"
	And its director is "Bennet Miller"
	And its casting contains the actors "Philip Seymour Hoffman, Catherine Keener"
	When I search for the movies listing

Scenario: Container should hold another list of movies
	Given a movie called "Transformers"
	And its director is "Michael Bay"
	And its casting contains the actors "Megan Fox, Shia LaBeouf, Tyrese Gibson"
	When I search for the movies listing