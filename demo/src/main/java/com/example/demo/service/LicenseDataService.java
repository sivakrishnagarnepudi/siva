package com.example.demo.service;

import com.example.demo.model.LicenseData;
import com.example.demo.repo.LicenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LicenseDataService {

    @Autowired
    private LicenseRepository licenseRepository;

    public LicenseData processLicenseImage(String imageData) {
        // Process image data and save to repository
        LicenseData licenseData = new LicenseData();
        // Set license data properties from imageData
        return licenseRepository.save(licenseData);
    }
}