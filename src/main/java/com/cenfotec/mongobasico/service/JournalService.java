package com.cenfotec.mongobasico.service;

import com.cenfotec.mongobasico.domain.Journal;

import java.util.List;

public interface JournalService {
    List<Journal> getAllJournals();
    void saveJournal(Journal newJournal);
    List<Journal> findJournalsByTitle(String title);
    void deleteAllJournals();
}
