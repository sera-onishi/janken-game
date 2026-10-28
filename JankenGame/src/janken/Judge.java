package janken;

public class Judge {

	public String judge(String handA, String handB) {

	    if (handA.equals(handB)) {
	        return "DRAW";
	    }

	    if (
	        (handA.equals("グー") && handB.equals("チョキ")) ||
	        (handA.equals("チョキ") && handB.equals("パー")) ||
	        (handA.equals("パー") && handB.equals("グー"))
	    ) {
	        return "A_WIN";
	    }

	    return "B_WIN";
	}
}