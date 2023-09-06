package com.wordpool.util;

import com.wordpool.model.Word;

public class WordUtil {
    public static void toAllUpperCase(Word word){
        word.setDescription(word.getDescription().toUpperCase());
        word.setTerm(word.getTerm().toUpperCase());
    }
}
