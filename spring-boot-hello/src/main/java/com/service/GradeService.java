package com.service;

import com.entity.Grade;
import com.repository.GradeRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class GradeService {

    @Resource
    private GradeRepository  gradeRepository ;

    /**
     * save /delete /update
     * @param grade
     */

    public void  save(Grade grade){
        gradeRepository.save(grade);
    }
    public void  delete(Grade grade){
        gradeRepository.delete(grade);
    }
    public Iterable<Grade> getAll(){
         return gradeRepository.findAll();
    }


}
