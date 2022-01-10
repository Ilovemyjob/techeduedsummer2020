package reviewday6;

public class Patient {

		 /*
	     *Create a class: Patient
	     *Create 3 instance variables String firstName; String lastName; Case caseOptions; using encapsulation
	     *And create getters and setters
	     *Go to CaseRunner class
	     *Set your first and last name
	     *And print your current case using the Case class objects
	     */
	  //Encapsulation:data hiding, securing the data, protect the data
    private String firstName;//private=access modifier, String=data type, firstName=variable name
    private String lastName;
    private Case caseOptions;//private=access modifier, Data Type = Case
    
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Case getCaseOptions() {
        return caseOptions;
    }
    public void setCaseOptions(Case caseOptions) {
        this.caseOptions = caseOptions;
	
	    }
	
	
	
	}
