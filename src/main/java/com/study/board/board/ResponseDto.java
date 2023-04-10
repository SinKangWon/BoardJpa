package com.study.board.board;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ResponseDto {
    private Long id;
    private String title;
    private String contents;
    private String useYn;
    private Long registerId;
    private LocalDateTime registerTime;
    private Long modifyId;
    private LocalDateTime modifyTime;

    public ResponseDto(Board board) {
        this.id = id;
        this.title = title;
        this.contents = contents;
        this.useYn = useYn;
        this.registerId = registerId;
        this.registerTime = registerTime;
        this.modifyId = modifyId;
        this.modifyTime = modifyTime;
    }
}
