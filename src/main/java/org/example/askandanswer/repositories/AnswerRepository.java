package org.example.askandanswer.repositories;

import org.example.askandanswer.models.Answer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long> {
    Page<Answer> findByQuestionId(Long questionId, Pageable pageable);
}
