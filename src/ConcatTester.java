
public class ConcatTester {
	public static void main(String[] args) {
		String animal1 = "quick brown fox";
		String animal2 = "lazy dog";
		String article = "the";
		String action = "jumps over";
		
		
		String str1 = "the".concat(" ").concat(animal1).concat(" ").concat(animal2).concat(" ").concat(article).concat(" ").concat(action);
		int n = str1.length();
		System.out.println(str1);
		System.out.println(n);
		
	}

}
