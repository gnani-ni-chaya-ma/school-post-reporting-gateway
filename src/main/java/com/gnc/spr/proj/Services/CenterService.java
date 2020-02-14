package com.gnc.spr.proj.Services;

import com.gnc.spr.proj.models.Center;
import com.gnc.spr.proj.repository.CenterRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CenterService {

    final
    CenterRepository centerRepository;

    public CenterService(CenterRepository centerRepository) {
        this.centerRepository = centerRepository;
    }

    public Center create(Center center){
        centerRepository.save(center);
        return center;
    }

    public void deleteById(int id){
        centerRepository.deleteById(id);
    }


    public List<Center> findAll(){
        var centersIterator =  centerRepository.findAll();

        return new ArrayList<Center>(centersIterator);
    }

    public Optional<Center> findById(int id){
        return centerRepository.findById(id);

    }

//    public Center update(int id ,String cName){
//        Center center = findById(id);
//        return new Center(cName);
//    }
}
