package com.gnc.spr.proj.repository;

import com.gnc.spr.proj.models.Center;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CenterRepository extends JpaRepository<Center,Integer> {}
