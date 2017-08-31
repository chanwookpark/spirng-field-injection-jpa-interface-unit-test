package com.chanwook;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author chanwook
 */
public interface SampleRepository extends JpaRepository<Sample, String> {
    Sample findByName(String name);
}
