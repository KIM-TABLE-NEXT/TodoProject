package com.sparta.todoproject.util;

import com.sparta.todoproject.dto.TodoResponseDto;

import java.util.Comparator;

public class TodoSort implements Comparator<TodoResponseDto> {
    @Override
    public int compare(TodoResponseDto o1, TodoResponseDto o2){
        if(o1.getDate().equals(o2.getDate()))
            return 0;
        if(o1.getDate().compareTo(o2.getDate())>0)
            return -1;
        else
            return 1;
    }
}
