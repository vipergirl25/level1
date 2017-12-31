package level1;
/**
 * The Tea Party
 * 
 * Description
 * 
 * You are dead – but that doesn’t mean you can’t throw a social event. In heaven you are famous for your
 * extraordinary tea parties. This time the guest list is quite astonishing – 8 famous British people
   * announced their visit. So don’t mess up!
 * 
 * Your task is to welcome your guests properly: Some are female and some were knighted by the queen. So greet
 * them correctly – or this will be your last hosting.
 * 
 * For example: -Jane Austen is a women, so say Hello Ms. Austen -George Orwell is a man, so say Hello Mr.
 * Orwell -Isaac Newton was knighted, so say Hello Sir Newton
 * 
 * Here are unit tests you can use to check your welcome method: http://bit.ly/1ou3kOG
 *
 * Good luck with your party!
 **/
public class TeaParty {
	
public static String welcome(String lastName, boolean isWoman, boolean isKnighted)
    {
	String title = "";
	if(isWoman==true) {
		title = "Ms";
	}else if(isWoman == false & isKnighted == true) {
		title = "Sir";
	}else if(isWoman == false) {
		title = "Mr";
	}
	if(isWoman==false & isKnighted==true) {
		return "Hello " + title + " " + lastName;
	}
	else {
		return "Hello " + title + ". " + lastName;
	}
	
    }
public static void main(String[] args) {
	System.out.println(welcome("Austen", true, false));
	System.out.println(welcome("Orwell", false, false));
	System.out.println(welcome("Newton", false, true));
}
}




