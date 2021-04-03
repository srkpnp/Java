public class Troll {
    public static String disemvowel(String str) {
   
      StringBuilder sb = new StringBuilder();
      for (int i=0; i<str.length(); i++) {
        switch(Character.toLowerCase(str.charAt(i))) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
              sb.append("");
              break;
            default:
              sb.append(str.charAt(i));
              break;
        }
      }
      return sb.toString();
    }
}
