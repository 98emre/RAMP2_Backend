package com.rampiibackend.rampiibackend.assessment.RestController;

import com.rampiibackend.rampiibackend.assessment.DTO.ActionPlans.ActionPlan;
import com.rampiibackend.rampiibackend.assessment.DTO.RiskAreas.CheckList;
import com.rampiibackend.rampiibackend.assessment.Service.ActionPlanService;
import com.rampiibackend.rampiibackend.assessment.Service.CheckListService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.security.sasl.AuthenticationException;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/actionplan")
@CrossOrigin(origins = "*",allowedHeaders = "*")
@Validated
public class ActionPlanController {

    private final ActionPlanService actionPlanService;
    private final CheckListService checkListService;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    public ActionPlanController(ActionPlanService actionPlanService, CheckListService checkListService) {
        this.actionPlanService = actionPlanService;
        this.checkListService = checkListService;
    }

    @GetMapping
    public List<ActionPlan> getAllActionPlan(){
        return actionPlanService.findAll().stream().map(actionPlan -> modelMapper.map(actionPlan,ActionPlan.class)).collect(Collectors.toList());
    }

    @GetMapping("user/{id}")
    public List<ActionPlan> getAllActionPlan(@PathVariable Long id){
        return actionPlanService.findAllUserActionPlan(id).stream().map(actionPlan -> modelMapper.map(actionPlan, ActionPlan.class)).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ActionPlan getActionPlanById(@PathVariable Long id){
        ActionPlan actionPlan = modelMapper.map(actionPlanService.findById(id),ActionPlan.class);
        return actionPlan;
    }

    @GetMapping("/search/{id_name}/{userid}")
    public ActionPlan getActionPlanByIdName(@PathVariable String id_name,@PathVariable String userid) throws AuthenticationException {
        ActionPlan actionPlan = modelMapper.map(actionPlanService.findByIdName(id_name,userid), ActionPlan.class);
        return actionPlan;
    }

    @PostMapping("/addAction")
    public ActionPlan addAction(@Valid @RequestBody ActionPlan actionPlan ){
        actionPlan.setId(0L);
        actionPlanService.save(modelMapper.map(actionPlan,com.rampiibackend.rampiibackend.assessment.Entity.ActionPlans.ActionPlan.class));
        return  actionPlan;
    }

    @PutMapping("/update")
    public ActionPlan update(@RequestBody ActionPlan actionPlan){
        CheckList checkList2 = modelMapper.map(checkListService.findById(actionPlan.getCheckList().getId()),CheckList.class);
        //ActionPlan actionPlan2 = modelMapper.map(actionPlanService.findById(actionPlan.getId()),ActionPlan.class);


        ActionPlan actionPlan1 = new ActionPlan();

        // Action Plan and Risk Area Actions
        actionPlan1.setId(actionPlan.getId());
        actionPlan1.setId_name(actionPlan.getId_name());
        actionPlan1.setOrderBy(actionPlan.getOrderBy());
        actionPlan1.setFormedBy(actionPlan.getFormedBy());
        actionPlan1.setDate(actionPlan.getDate());
        actionPlan1.setNote(actionPlan.getNote());
        actionPlan1.setPostureActions(actionPlan.getPostureActions());
        actionPlan1.setRepetitiveWorkActions(actionPlan.getRepetitiveWorkActions());
        actionPlan1.setLiftingWorkActions(actionPlan.getLiftingWorkActions());
        actionPlan1.setPushingAndPullingActions(actionPlan.getPushingAndPullingActions());
        actionPlan1.setInfluencingFactorsActions(actionPlan.getInfluencingFactorsActions());
        actionPlan1.setPhysicallyStrenuousWorkActions(actionPlan.getPhysicallyStrenuousWorkActions());
        actionPlan1.setPhysicalDiscomfortActions(actionPlan.getPhysicalDiscomfortActions());
        actionPlan1.setUser(actionPlan.getUser());
        actionPlan1.setCheckList(actionPlan.getCheckList());

        // Action Plan Risk Area Actions ID
        actionPlan1.getPostureActions().setId(actionPlan.getPostureActions().getId());
        actionPlan1.getRepetitiveWorkActions().setId(actionPlan.getPostureActions().getId());
        actionPlan1.getRepetitiveWorkActions().setId(actionPlan.getPostureActions().getId());
        actionPlan1.getLiftingWorkActions().setId(actionPlan.getPostureActions().getId());
        actionPlan1.getPushingAndPullingActions().setId(actionPlan.getPostureActions().getId());
        actionPlan1.getInfluencingFactorsActions().setId(actionPlan.getPostureActions().getId());
        actionPlan1.getPhysicallyStrenuousWorkActions().setId(actionPlan.getPostureActions().getId());
        actionPlan1.getPhysicalDiscomfortActions().setId(actionPlan.getPostureActions().getId());
        actionPlan1.getUser().setId(actionPlan.getUser().getId());

        // Check List Risk Areas ID
        actionPlan1.getCheckList().setId(checkList2.getId());
        actionPlan1.getCheckList().setId_name(checkList2.getId_name());
        actionPlan1.getCheckList().setCompleted(checkList2.isCompleted());
        actionPlan1.getCheckList().setInputData(checkList2.getInputData());
        actionPlan1.getCheckList().setPosture(checkList2.getPosture());
        actionPlan1.getCheckList().setRepetitiveWork(checkList2.getRepetitiveWork());
        actionPlan1.getCheckList().setLiftingWork(checkList2.getLiftingWork());
        actionPlan1.getCheckList().setPushingAndPulling(checkList2.getPushingAndPulling());
        actionPlan1.getCheckList().setInfluencingFactors(checkList2.getInfluencingFactors());
        actionPlan1.getCheckList().setPhysicallyStrenuousWork(checkList2.getPhysicallyStrenuousWork());
        actionPlan1.getCheckList().setPhysicalDiscomfort(checkList2.getPhysicalDiscomfort());
        actionPlan1.getCheckList().setOtherComment(checkList2.getOtherComment());
        actionPlan1.getCheckList().setUser(actionPlan.getCheckList().getUser());

        // Check List RiskAreas
        actionPlan1.getCheckList().getInputData().setId(actionPlan.getCheckList().getInputData().getId());
        actionPlan1.getCheckList().getPosture().setId(actionPlan.getCheckList().getPosture().getId());
        actionPlan1.getCheckList().getRepetitiveWork().setId(actionPlan.getCheckList().getRepetitiveWork().getId());
        actionPlan1.getCheckList().getLiftingWork().setId(actionPlan.getCheckList().getLiftingWork().getId());
        actionPlan1.getCheckList().getPushingAndPulling().setId(actionPlan.getCheckList().getPushingAndPulling().getId());
        actionPlan1.getCheckList().getInfluencingFactors().setId(actionPlan.getCheckList().getInfluencingFactors().getId());
        actionPlan1.getCheckList().getPhysicallyStrenuousWork().setId(actionPlan.getCheckList().getPhysicallyStrenuousWork().getId());
        actionPlan1.getCheckList().getPhysicalDiscomfort().setId(actionPlan.getCheckList().getPhysicalDiscomfort().getId());
        actionPlan1.getCheckList().getOtherComment().setId(actionPlan.getCheckList().getOtherComment().getId());
        actionPlan1.getCheckList().getUser().setId(actionPlan.getCheckList().getUser().getId());

        actionPlanService.update(modelMapper.map(actionPlan1,com.rampiibackend.rampiibackend.assessment.Entity.ActionPlans.ActionPlan.class));
        return  actionPlan1;
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationExceptions(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return errors;
    }
}
