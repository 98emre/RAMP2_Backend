package com.rampiibackend.rampiibackend.assessment.Repository;

import com.rampiibackend.rampiibackend.assessment.Entity.RiskAreas.CheckList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CheckListRepository extends JpaRepository<CheckList,Long> {
    @Query("Select c from CheckList c where c.id_name = ?1")
    CheckList findByIdName(String idName);

    @Query("Select c from CheckList c where c.user.id=?1")
    List<CheckList> findAllUserCheckList(Long id);
}
