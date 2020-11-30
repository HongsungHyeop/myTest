package com.study.myTest.repository;

import com.study.myTest.modal.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {

   }