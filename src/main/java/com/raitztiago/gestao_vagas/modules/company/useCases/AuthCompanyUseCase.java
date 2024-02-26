package com.raitztiago.gestao_vagas.modules.company.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raitztiago.gestao_vagas.modules.company.dto.AuthCompanyDTO;
import com.raitztiago.gestao_vagas.modules.company.repositories.CompanyRepository;

@Service
public class AuthCompanyUseCase {
    
    @Autowired
    private CompanyRepository companyRepository;

    public void execute(AuthCompanyDTO authCompanyDTO) {

        

    }
}
