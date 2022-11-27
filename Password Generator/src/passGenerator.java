
public class passGenerator {

	private String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private int n = letters.length();

    private String generate(int len) {
        String pass = "";
        for (int i = 0; i < len; i++) {
            int rand=( (int) (Math.random() * 100000)) % n;
            pass += letters.charAt(rand);
        }

        return pass;
    }

	public String excute(String len) {
		// TODO Auto-generated method stub
		return generate(Integer.parseInt(len));
	}
	
    
	
}
