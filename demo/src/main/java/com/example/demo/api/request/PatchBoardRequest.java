package com.example.demo.api.request;

import lombok.Getter;

@Getter
public class PatchBoardRequest {

    private String title;
    private String content;
    private String writer;
}
