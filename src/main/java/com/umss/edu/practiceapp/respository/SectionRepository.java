package com.umss.edu.practiceapp.respository;

import com.umss.edu.practiceapp.domain.Section;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author milver
 */

@Repository
public interface SectionRepository extends JpaRepository<Section, Integer>{
}
