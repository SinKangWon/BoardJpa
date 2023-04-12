package com.study.board.board;

import com.study.board.base.BaseTimeEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity(name = "board")
public class Board extends BaseTimeEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String title;
    private String contents;
    private String useYn;
    private Long registerId;
    private Long modifyId;

    @Builder
    public Board(Long id, String title, String contents, String useYn, Long registerId, Long modifyId) {
        this.id = id;
        this.title = title;
        this.contents = contents;
        this.useYn = useYn;
        this.registerId = registerId;
        this.modifyId = modifyId;
    }

}
