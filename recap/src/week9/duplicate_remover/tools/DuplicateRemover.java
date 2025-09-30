package week9.duplicate_remover.tools;

import java.util.Set;

public interface DuplicateRemover {
    void add(String characterString);

    int getNumberOfDetectedDuplicates();

    Set<String> getUniqueCharacterStrings();

    void empty();

}
