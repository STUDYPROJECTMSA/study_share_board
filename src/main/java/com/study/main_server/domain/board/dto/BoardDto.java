package com.study.main_server.domain.board.dto;

import lombok.Data;

@Data
public class BoardDto {
    private String id;

    private String imageBoard;

    private String contents;

    private Integer likeCnt;

    private Integer userId;
}
