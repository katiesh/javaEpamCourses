package epam.java;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Translator {
    private Map<String,String> vocabulary = new HashMap<>();
    private StringBuilder translated = new StringBuilder("");

    public StringBuilder getTranslated() {
        return translated;
    }

    public void add(String eng, String rus){
        vocabulary.put(eng,rus);
    }

    public void translateToRus(String eng){

        if(vocabulary.containsKey(eng)){
            translated.append(vocabulary.get(eng));
        }
        else {
            translated.append(eng);
        }
    }
}
