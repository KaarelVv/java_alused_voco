package week9.duplicate_remover.tools;

import java.util.*;

public class PersonalDuplicateRemover implements DuplicateRemover {

    private final Map<String, Integer> wordData = new HashMap<>();
    private final Map<String, Integer> duplicateData = new HashMap<>();

    @Override
    public void add(String characterString) {

        int duplicates = 0;

        if (!wordData.containsKey(characterString)) {
            wordData.put(characterString, duplicates);
        } else {
            wordData.replace(characterString, wordData.get(characterString) + 1);
            for (int i : wordData.values()) {
                if (i >= 1) {
                    duplicateData.put(characterString, wordData.get(characterString));
                }
            }
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return duplicateData.size();
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return new HashSet<>(wordData.keySet());
    }

    @Override
    public void empty() {
        wordData.clear();
        duplicateData.clear();
    }
}
