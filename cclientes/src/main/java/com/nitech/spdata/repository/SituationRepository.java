package com.nitech.spdata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nitech.spdata.entity.SituationEntity;

@Repository
public interface SituationRepository extends JpaRepository<SituationEntity, Integer> {
	SituationEntity findProductEntityById(Integer Id);

}