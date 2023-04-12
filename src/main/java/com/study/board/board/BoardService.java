package com.study.board.board;


import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class BoardService {
    private final BoardRepository boardRepository;

    @Transactional
    public Long save(RequestDto reqeustDto){
        return boardRepository.save(reqeustDto.toEntity()).getId();
    }

    public List<ResponseDto> findAll() {
        return boardRepository.findAll(Sort.by(Sort.Direction.DESC, "registerTime")).stream().map(ResponseDto::new).collect(Collectors.toList());
    }

    public ResponseDto findById(Long id) {
        return new ResponseDto(boardRepository.findById(id).get());
    }

    public int updateBoard(RequestDto requestDto) {
        return boardRepository.updateBoard(requestDto);
    }
}
