package sdlc;

public class Day5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
Grooming meeting (en bastaki )=> 
It is done before all other meetings and 
we talk about the details of the user stories.(to understand user story)

We have 
1-Grooming meeting => they go over user stories
2-sprint planning meeting
3-daily scrum meeting
4-Sprint review meeting
5-Sprint retrospective meeting 

SDLC => Software Development life cycle
STLC => Software Testing Life Cycle

*Interview Question
If you disagree on some issue with your developers,
how do you solve your conflict?
We can definitely talk with them whatever issue
 we face as the communication is the best to solve them.
I can arrange KT(Knowledge Transfer) session and 
we can go over the issues that we have because nothing is personal
 and everyone works for company benefits and the success is the whole team's success.

What should be the Definition of Done for a tester?
DOD => Definition of Done!
So the most important thing for me is that
 the application we are testing is in line with the requirements.
The actual result should match the expected result!

*Interview Question
When you start your sprint and the application or functionalities 
are not created yet, what do you do at that time?
I need to analyse my user stories and create test cases accordingly.

User story example:

    1-Title: 
Enter Personal Identification Number (PIN) 
	2-Description:
As an ATM user, I want to enter my PIN So that I can withdraw cash 
	3-Acceptance Criteria: 
AC1 => PIN must be four digits long  =>  Definition of Done
AC2 => PIN must not allow special characters => Definition of Done
AC3 => PIN must be entered within 30 seconds or 
the transaction will be canceled => Definition of Done



As an ATM user, I want to enter my PIN So that I can withdraw cash 
String transaction = "12345"; You do not meet the DOD
if(transaction.length() != 4)

String transaction = "123*(45"; You did not meet the Definition of Done here
String transaction = "1234"; => Definition of Done

ACS are the detailed requirements we have 
in any user story and DOD means they are done as expected!


You just organize a meeting (KT) and share the user stories with your tester team members


Environments in Testing
Dev environment =>	 Different Database => 
Test environment =>  Different Database
Stage environment => Different Database=- (PREPRODUCTION- create pro. before relase
Production environment => https://www.facebook.com/ => -face sayfasi-Different Database
Database => is kind of storage where we have the data about the users of the product

Smoke test =>(every dAY) The critical functionalities you have are called smoke test

ONEM SIRASI
1- Your prod environemnt => https://www.facebook.com/
2- Login page (more important)=> where we have username and password textboxes
3- Homepage => where you have all other functionalities
4- Private info => 

*What are your responsibilities in your current team?
I always run my smoke test early in the morning and 
send the notifications(reports) to correspondant people
Automation testers are responsible to run the smoke test everyday.


Regression testing =>
Minor regression => When you test all functionalities 
at the end of the sprint, it is called regression testing.
Major regresson => When we test all the functioanlities 
if they work as expected at the end of three month-release,
 it is also called regression testing

As an automation tester, we are always responsible for smoke and regression tests


Who creates the test cases in your team?
Mostly our functional testers create the test cases,
 but also in case we need, I can create them

A test case  has many components, but the most important ones are:
The steps:The actual result and expected result<===

You are asked to test facebook login page;
username = "userFaceBook"
password = "1g54h23gy"

These are invalid credentials 
The actual result=> The password you’ve entered is incorrect. Forgot Password?
the expected result => You should have a warning message 
that it is not a valid user name or password

Status: Pass

Steps:
Go to the environment => https://www.facebook.com/
step_2 => click on the username textbox
step_3 => type the username in the textbox
step_4 => click on the password textbox
step_5 => type your password in the textbox 
step_6 => click on the login button


A test case often contains: 
Test Case ID:        The ID of the test case. 
Title: 	The summary / objective of the test case. 
Test steps: 	Step-by-step procedure to execute the test. 
Test Data: 	The test data, or links to the test data, 
that are to be used while conducting the test. 
Expected result: 	The expected result of the  actual test: 
The actual result of the test: 	to be filled after executing the test. 
Status:	 Pass or Fail

*Interview Question
Do you guys do any anula testing?
Yes, I do 20 % of manual testing and 80 % of atomation testing.

===STLC steps:===(ONEMLI)
Requiremnent analysis
Test planning
Test case Development
Test environment set-up
Text execution =>  you start typing your scripts now
Test cycle closure


What is the main difference between the smoke and regression test?
Th.e smoke test contains only critical functionalities,
but the regression testing contains all functionalities to see 
if they work together at the end of a sprint of a big release like three month-period.
4 to 8 hours => for regression testing
smoke test => 15 minutes 

Homepage is critical
Login page is critical
environment is down 
all these three functionalities can be in your smoke test

=>Feature 
1->Epic => is higher description of a functionaity
Homepage is critical US=> is a smaller description of a functionality
Login page is critical
environment is down 
2-> epic
messages 
posts 
friends
3->epic => consists of user stories
invitations
marketplace
likes and dislikes
albums

Big > to smaller
*Feature => contains epics
Epic => user stories
User story => contains acceptance criteria

What is the period of regression?
Every sprint => 2 - 4 weeks => minor regression
three month period => major resgression

user story => 
priority =>  high priority
			 medium priority
			 low priority
severity     high severity
			 medium severity
			 low severity

Red car is more expensive => high priority(COK ONEMLI DEMEK)
grey one is cheaper =>       medium priority

grey one is more damaged => high severity(COK ZARAR VAR DEMEK)
Red car is less damaged => medium severity
		 */
	}

}
