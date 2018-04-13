package com.umss.edu.practiceapp.service.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class SectionDto {

    @Getter
    @Setter
    private Integer id;

    @Getter
    @Setter
    private String codeSection;

    @Getter
    @Setter
    private Date dateCreated;
}
