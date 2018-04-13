package com.umss.edu.practiceapp.service.section;

import com.umss.edu.practiceapp.domain.Section;
import com.umss.edu.practiceapp.respository.SectionRepository;
import com.umss.edu.practiceapp.service.dto.SectionDto;
import com.umss.edu.practiceapp.service.mapper.SectionMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class SectionServiceImpl  implements SectionService {

    private static final Logger logger = LoggerFactory.getLogger(SectionServiceImpl.class);

    @Autowired
    private SectionMapper sectionMapper;

    @Autowired
    private SectionRepository sectionRepository;

    @Override
    public Page<SectionDto> findAll(Pageable pageable) {
        Page<Section> sections = sectionRepository.findAll(pageable);
        return sections.map(section -> sectionMapper.sectionToSectionDto(section));
    }

    @Override
    public SectionDto save(SectionDto modelDTO) {
        return null;
    }

    @Override
    public SectionDto findOne(Integer id) {
        return null;
    }

    @Override
    public void delete(Integer id) {
        logger.debug("delete");
    }

    @Override
    public SectionDto update(SectionDto modelDTO, Integer id) {
        return null;
    }
}
