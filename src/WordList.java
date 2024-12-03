public class WordList {
    // Instance variables
    private String wordList;
    private String wordTest;

    // Constructor
    public WordList() {
        wordList = "play,one,order,would,still,number,than,around,higher,less,know,less,power,through,number,could,we,take,against,stand,call,he,with,a,so,those,if,any,say,for,be,plan,each,give,which,face,first,increase,child,after,course,much,show,the,just,line,most,form,will,under,need,one,might,become,by,find,how,against,follow,all";
        wordTest = "";
    }

    // Getter for the word list
    public String getWordList() {
        return wordList;
    }

    // Generates a random list of 15 words
    public void generateWordTest() {
        wordTest = ""; // Reset wordTest for fresh generation
        int wordCount = 0; // Tracks the number of words added

        while (wordCount < 15) {
            // Generate a random index within the length of the string
            int randomIndex = (int) (Math.random() * wordList.length());

            // Locate the word starting at the random index
            int start = randomIndex;
            int end = randomIndex;

            // Move to the start of the word (preceding comma or start of string)
            while (start > 0 && wordList.charAt(start - 1) != ',') {
                start--;
            }

            // Move to the end of the word (next comma or end of string)
            while (end < wordList.length() && wordList.charAt(end) != ',') {
                end++;
            }

            // Extract the word
            String word = wordList.substring(start, end);

            // Append the word to the test string with a comma
            wordTest += word + ",";
            wordCount++;
        }

        // Remove the trailing comma
        if (wordTest.endsWith(",")) {
            wordTest = wordTest.substring(0, wordTest.length() - 1);
        }
    }

    // Getter for the random word test
    public String getWordTest() {
        return wordTest;
    }

    // Main method to test the class
    public static void main(String[] args) {
        WordList wordList = new WordList();
        wordList.generateWordTest();
        System.out.println("Random Word List: " + wordList.getWordTest());
    }
}

