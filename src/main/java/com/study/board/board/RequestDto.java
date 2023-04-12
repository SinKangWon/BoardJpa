package com.study.board.board;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestDto {

    private Long id;
    private String title;
    private String contents;
    private String useYn;
    private Long registerId;
    private Long modifyId;

    public Board toEntity() {
        return Board.builder()
                .title(title)
                .contents(contents)
                .useYn(useYn)
                .registerId(registerId)
                .modifyId(modifyId)
                .build();

    }
}
