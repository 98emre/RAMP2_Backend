package com.rampiibackend.rampiibackend.assessment.RestController;

import com.rampiibackend.rampiibackend.assessment.DTO.RiskAreas.CheckList;
import com.rampiibackend.rampiibackend.assessment.Service.CheckListService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.security.sasl.AuthenticationException;
import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/checklist")
@CrossOrigin(origins = "*",allowedHeaders = "*")
@Validated
public class CheckListController {

  @Autowired
    private  final CheckListService checkListService;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    public CheckListController(CheckListService checkListService) {
        this.checkListService = checkListService;
    }

    @GetMapping
    public List<CheckList> getAllCheckList(){
        return checkListService.findAll().stream().map(checkList -> modelMapper.map(checkList, CheckList.class)).collect(Collectors.toList());
    }

    @GetMapping("user/{id}")
    public List<CheckList> getAllUserCheckList(@PathVariable Long id){
        return checkListService.findAllUserCheckList(id).stream().map(checkList -> modelMapper.map(checkList, CheckList.class)).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public CheckList getCheckListById(@PathVariable Long id) {
        CheckList checkList = modelMapper.map( checkListService.findById(id), CheckList.class);
        return checkList;
    }

    @PostMapping("/addList")
    public CheckList addCheckList(@RequestBody @Valid CheckList checkList){
        checkList.setId(0L);
        checkListService.save(modelMapper.map(checkList, com.rampiibackend.rampiibackend.assessment.Entity.RiskAreas.CheckList.class));
        return checkList;
    }
    @GetMapping("/searchIdName/{id}/{userid}")
    public CheckList getCheckListByIdName(@PathVariable String id, @PathVariable String userid) throws AuthenticationException {
        CheckList checkList = modelMapper.map(checkListService.findByIdName(id,userid), CheckList.class);
        return checkList;
    }

    @PutMapping("/updateList")
    public CheckList updateChecklist(@RequestBody CheckList checkList){
        CheckList checkList2 = modelMapper.map(checkListService.findById(checkList.getId()),CheckList.class);

        CheckList checkList1 = new CheckList();

        checkList1.setId(checkList2.getId());
        checkList1.setId_name(checkList.getId_name());
        checkList1.setCompleted(checkList.isCompleted());
        checkList1.setInputData(checkList.getInputData());
        checkList1.setPosture(checkList.getPosture());
        checkList1.setRepetitiveWork(checkList.getRepetitiveWork());
        checkList1.setLiftingWork(checkList.getLiftingWork());
        checkList1.setPushingAndPulling(checkList.getPushingAndPulling());
        checkList1.setInfluencingFactors(checkList.getInfluencingFactors());
        checkList1.setPhysicallyStrenuousWork(checkList.getPhysicallyStrenuousWork());
        checkList1.setPhysicalDiscomfort(checkList.getPhysicalDiscomfort());
        checkList1.setOtherComment(checkList.getOtherComment());
        checkList1.setUser(checkList.getUser());

        checkList1.getInputData().setId(checkList2.getInputData().getId());
        checkList1.getPosture().setId(checkList2.getPosture().getId());
        checkList1.getRepetitiveWork().setId(checkList2.getRepetitiveWork().getId());
        checkList1.getLiftingWork().setId(checkList2.getLiftingWork().getId());
        checkList1.getPushingAndPulling().setId(checkList2.getPushingAndPulling().getId());
        checkList1.getInfluencingFactors().setId(checkList2.getInfluencingFactors().getId());
        checkList1.getPhysicallyStrenuousWork().setId(checkList2.getPhysicallyStrenuousWork().getId());
        checkList1.getPhysicalDiscomfort().setId(checkList2.getPhysicalDiscomfort().getId());
        checkList1.getOtherComment().setId(checkList2.getOtherComment().getId());
        checkList1.getUser().setId(checkList2.getUser().getId());

        checkListService.update(modelMapper.map(checkList1, com.rampiibackend.rampiibackend.assessment.Entity.RiskAreas.CheckList.class));
        return checkList1;
    }
}
