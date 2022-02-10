
public class Fitness {

		private int burpee_number;
		private int pushup_number;
		private int situp_number;
		private int squat_number;

		public Fitness (int burpee_number, int pushup_number, int situp_number, int squat_number) {
			  
			this.burpee_number = burpee_number;
			this.pushup_number = pushup_number;
			this.situp_number = situp_number;
			this.squat_number = squat_number;
			
		}
		

		public int getBurpee_number() {
			return burpee_number;
		}

		public void setBurpee_number(int burpee_number) {
			this.burpee_number = burpee_number;
		}

		public int getPushup_number() {
			return pushup_number;
		}

		public void setPushup_number(int pushup_number) {
			this.pushup_number = pushup_number;
		}

		public int getSitup_number() {
			return situp_number;
		}

		public void setSitup_number(int situp_number) {
			this.situp_number = situp_number;
		}

		public int getSquat_number() {
			return squat_number;
		}

		public void setSquat_number(int squat_number) {
			this.squat_number = squat_number;
		}
		
		public void doYourMove (String typeofMovement, int number ) {
			
			if (typeofMovement.equals("Burpee")) {
				
				doBurpee(number);
			
			}
			else if (typeofMovement.equals("Pushup")) {
				
				doPushup(number);
				
			}
			
			else if (typeofMovement.equals("Situp")) {
				
				doSitup(number);
			
			}
			else if (typeofMovement.equals("Squat")) {
				
				doSquat(number);
				
			}
			
			else {
				
				System.out.println("Not Valid Movement");
			}
			
		}
		
		public void doBurpee (int number) {
			
			if (burpee_number == 0 ) {
				
				System.out.println("There is not any movement");
			}
			if (burpee_number - number < 0 ) {
				System.out.println("You reach your target!");
				burpee_number = 0;
				System.out.println("Remain burpee: " +burpee_number);
			}
			
			else {
				
				burpee_number -= number;
				
				System.out.println("Remain burpee: " +burpee_number);
			}
		}
		
		public void doPushup (int number) {
			
			if (pushup_number == 0 ) {
				
				System.out.println("There is not any movement");
			}
			if (pushup_number - number < 0 ) {
				System.out.println("You reach your target!");
				pushup_number = 0;
				System.out.println("Remain pushup: " +pushup_number);
			}
			
			else {
				
				pushup_number -= number;
				
				System.out.println("Remain pushup: " +pushup_number);
			}
		}
		
		public void doSitup (int number) {
			
			if (situp_number == 0 ) {
				
				System.out.println("There is not any movement");
			}
			if (situp_number - number < 0 ) {
				System.out.println("You reach your target!");
				situp_number = 0;
				System.out.println("Remain situp: " +situp_number);
			}
			
			else {
				
				situp_number -= number;
				
				System.out.println("Remain situp: " +situp_number);
			}
		}
		
		public void doSquat (int number) {
			
			if (squat_number == 0 ) {
				
				System.out.println("There is not any movement");
			}
			if (squat_number - number < 0 ) {
				System.out.println("You reach your target!");
				squat_number = 0;
				System.out.println("Remain squat: " +squat_number);
			}
			
			else {
				
				burpee_number -= number;
				
				System.out.println("Remain squat: " +squat_number);
			}
		}
		
		public boolean FitnessFinish () {
			return (burpee_number ==0 ) && (pushup_number ==0 ) && (situp_number ==0 ) && (squat_number ==0 );
		}
	}
	
