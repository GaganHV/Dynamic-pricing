package com.techgeeknext.examples.drools.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.internal.NotNull;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.TimeZone;

/**
 * Created by GAGAN.HV on 8/1/22
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DPDTO {

//    @NotNull
    long mrp;

//    @NotNull
    String category;

    String season;

//    @JsonIgnore
    Date date;

    String pincode;

    int currentNoOfOrderInPincode;

    int availableInventory;

    TimeZone zone;

    long sellingPrice;
}
