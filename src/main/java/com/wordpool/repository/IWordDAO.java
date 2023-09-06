package com.wordpool.repository;
import com.wordpool.model.Word;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IWordDAO extends JpaRepository<Word,Integer> {
    List<Word> findByActive(Boolean active);
}
