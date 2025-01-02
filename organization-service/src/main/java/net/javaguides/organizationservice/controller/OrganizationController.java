package net.javaguides.organizationservice.controller;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import net.javaguides.organizationservice.dto.OrganizationDto;
import net.javaguides.organizationservice.entity.Organization;
import net.javaguides.organizationservice.service.OrganizationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/organizations")
@AllArgsConstructor
//@NoArgsConstructor
public class OrganizationController {
    private OrganizationService organizationService;

//    public OrganizationController(OrganizationService organizationService) {
//        this.organizationService = organizationService;
//    }

    @PostMapping
    public ResponseEntity<OrganizationDto> createOrganization(@RequestBody OrganizationDto organizationDto) {
        OrganizationDto savedOrganization = organizationService.saveOrganization(organizationDto);
        return ResponseEntity.ok().body(savedOrganization);
    }
}
