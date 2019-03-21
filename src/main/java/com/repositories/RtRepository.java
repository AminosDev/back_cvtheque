package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.models.Rt;

@Repository
public interface RtRepository extends JpaRepository<Rt, Long> {

}
