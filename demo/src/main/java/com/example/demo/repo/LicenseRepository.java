package com.example.demo.repo;

import com.example.demo.model.LicenseData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LicenseRepository extends JpaRepository<LicenseData, Long> {
}
