package com.dl2.neo4jservice.neo4jservice.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;


@Node
@Data
@AllArgsConstructor
public class Paper {
    @Id private String arxivId;
    private String title;
    private String abs;
    private Long citedNum;
}