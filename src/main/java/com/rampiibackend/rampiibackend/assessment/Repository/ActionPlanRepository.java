package com.rampiibackend.rampiibackend.assessment.Repository;

import com.rampiibackend.rampiibackend.assessment.Entity.ActionPlans.ActionPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActionPlanRepository extends JpaRepository<ActionPlan,Long> {
    @Query("Select a from ActionPlan a where a.id_name = ?1")
    ActionPlan findByIdName(String idName);

    @Query("Select a from ActionPlan a where a.user.id=?1")
    List<ActionPlan> findAllUserActionPlan(Long id);
}
