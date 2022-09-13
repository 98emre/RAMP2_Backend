package com.rampiibackend.rampiibackend.assessment.ServiceImp;

import com.rampiibackend.rampiibackend.assessment.Entity.RiskAreas.CheckList;
import com.rampiibackend.rampiibackend.assessment.Repository.CheckListRepository;
import com.rampiibackend.rampiibackend.assessment.Service.CheckListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.security.sasl.AuthenticationException;
import java.util.List;
import java.util.Optional;

@Service
public class CheckListServiceImp implements CheckListService {

    private final CheckListRepository checkListRepository;

    @Autowired
    public CheckListServiceImp(CheckListRepository checkListRepository) {
        this.checkListRepository = checkListRepository;
    }

    @Override
    public List<CheckList> findAll() {
        return (List<CheckList>) checkListRepository.findAll();
    }

    @Override
    public List<CheckList> findAllUserCheckList(Long id) {
        return checkListRepository.findAllUserCheckList(id);
    }

    @Override
    public CheckList findById(Long id) {
        Optional<CheckList> result = checkListRepository.findById(id);
        CheckList checkList = null;

        if(result.isPresent()) {
            checkList = result.get();
        }

        else {
            throw new RuntimeException("Did Not Find CheckList By Id - " + id);
        }

        return checkList;
    }

    @Override
    public void save(CheckList checkList){
        CheckList result = checkListRepository.findByIdName(checkList.getId_name());

        if(result != null) {
            throw new RuntimeException("Check List Id Name Is Already In Used - " + checkList.getId_name());
        }

        checkListRepository.save(checkList);
    }

    @Override
    public CheckList findByIdName(String idName,String userid) throws AuthenticationException {

        CheckList result = checkListRepository.findByIdName(idName);

        if(result != null) {
            if(!userid.equalsIgnoreCase(String.valueOf(result.getUser().getId())))
            {
                throw new AuthenticationException("You cannot access this checklist.");
            }
            return result;
        }

        else {
            throw new RuntimeException("Did Not Find CheckList By Id Name - " + idName);
        }
    }

    @Override
    public void update(CheckList checkList) {
        checkListRepository.save(checkList);
    }


}
