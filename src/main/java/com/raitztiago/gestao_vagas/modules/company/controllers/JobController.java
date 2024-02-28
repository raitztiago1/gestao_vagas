package com.raitztiago.gestao_vagas.modules.company.controllers;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raitztiago.gestao_vagas.modules.company.entities.JobEntity;
import com.raitztiago.gestao_vagas.modules.company.useCases.CreateJobUseCase;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/job")
public class JobController {

    @Autowired
    private CreateJobUseCase createJobUseCase;

    @PostMapping("/")
    public JobEntity create(@Valid @RequestBody JobEntity jobEntity, HttpServletRequest request) {
        
        var companyId = request.getAttribute("company_id");
        var companyIdString = UUID.fromString(companyId.toString());
        
        jobEntity.setCompanyId(companyIdString);

        return this.createJobUseCase.execute(jobEntity);
    
    }

}
