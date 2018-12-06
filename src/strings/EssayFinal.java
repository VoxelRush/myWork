package strings;

public class EssayFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Essay voting = new Essay();
			voting.setName("Mr Osterberg");
			voting.setText("Some sort of Amazing Text about Voting");
			System.out.println("authors last name: " + voting.lastname());
			System.out.println("Number of letters in the authors first name:" + voting.firstname());
			System.out.println("The letter x in authors name: " + voting.findletter());
			System.out.println("The number of words in the essay: " + voting.words());
	}

}
