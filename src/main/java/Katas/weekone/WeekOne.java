package Katas.weekone;

public class WeekOne {
//    https://www.codewars.com/kata/decode-the-morse-code

    public static String decode(String morseCode) {
    // your brilliant code here, remember that you can access the preloaded Morse code table
        // through MorseCode.get(code)
        StringBuilder decoded = new StringBuilder();

        String spaceReplace = morseCode.replaceAll(" {3}", " = ");
        String[] split = spaceReplace.split(" ");
        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("=")) {
                decoded.append(" ");
            } else {
                decoded.append(MorseCode.get(split[i]));
            }
        }

    return decoded.toString();
    }
}
