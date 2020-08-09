package com.diego;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.util.stream.Stream;

public class FileWordCounter implements Counter{

    //Regular expresion used to determine the end of a word
    private String ENDWORD_REGEX = "[ .,;:\"'\n¡!¿?\t]+";

    /**
     * This method creates a BufferedReader from a file(source), splits the content of this file in words
     * and counts the number of times each word appears.
     * Finally, this method prints in the standar output these words ordered by their number of appearances.
     *
     * @param source
     */
    @Override
    public void count(String source) {
        List<WordInfo> wordStorage = new ArrayList<>();
        //index is a hashmap where its keys are the words of the file and its values are the positions
        //of wordStorage that contain the wordInfo of each word
        Map<String,Integer> index = new HashMap<>();
        //Using this two data structures it is possible to know if a word has already been read and access to its
        //wordInfo in a complexity of O(1)

        try {
            BufferedReader file = new BufferedReader(new FileReader(source));
            file
                .lines()
                .flatMap(line -> Stream.of(line.split(ENDWORD_REGEX)))
                .forEach( word -> {
                                    if(index.get(word)!=null)
                                        wordStorage.get(index.get(word)).plusOne();
                                    else if(!word.equals("")){
                                        index.put(word,wordStorage.size());
                                        wordStorage.add(new WordInfo(word));
                                    }
                    });

            //After sorting the arrayList with info of each word the positions of the hashmap are not correct anymore,
            //but since this hashmap is no longer necessary this does not pose any problem
            Collections.sort(wordStorage);

            wordStorage.forEach( word -> System.out.print(word.toString()));

        }catch (FileNotFoundException e) {
            System.out.println("The requested file could not be processed correctly, it may be due to an error in the entered path or because the file is damaged.");
        }

    }
}
