package com.study.main_server.global.util.mapper;

import com.study.main_server.domain.board.domain.Board;
import com.study.main_server.domain.board.dto.BoardDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {})
public interface BoardMapper extends GenericMapper<BoardDto, Board> {
}
