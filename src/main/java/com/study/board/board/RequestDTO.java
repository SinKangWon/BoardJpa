package com.study.board.board;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestDTO {

    private Long id;
    private String title;
    private String contents;
    private Long useYn;
    private Long modifyId;

    public RequestDTO(Long id, String title, String contents, Long userYn, Long modifyId) {
        this.id = id;
        this.title = title;
        this.contents = contents;
        this.useYn = useYn;
        this.modifyId = modifyId;
    }
}
