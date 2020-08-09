package com.diego;

/**
 * This class contains one String that represent the word and one int that counts how many times the word appears
 * in the file
 */
public class WordInfo implements Comparable<WordInfo> {
    private String word;
    private int cont;

    public WordInfo(String word) {
        this.word = word;
        this.cont = 1;
    }

    public String getWord() {
        return word;
    }

    public int getCont() {
        return cont;
    }

    public void plusOne(){
        this.cont++;
    }

    @Override
    public int compareTo(WordInfo wordInfo) {
        return this.cont < wordInfo.cont ? 1 : this.cont == wordInfo.cont ? 0 : -1;
    }

    @Override
    public String toString() {
        return word + " : " + cont + '\n';
    }
}
