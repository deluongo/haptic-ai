![Haptic-AI](https://image.ibb.co/i8JUqk/Haptic.png)

<br>


> ### Call prospects when they'll answer...ready to by! <br><br>

***

**Team Members:** Devon Luongo, Sachin Srivastava <br>
**Type:** Application <br>
**App Title:** Haptic AI <br>
**Additional Material:** [Business Case + Wireframes](https://docs.google.com/presentation/d/1YNkr0vSsT9y_mvXLjKW_T71zLKojRr4w9DjDJj0V8us/edit#slide=id.g35ed75ccf_044), [Planning Doc](https://docs.google.com/document/d/1bzznT-5vUPEV0hN3z91t7_Lj6UrP3o-TRoLj7uEUcJI/edit) <br>

***

### Elevator Pitch: 
Haptic AI allows inside sales representatives to leverage the power of machine learning to increase response rates on outbound communication, by using a gamified, 4-step feedback loop that takes less than 15 seconds per touchpoint to complete.

### Feature Overview:  
The application will load a contact list of prospects, sort that list by expected value (deal size + response rate + close rate), display a prospect profile when prompted, facilitate outreach (phone, email, or social media), prompt the rep to score the results of the touchpoint, and display a leaderboard/scoreboard. 

* <small>(sorted)</small> Contact List
* Prospect Profile
* Feedback Page
* Leaderboard/Scoreboard

The project is a web application called Haptic AI that feeds Sales Reps  a list of "next steps" or "actions" that are most profitable (i.e. have the highest expected value). Devon Luongo is working on a deep learning algorithm for a Next Gen CRM/SalesForce that increases response rates by leveraging data stored in Marketing Automation and Sales Force. The Data Science portion is an ongoing effort, so this will simply be the CRM/SalesForce front end tool. The algorithm itself outputs a “score”, so we can easily mock this in our schema. 

From a user perspective, a Sales Rep opens up a dashboard. They see a sorted list of all their sales targets. Clicking on a particular prospect (line item) fires up a customer profile, call/email template, etc. After the call/email is placed, each rep has an opportunity to quickly log the quality and outcome of the touchpoint. This loop models the behavior of inside sales and outbound telesales reps. The goal is to increase response rates. 

### Goal:
The goal of the Haptic AI project is to create a system with a fully functional tool ready to be used in Market Research and to secure funding. A milestone of this goal (the web application tool) serves as the final project for the CSCI E-56 class. This web application would set up the fundamental database architecture for the traditional CRM and use a modular approach which can enhance the feedback loop process described above.


### Contribution Breakdown

![Code Additions](https://image.ibb.co/fNAMak/Contributor_Additions.png)


### Accomplishments:

**Devon**



	* Back End:
		- Security
			- Implemented Spring Security Plugin & Authorization
		- Domain Classes
			- Defined all domain class relationships and hierarchies
			- Includes support for many-2-many, 1-to-many, and 1-to-1 relationships with Cascade enabled for a 5 level table relationship. Lead, Company, Contacts, EmailAddress (PhoneNumbers, WebSites, SocialNetworks, ReviewSites, and Addresses) all update on with a single save method. As do User, Employee, Team, Employee Details, and EmailAddress (etc)
			- Domain Class Validation (everything after Milestone 1) 
		- Init
			- Bootstrapped data (after milestone 1)
		- TagLib
			- Used a TagLib to dynamically update CRM related contact data via Ajax so that contacts and the accompanying contact details (Name, Job Title, Role, etc) update when a lead is selected in the left hand list (nav) and when a contact specific modal tab is clicked.
		- Custom Transient functions
			- Fixed random ordering changes in front end lists caused by the g:each tag by creating custom transients that sort lead lists and contact lists by their associated prospecting value. 
		- Controllers
			- Dashboard Controller
				- All Methods
					- Supports backend for front end nested AJAX calls
					- Designed to solve multiple, complex problems with passing complex data structures (objects, arrays, JSON, etc.) located inside a parent div rendered by AJAX to the jQuery event handlers required to manages two different types of forms across myriad bootstrap modals. 
		- Tests
			- Domain Class Tests (part of Milestone 1 and after)
			- Integration Test
			- Functional Tests
		- All Commenting
    
	* Front End:
    - JS
      - x-editable forms
				- Added custom methods to Library code to support radio buttons
				- Implemented custom inline forms that move to the next input upon completion
				- Created context dependent dropdown menus
				- Coded ajax event handeling to enable x-editable forms from within a previously rendered AJAX template by anchoring the parent .on method to an element outside the nested AJAX render hierarchy
				- Pulled in drop down options dynamically from domain class variable values on the back end (not working for x-editable inside AJAX, worked on first page load)
			- Material Forms
				 - Pulled in drop down options dynamically from domain class variable values on the back end 
			- Bootstrap Modal
				- Implemented Bootstrap modals
				- Enabled modals to access params and handle form submits even when inside a parent div rendered by Ajax
			- KPI charts
				- Charts update by clicking their title
				- Designed to update in realtime as data regarding team sales progress updates the backend with data from many users.
		
    - Library Integration
			- Bootstrap
			- jQuery
			- x-editable
			- Material Forms
			- Portlets
			- Form Input Masking
			- Charts.js
			- (plus all additional)
		- Views
			- HTML
				- Broken into Grails Templates to support multi-level, nested AJAX rendering
				- ID’s, Classes defined, managed to work with JS and CSS
				- Defined responsive grid layout with 3 unique layouts
				- Created hidden event based warnings & notifications 
				- 
			- CSS
				- Working responsive design (needs further mobile enhancement)
				- KPI’s are horizontally scrollable and resized by screen size
				- All UI/UX design and implementation
				- Event based, contextual coloring of warnings & notifications
				- (all code)


**Sachin**

	* Back End
		- Bootstrap Data (up to Milestone 1)
		- Domain Class Unit Tests (from Milestone 1)
		- Domain Class Validation (from Milestone 1)

	* Front End
		- Activity Model JS (code has not been pushed to GitHub)
		- Ability to access parameters from backend after Ajax render
		- Ability to submit form (objects did not save properly)





