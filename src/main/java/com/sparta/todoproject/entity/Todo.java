package com.sparta.todoproject.entity;

import com.sparta.todoproject.dto.TodoCreateRequestDto;
import com.sparta.todoproject.dto.TodoUpdateRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.text.SimpleDateFormat;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class Todo {
    private Long id;
    private String username;
    private String title;
    private String contents;
    private Long password;
    private String date;

    public Todo(TodoCreateRequestDto requestDto) {
        this.username = requestDto.getUsername();
        this.title = requestDto.getTitle();
        this.contents = requestDto.getContents();
        this.password = requestDto.getPassword();
        this.date = new SimpleDateFormat("yyyy-MM-dd").format(requestDto.getDate());
    }

    public void update(TodoUpdateRequestDto requestDto) {
        this.title = requestDto.getTitle();
        this.contents = requestDto.getContents();
        this.username = requestDto.getUsername();
    }
}
