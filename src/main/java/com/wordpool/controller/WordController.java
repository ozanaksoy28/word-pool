package com.wordpool.controller;

import com.wordpool.model.response.GeneralDataResponse;
import com.wordpool.model.response.GeneralResponse;
import com.wordpool.model.Word;
import com.wordpool.model.response.Response;
import com.wordpool.model.response.error.ErrorDataResponse;
import com.wordpool.model.response.error.ErrorResponse;
import com.wordpool.model.response.success.SuccessDataResponse;
import com.wordpool.model.response.success.SuccessResponse;
import com.wordpool.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("word")
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class WordController {
    @Autowired
    private WordService wordService;
    @GetMapping("all")
    public GeneralDataResponse<List<Word>> getAll(){
        return new SuccessDataResponse<List<Word>>(200,wordService.getAll());
    }
    @PostMapping("save")
    public GeneralResponse Add(@RequestBody Word word){
        try {
            wordService.save(word);
            return new SuccessResponse(200);
        }catch (Exception e){
            return new ErrorResponse(500,e.getMessage());
        }
    }
    @GetMapping("delete")
    public GeneralDataResponse<Word> Delete(@RequestParam Integer id){
        Word word = null;
        try {
            word = wordService.getById(id);
            wordService.delete(word);
            return new SuccessDataResponse<Word>(200,word);
        }catch (Exception e){
            return new ErrorDataResponse(500,e.getMessage(),word);
        }
    }
    @GetMapping("findAllByActive")
    public Response getByActive(@RequestParam boolean active){
        try {
            return new SuccessDataResponse<List<Word>>(200,wordService.getByActive(active));
        }catch (Exception e){
            return new ErrorResponse(500,e.getMessage());
        }

    }
    @GetMapping("setActive")
    public GeneralDataResponse<Word> setActive(@RequestParam Integer id){
        wordService.updateToActive(id);
        return new SuccessDataResponse<Word>(200,wordService.getById(id));
    }
    @GetMapping("test")
    public String test(){
        return "Hello World!";
    }
}
