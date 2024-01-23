# 🛠일정 관리 앱 서버 구현하기
## 🚩Usecase diagram
![](https://velog.velcdn.com/images/kim_table_next/post/8c128fbd-fe7e-4ede-9d41-11fc0334a812/image.jpg)

## 🚩API 명세서
| 기능 | Method | URL | Request Param | Request Body| Response Body |
|:---:|:---:|:---:|:---:|:---:|:---:|
| 일정 등록 | POST | /todo | - | { 'title' : title, <br> 'contents' : contents, <br> 'username' : username, <br> 'date' : date,<br> 'password' : password } |  { 'id' : id,<br>'title' : title, <br> 'contents' : contents, <br> 'username' : username, <br> 'date' : date,<br> 'password' : password } |
| 일정 전체 목록 조회 | GET | /todo | - | - |   { 'id' : id,<br>'title' : title, <br> 'contents' : contents, <br> 'username' : username, <br> 'date' : date } , {...} |
| 일정 조회 | GET | /todo/param | ?'id'=id | - |   { 'id' : id,<br>'title' : title, <br> 'contents' : contents, <br> 'username' : username, <br> 'date' : date } |
| 일정 수정 | PUT | /todo/param | ?'id'=id&'password'=password |    { 'title' : title, <br> 'contents' : contents, <br> 'username' : username }  |   { 'id' : id,<br>'title' : title, <br> 'contents' : contents, <br> 'username' : username, <br> 'date' : date } |
| 일정 삭제 | DELETE | /todo/param | ?'id'=id&'password'=password | - | - |
