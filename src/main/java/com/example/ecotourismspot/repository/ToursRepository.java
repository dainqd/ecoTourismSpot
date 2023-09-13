package com.example.ecotourismspot.repository;

import com.example.ecotourismspot.entity.Tours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToursRepository extends JpaRepository<Tours, Long> {
}
