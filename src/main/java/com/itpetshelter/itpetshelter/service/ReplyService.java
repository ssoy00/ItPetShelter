package com.itpetshelter.itpetshelter.service;

import com.itpetshelter.itpetshelter.dto.PageRequestDTO;
import com.itpetshelter.itpetshelter.dto.PageResponseDTO;
import com.itpetshelter.itpetshelter.dto.ReplyDTO;

public interface ReplyService {
    // 댓글 , crud
    Long register(ReplyDTO replyDTO);
    ReplyDTO read(Long rno);
    void update(ReplyDTO replyDTO);
    void delete(Long rno);
    // 댓글 페이징 처리해서 목록 출력.
    PageResponseDTO<ReplyDTO> getListOfBoard(Long bno, PageRequestDTO pageRequestDTO);
}
