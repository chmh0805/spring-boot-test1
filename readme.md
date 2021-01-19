
# 21.01.19 Spring-boot 인터페이스 구현 실기평가

#### 작성자 : 정민혁

<br/><br/>

<b> Request Type : application/json (공통) </b><br/>
<b> Response Type : application/json (공통) </b><br/>
<b> host 주소 : http://localhost:8080 </b><br/>
<hr/>

## 구현 기능
#### 1. 전체 리스트 요청
![image](https://user-images.githubusercontent.com/63082842/104989987-fba12600-5a5e-11eb-9ffe-6f38988f6aa5.png)
> 요청

![image](https://user-images.githubusercontent.com/63082842/104989997-052a8e00-5a5f-11eb-9be8-999e9808a08f.png)
> 응답
<br/>

#### 2. 1개 요청
![image](https://user-images.githubusercontent.com/63082842/104990044-23908980-5a5f-11eb-8896-66252e7f4f43.png)
> 요청 ( URL : http://localhost:8080/movie/id값 )

![image](https://user-images.githubusercontent.com/63082842/104990081-3905b380-5a5f-11eb-99b6-e1a56c5e12df.png)
> 응답
<br/>

#### 3. post 요청
![image](https://user-images.githubusercontent.com/63082842/104990134-55095500-5a5f-11eb-9728-9eef25c85533.png)
> 요청 (요청 BODY 데이터 : title, rating)

![image](https://user-images.githubusercontent.com/63082842/104990171-6f433300-5a5f-11eb-9c34-044bd15c968c.png)
> 응답 성공 시 (이하 모든 요청에 대하여 동일)

![image](https://user-images.githubusercontent.com/63082842/104990190-7bc78b80-5a5f-11eb-83bc-cf5ae15c248c.png)
> 응답 실패 시 (이하 모든 요청에 대하여 동일)
<br/>

#### 4. delete 요청
![image](https://user-images.githubusercontent.com/63082842/104990265-9bf74a80-5a5f-11eb-9faf-e06346c0b683.png)
> 요청 ( URL : http://localhost:8080/movie/id값 )
<br/>

#### 5. put 요청
![image](https://user-images.githubusercontent.com/63082842/104990394-d19c3380-5a5f-11eb-9fe0-78f9700d4a60.png)
> 요청 (요청 BODY 데이터 : title, rating)
