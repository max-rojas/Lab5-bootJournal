package com.cenfotec.boot.repository;

import com.cenfotec.boot.domain.Journal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JournalRepository extends JpaRepository<Journal, Long> {
}
