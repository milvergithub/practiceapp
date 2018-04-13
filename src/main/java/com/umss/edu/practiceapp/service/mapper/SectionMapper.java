package com.umss.edu.practiceapp.service.mapper;

import com.umss.edu.practiceapp.domain.Section;
import com.umss.edu.practiceapp.service.dto.SectionDto;
import org.mapstruct.Mapper;

/**
 * @author milver
 */
@Mapper
public interface SectionMapper {

    Section sectionDtoToSection(SectionDto sectionDto);

    SectionDto sectionToSectionDto(Section section);
}
