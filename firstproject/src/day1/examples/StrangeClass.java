package day1.examples;

	
	public class StrangeClass{

		private static StrangeClass instance = null ;


		private StrangeClass() {

		}

		public static StrangeClass getInstance() {

		if ( instance == null ) {

		instance = new StrangeClass();

		}

		return instance ;

		}

		
}