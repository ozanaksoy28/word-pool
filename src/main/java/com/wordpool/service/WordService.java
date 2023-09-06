package com.wordpool.service;

import com.wordpool.model.Word;
import com.wordpool.repository.IWordDAO;
import com.wordpool.util.WordUtil;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@Slf4j
public class WordService {
    @Autowired
    private IWordDAO wordDAO;

    public List<Word> getAll(){
        List<Word> words = wordDAO.findAll();
        Collections.shuffle(words);
        return words;
    }
    public Word getById(Integer id){
        return wordDAO.findById(id).get();
    }
    public List<Word> getByActive(boolean active) throws Exception {
        List<Word> words;
        try{
            words = wordDAO.findByActive(active);
            Collections.shuffle(words);
            return words;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    public void save(Word word) throws Exception {
        try {
            WordUtil.toAllUpperCase(word);
            wordDAO.save(word);
            log.info("SAVE SUCCESS!");
        }catch (Exception e){
            log.error("SAVE FAILED: " +e.getMessage());
            throw new Exception(e.getMessage());
        }
    }
    public void update(Word word){
        try {
            wordDAO.save(word);
            log.info("UPDATE SUCCESS");
        }catch (Exception e){
            log.error("UPDATE FAILED: " +e.getMessage());
        }
    }
    public void delete(Word word) throws Exception {
        try{
            wordDAO.delete(word);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    public void updateToActive(Integer id){
        var word = getById(id);
        word.setActive(!word.isActive());
        update(word);
    }
}
