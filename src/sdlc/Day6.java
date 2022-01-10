package sdlc;

public class Day6 {
/*
 * Testing types =>                   07/11/2020

Smoke test => we need to run smoke test to check 
if critical functionalities are working as expected on daily basis.

Regression test => we check all the functionalities 
that are recently added either in a sprint or three month period.
1-The one we run at the end of the sprint is Minor regression
2-The one we run every three month-period is called Major regression.
           
           ---- Black-box testing and White box testing----
When you are not able to see the internal structure of codes,
it is called black-box testing
Black-box testing does not require any technical knowledge.

Testing techniques
1-Equivalence Partitioning =>
you have about a thousand of username and passwords
usernames  hotmails / gmail / gov
passwords 1467264
you have 3 different catagories and they are 
ending with hotmail  gmail  gov 
 10 usernames 
 You are given different test data
 there are students of 10 schools
 username => Katie@schoolA.com
 there are 50 more students coming from school A
 username => Barry@schoolB.com
 there also 50 students coming from school B
 username => osman@schoolC.com
 there are also 50 students coming from school C
 and 
 surname => "morgan"
 You plan to catagorise
 pick 1 username and password from school A
 then pick another username and password from SchoolB
 then pick another username and password from School C
  then pick another username and password from School D

2-Boundary Value Analysis => 
When you check the minimum and maximum numbers, 
it is called Boundary value analysis
int age = 60;
16 => child
25 => teenager
30 40 => adult
after 50 => old
if(age == 1)
else if (age >= 0)
else if (age >= 25 && age <= 30)

Black-box testing is done or executed only by Testers

White box testing? 
It requires the internal structure of the codes
It requires a high level of technical skills
This type of testing is just done by Developers

-Unit testing =>(White box testing) testing the functionalities piece by piece
They are only done by Developers 

Integration testing => 
Login page => module when you test all components together
Home page  => module 
Friends module => module
When you put together all components and test them,
 it is called Integration testing.

Functional testing => 
Normally, as a  tester, whatever we test on web based applications
 related to functioanlities is called functional testing
Cross-Functional tester
Functional tester

As testers, we are always responsible for fonctional testing 
which means; smoke, regression, Integration, End-to-End testing

Functional tester => The people who do not need 
any technical knowledge to test the functionalities

Cross-functional team meber => can do both manual and automation testing

Do you also do manual testing?
Definetly yes
How much manual testing do you do?
20% manual testing and 80 % automation

Regression testing => Minor and Major regression
These are the functionalities that are already tested 
and we test them again and again before release to see 
if any recent added functionalities affect them or not.
When there is bug fix and the bug is returned as fixed 
by Developer, what should you do?

Retest the functionalty to see if it reproduces or not.
Retesting => you should always do it after a bug fix.

Regression => can be done either you have issue with
the functionalities or not. More specifically, need to
check all functionalties if they work fine as expected or not.

Smoke test => when we check the critical functionalities,
it is called smoke test.
We should check it every day
15 mins
Early morning, we should check the results of the smoke test
 at 8:30 or 9 am to report the results

System testing (End-to-End)
When you test all modules together as a single scenario 
to test everything related to DATABASE and UI or Back-end,
 then you are doing System testing. User Interface
 
Unit Testing => Integration testing=> smoke and regression testing=> System testing => User Acceptance Testing

(Graphic) UserIterface testing => Selenium WebDriver
Back-end testing => API
Database testing => SQL (Java Database Connectivity/JDBC)

You can find a job as;
Java + SDLC + Seleium UI testing 
Java + SDLC + API Back-end testing
Java + SDLC + Database testing 
You become a Full-stack Automation Engineer so this means 
your job opportunities will be way higher than any one else in the market
Jenkins
TestNG 
Cucumber
Junit
Git-GitHub
Jira
Selenium Grid
SQL 
OOP concept => 

Ad-hoc testing (monkey testing) => Providing different imputs and without any schedule

User Acceptance testing => 
you have a filter and as QA person you test all the functionalities
The functionalities go to UA testers
Then They test them as a final step to detect everything that might be left over
When they ask you if you have any UAT experience, we should always say: Yes.
UA Testers should have always users' perspectives 
and test the application as a client
You can inscrease addtionally the Test data in UAT team

Can you do Load and Stress testing?
No, I am a Cross-functional team member and I can do Smoke testing, 
Regression testing, end-to-endautomation testing and UA testing.

 */
}
