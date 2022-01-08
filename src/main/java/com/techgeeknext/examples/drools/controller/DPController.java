package com.techgeeknext.examples.drools.controller;

import com.techgeeknext.examples.drools.domain.DPDTO;
import com.techgeeknext.examples.drools.service.DpService;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by GAGAN.HV on 8/1/22
 */
@RestController
@RequestMapping("dp")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DPController {

    @Autowired
    DpService dpService;


    @PostMapping(value = "/calculation", produces = "application/json")
    public ResponseEntity<?> dynamicPricingCalculation(@RequestBody DPDTO dpdto) {
        return ResponseEntity.ok(dpService.calculateAndSetPrice(dpdto));
    }

}
