package Katas.weekone;

public class MorseCode {
    private final String A = ".-";
    private final String B = "-...";
    private final String C = "-.-.";
    private final String D = "-..";
    private final String E = ".";
    private final String F = "..-.";
    private final String G = "--.";
    private final String H = "....";
    private final String I = "..";
    private final String J = ".---";
    private final String K = "-.-";
    private final String L = ".-..";
    private final String M = "--";
    private final String N = "-.";
    private final String O = "---";
    private final String P = ".--.";
    private final String Q = "--.-";
    private final String R = ".-.";
    private final String S = "...";
    private final String T = "-";
    private final String U = "..-";
    private final String V = "...-";
    private final String W = ".--";
    private final String X = "-..-";
    private final String Y = "-.--";
    private final String Z = "--..";

    public String get(String morseCodeLetter) {
        String letter = "";
        switch (morseCodeLetter) {
            case ".-":
                letter = "A";
                break;
            case "-...":
                letter = "B";
                break;
            case "-.-.":
                letter = "C";
                break;
            case "-..":
                letter = "D";
                break;
            case ".":
                 letter = "E";
                 break;
            case "..-.":
                letter = "F";
                break;
            case "--.":
                letter = "G";
                break;
            case "....":
                letter = "H";
                break;
            case "..":
                letter = "I";
                break;
            case ".---":
                letter = "J";
                break;
            case "-.-":
                letter = "K";
                break;
            case ".-..":
                letter = "L";
                break;
            case "--":
                letter = "M";
                break;
            case "-.":
                letter = "N";
                break;
            case "---":
                letter = "O";
                break;
            case ".--.":
                letter = "P";
                break;
            case "--.-":
                letter = "Q";
                break;
            case ".-.":
                letter = "R";
                break;
            case "...":
                letter = "S";
                break;
            case "-":
                letter = "T";
                break;
            case "..-":
                letter = "U";
                break;
            case "...-":
                letter = "V";
                break;
            case ".--":
                letter = "W";
                break;
            case "-..-":
                letter = "X";
                break;
            case "-.--":
                letter = "Y";
                break;
            case "--..":
                letter = "Z";
                break;
        }
        return letter;
    }
}
