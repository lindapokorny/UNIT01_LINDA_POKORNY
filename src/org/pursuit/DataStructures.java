package org.pursuit;

import java.util.*;

public interface DataStructures {

    public abstract char[] stringToCharAray(String word);

    HashSet<Character> multiplicationTableList(int number);

    HashMap<String, Integer> wordLength(String[] wordArray);

    HashSet<Character> uniqueCharacters(String word);
}
