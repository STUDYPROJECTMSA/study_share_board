package com.study.main_server.domain.board.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Getter
@EqualsAndHashCode
@Table(name = "board")
@NoArgsConstructor(access = AccessLevel.PUBLIC) //테스트 위해 public 으로
public class Board {
    @Id
    private String id;

    private String imageBoard;

    private String contents;

    private Integer likeCnt;

    private Integer userId;

    @Builder
    public Board(String imageBoard, String contents , Integer likeCnt , Integer userId){
        this.id = UUID.randomUUID().toString();
        this.imageBoard = imageBoard;
        this.contents = contents;
        this.likeCnt = likeCnt;
        this.userId = userId;
    }



}
