package com.study.board.board;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BoardRepository extends JpaRepository<Board, Long> {
    String updateBoardQuery = "update board," +
            "set title = :#{#requestDto.title}," +
            "contents = :#{#requestDto.contents}," +
            "use_yn = :#{#requestDto.useYn}," +
            "modifyId = :#{#requestDto.modifyId}," +
            "where id = :#{#requestDto.id}";

    @Transactional
    @Modifying
    @Query(value = updateBoardQuery, nativeQuery = true)
    public int updateBoard(@Param("requestDto") RequestDTO requestDto);
}
