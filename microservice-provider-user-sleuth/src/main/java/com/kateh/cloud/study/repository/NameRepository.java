package com.kateh.cloud.study.repository;

import com.kateh.cloud.study.entity.Name;
import com.kateh.cloud.study.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NameRepository extends JpaRepository<Name, Long> {
    List<Name> findByGender(Integer gender);
}
