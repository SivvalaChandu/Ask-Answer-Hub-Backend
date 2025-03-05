package org.example.askandanswer.dtos;

import lombok.Data;

import java.util.Set;

@Data
public class QuestionDTO {
    private Long id;
    private String title;
    private String content;
    private Long userId;
    private Set<Long> tagIds;
}
