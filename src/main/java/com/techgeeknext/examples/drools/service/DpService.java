package com.techgeeknext.examples.drools.service;

import com.techgeeknext.examples.drools.domain.DPDTO;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.Date;
import java.util.TimeZone;

/**
 * Created by GAGAN.HV on 8/1/22
 */
@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DpService {

    @Autowired
    KieContainer kieContainer;

    public DPDTO calculateAndSetPrice(DPDTO dpdto) {
        if (dpdto.getAvailableInventory() == 0) {
            dpdto.setSellingPrice(dpdto.getMrp());
        }
        KieSession kieSession = kieContainer.newKieSession();
        updateDefaultValue(dpdto);
        kieSession.insert(dpdto);
        kieSession.fireAllRules();
        kieSession.dispose();
        return dpdto;
    }

    private void updateDefaultValue(DPDTO dpdto) {
        if (ObjectUtils.isEmpty(dpdto.getZone())) {
            dpdto.setZone(TimeZone.getDefault());
        }

        if (ObjectUtils.isEmpty(dpdto.getDate())) {
            dpdto.setDate(new Date());
        }

    }

}
