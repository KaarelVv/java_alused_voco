package week6.libaryInformationSystem_ex101;

public class StringUtils {
    public static boolean included(String word, String searched){
        return  word.trim().toUpperCase().contains(searched.trim().toUpperCase());
    }
}
