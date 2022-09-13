package com.rampiibackend.rampiibackend.assessment.Service;

import com.rampiibackend.rampiibackend.assessment.Entity.RiskAreas.CheckList;

import javax.security.sasl.AuthenticationException;
import java.util.List;

public interface CheckListService {
    public List<CheckList> findAll();
    public List<CheckList> findAllUserCheckList(Long id);
    public CheckList findById(Long id);
    public void save(CheckList checkList);

    public CheckList findByIdName(String idName, String userid) throws AuthenticationException;

    public void update(CheckList checkList);
}
