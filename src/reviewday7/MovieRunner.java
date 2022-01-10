package reviewday7;

public class MovieRunner extends Movie{


		// TODO Auto-generated method stub

	//  2. Create another class: MovieRunner and do the followings
	//  Create main method
	//  Create 3 Movie objects and assign values of your choice. 
	//  Example:
	//  Move name=starWars
	//  duration=120
	//  isGood=true
	//  And print the movie info
	    
	   
		public static void main(String[] args) {
			
		
		//Creating MovieRunner object
	        MovieRunner starWars=new MovieRunner();
	        //Assigning name
	        starWars.setName("Star Wars");
	//        starWars.setName("Star Wars");
	        //Assigning duration
	        starWars.duration=120;
	       // starWars.duration=120;
	        //Assigning is good or not
	        starWars.isGood=true;
	       // starWars.isGood=true;
	        //Calling movieInfo method to pring movie information faster
	        starWars.movieInfo();
	        //Print if movie short or long
	        starWars.shortOrLong();
	       
	}

}
