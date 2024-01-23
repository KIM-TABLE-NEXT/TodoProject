package com.sparta.todoproject.dto;

import lombok.Getter;

import java.util.Date;

@Getter
public class TodoCreateRequestDto {
    private String title;
    private String contents;
    private String username;
    private Date date;
    private Long password;
}
