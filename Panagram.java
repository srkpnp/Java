public class PangramChecker {
  public boolean check(String sentence){
    int ALPHABET_COUNT = 26;
    if (sentence == null) {
        return false;
    }
    Boolean[] alphabetMarker = new Boolean[ALPHABET_COUNT];
    //Arrays.fill(alphabetMarker, false);
    for (int j = 0; j < ALPHABET_COUNT; j++) {
        alphabetMarker[j] = false;
    } 
   
    int alphabetIndex = 0;
    sentence = sentence.toUpperCase();
    for (int i = 0; i < sentence.length(); i++) {
        if ('A' <= sentence.charAt(i) && sentence.charAt(i) <= 'Z') {
            alphabetIndex = sentence.charAt(i) - 'A';
            alphabetMarker[alphabetIndex] = true;
        }
    }
    for (boolean index : alphabetMarker) {
        if (!index) {
            return false;
        }
    }
    return true;
  }
}
