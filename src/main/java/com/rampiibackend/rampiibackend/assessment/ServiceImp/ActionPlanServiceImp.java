package com.rampiibackend.rampiibackend.assessment.ServiceImp;

import com.rampiibackend.rampiibackend.assessment.Entity.ActionPlans.ActionPlan;
import com.rampiibackend.rampiibackend.assessment.Entity.RiskAreas.CheckList;
import com.rampiibackend.rampiibackend.assessment.Repository.ActionPlanRepository;
import com.rampiibackend.rampiibackend.assessment.Service.ActionPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.security.sasl.AuthenticationException;
import java.util.List;
import java.util.Optional;

@Service
public class ActionPlanServiceImp implements ActionPlanService {
    private final ActionPlanRepository actionPlanRepository;

    @Autowired
    public ActionPlanServiceImp(ActionPlanRepository actionPlanRepository) {
        this.actionPlanRepository = actionPlanRepository;
    }

    @Override
    public List<ActionPlan> findAll() {
        return actionPlanRepository.findAll();
    }

    @Override
    public List<ActionPlan> findAllUserActionPlan(Long id) {
        return actionPlanRepository.findAllUserActionPlan(id);
    }

    @Override
    public ActionPlan findById(Long id) {
        Optional<ActionPlan> result = actionPlanRepository.findById(id);
        ActionPlan actionPlan = null;

        if(result.isPresent()) {
            actionPlan = result.get();
        }

        else {
            throw new RuntimeException("Did Not Find Action Plan By Id - " + id);
        }

        return actionPlan;
    }

    @Override
    public void save(ActionPlan actionPlan) {
        ActionPlan actionPlan_IdName = actionPlanRepository.findByIdName(actionPlan.getId_name());

        if(actionPlan_IdName != null) {
            throw new RuntimeException("Action Plan Id Name Is Already In Used - " + actionPlan.getId_name());
        } 

        actionPlanRepository.save(actionPlan);
    }

    @Override
    public void update(ActionPlan actionPlan) {
        actionPlanRepository.save(actionPlan);
    }

    @Override
    public ActionPlan findByIdName(String idName, String userid) throws AuthenticationException {
        ActionPlan result = actionPlanRepository.findByIdName(idName);

        if(result != null) {
            if(!userid.equalsIgnoreCase(String.valueOf(result.getUser().getId())))
            {
                throw new AuthenticationException("You cannot access this Action plan.");
            }
            return result;
        }

        else {
            throw new RuntimeException("Did Not Find Action plan By Id Name - " + idName);
        }
    }

}
