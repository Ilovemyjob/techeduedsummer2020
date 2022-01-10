package reviewday6;

public class CaseRunner {
	
	 /*
     * Create CaseRunner class actualCase=Covid 19 isTested=true conclusion=Tested
     * Negative if conclusion contains "negative" print "You can go to work"
     * otherwise print "15 days quarantine"
     */
    //Step1: Create a class object
    //Step2: Use that class object and setter method to assign value
    //Step3: Use that class object and getter method to get the value
    
    public static void main(String[] args) {
        // I must use setter method to assign values
        Case caseObject = new Case();
        
        //Using the Case class object, we can assign the values using setter method
        caseObject.setActualCase("Covid 19");
        caseObject.setTested(true);
        caseObject.setConclusion("Tested NEGATIVE");
        
        System.out.println("Actual Case : "+caseObject.getActualCase());
        System.out.println("Tested : "+caseObject.isTested());
        System.out.println("Conclusion : "+caseObject.getConclusion());
        
        if(caseObject.getConclusion().toLowerCase().contains("negative")) {
            System.out.println("You can go to work");
        }else {
            System.out.println("15 days quarantine");
        }
        
        //Create patient object or use Patient class variables
        Patient patient=new Patient();
        patient.setFirstName("John");
        patient.setLastName("Cash");
        System.out.println("First Name : "+patient.getFirstName());
        System.out.println("Last Name : "+patient.getLastName());
        
        //setCaseOptions Accepts Case Object
        //Step: We are using setter to assing the value
        patient.setCaseOptions(caseObject);
        
        //Step: Used class object and getter to print the values
        System.out.println(patient.getCaseOptions().getActualCase());
        System.out.println(patient.getCaseOptions().isTested());
        System.out.println(patient.getCaseOptions().getConclusion());

        
        
    }
}
