package com.bz.demo.repository;

import com.bz.demo.model.security.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
    List<MenuItem> findAllByActiveStatusOrderBySequenceNo(Integer activeStatus);
    List<MenuItem> findMenusByMenuGroupIdOrderBySequenceNo(Long menuGroupId);

    @Query("select distinct a.sequenceNo from MenuItem a")
    List<Long>findAllSequence();

}
