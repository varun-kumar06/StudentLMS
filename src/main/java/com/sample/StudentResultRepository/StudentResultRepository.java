package com.sample.StudentResultRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.ResultEntity;

public interface StudentResultRepository extends JpaRepository<ResultEntity, Integer>{

}
