package com.example.springbootstarterpack.dao;

import com.example.springbootstarterpack.domains.Tmp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.Map;

public interface TestRepository extends JpaRepository<Tmp, Long> {
    @Transactional
    @Modifying
    @Query("update Tmp t set t.updateDate = ?1 where t.pk = ?2")
    int updateUpdateDateByPk(Date updateDate, Long pk);

}
