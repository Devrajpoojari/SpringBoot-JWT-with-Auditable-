package com.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Session;

@Repository
@Transactional
public interface SessionRepo extends JpaRepository<Session, Long> {

}
