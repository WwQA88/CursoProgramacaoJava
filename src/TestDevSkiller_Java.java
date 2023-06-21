
public class TestDevSkiller_Java {

	public String findFirstRepeatedWords(String paragraph) {

		// TODO - Your code goes here, within this method.
		
		paragraph = "Hello: hello my fellow candidate.";
		String paragraphNew = paragraph.replace("Hello: hello my fellow candidate.","my").toLowerCase();
		
		return paragraphNew.toLowerCase();
	}

}
