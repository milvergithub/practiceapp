package com.umss.edu.practiceapp.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "section")
public class Section implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private Integer id;

    @Getter
    @Setter
    @Column(name = "code_section", nullable = false)
    private String codeSection;

    @Getter
    @Setter
    @Column(name = "date_created", nullable = false, updatable = false)
    @CreatedDate
    private Date dateCreated;
}
