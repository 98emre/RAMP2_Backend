package com.rampiibackend.rampiibackend.assessment.Service;

import com.rampiibackend.rampiibackend.assessment.Entity.ActionPlans.ActionPlan;

import javax.security.sasl.AuthenticationException;
import java.util.List;

public interface ActionPlanService {
    public List<ActionPlan> findAll();

    public  List<ActionPlan> findAllUserActionPlan(Long id);

    public ActionPlan findById(Long id);
    public void save(ActionPlan actionPlan);

    public void update(ActionPlan actionPlan);

    public ActionPlan findByIdName(String idName, String userid) throws AuthenticationException;

}
