package WordCountingArrays;

import java.util.Locale;

public class WordCountingCore {
    static void logicModule(){}

    static void WordCounting(String inputString){
        String[] wordString = inputString.toUpperCase(Locale.ROOT).split("[, ?.@!#$%^&*`~:;<>]+");

        int stringLength = wordString.length;

        String[] words = new String[stringLength];
        int[] wordCount = new int[stringLength];
        boolean isRepeatFlag = false;

        int stringAndCountIndex = 0;

        for(int i = 0; i<stringLength; i++) {

            for(int j = 0; j < stringAndCountIndex; j++) {
                if(wordString[i].equalsIgnoreCase(words[j])) {
                    isRepeatFlag = true;
                    wordCount[j]++;
                }
            }

            if(!isRepeatFlag){
                words[stringAndCountIndex] = wordString[i];
                wordCount[stringAndCountIndex]++;
                stringAndCountIndex++;
            }
            isRepeatFlag = false;
        }

        for(int i=0; i< stringAndCountIndex; i++) {
            System.out.println(words[i] + ": "+ wordCount[i]);
        }
    }
}
