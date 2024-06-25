Feature: Google Page Functionality

@sanity
Scenario: Search Functionality

	Given user navigates urlGoogle
	When user enters the text as Testing in the search
	And user clicks on search button
	Then user should be able to see the results page

@smoke
Scenario: Yahoo Search Functionality

	Given user navigates urlYahoo
	When user enters the text as Testing
	And user clicks on search
	Then user should be able to see the results