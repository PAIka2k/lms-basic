# lms-basic
publicai lms platform 구축을 위한 basic 기능 구현을 위한 repository입니다.


## 0.Settings

### 0.0. Requirements
- IntelliJ
- Java 11
- Springboot 2.7.8


### 0.1. 본 레포지토리를 clone 해주세요.
- intelliJ 사용
<img width="1255" alt="스크린샷 2023-01-31 오후 5 57 15" src="https://user-images.githubusercontent.com/49555674/215714420-fdb2ffdf-662f-49f9-8b3a-407c0fac979b.png">

### 0.2. `src/main/java/com/example/contentservice/ContentServiceApplication.java` 파일을 실행해주세요.
<img width="1289" alt="스크린샷 2023-01-31 오후 5 59 36" src="https://user-images.githubusercontent.com/49555674/215715363-15f7aea2-f70d-47ec-8bf7-8baf72561ae5.png">

**아래와 같이 문제없이 spring 서버가 실행된다면 다음 단계로 넘어가주세요**

<img width="1686" alt="스크린샷 2023-01-31 오후 6 03 06" src="https://user-images.githubusercontent.com/49555674/215715763-08643531-217e-452e-ae4a-31fe3648e2b8.png">


## 1.유저 관련 기능
### 1.1. 회원 가입 기능
- http://localhost:8080/ 에 접속하면 아래와 같은 화면이 나옵니다. "회원 가입" 버튼을 눌러주세요.
<img width="649" alt="스크린샷 2023-01-31 오후 6 05 36" src="https://user-images.githubusercontent.com/49555674/215716098-6d77535f-1889-4a4f-850d-a19b6184179f.png">

- 회원 정보를 입력하고 "회원 가입" 버튼을 눌러주세요.
<img width="634" alt="스크린샷 2023-01-31 오후 6 06 40" src="https://user-images.githubusercontent.com/49555674/215716331-ff8d09c4-3554-4f05-ab6e-3f3d72286e82.png">

### 1.2. 로그인 기능

- "로그인" 버튼을 누르고 "회원 가입" 시 입력한 정보를 입력해주세요.
<img width="593" alt="스크린샷 2023-01-31 오후 6 07 18" src="https://user-images.githubusercontent.com/49555674/215716469-dd609120-c56e-4224-9885-af2a05b35951.png">

- "로그인 유저 전용 홈페이지"에 접속되었다면 성공입니다.
<img width="624" alt="스크린샷 2023-01-31 오후 6 07 32" src="https://user-images.githubusercontent.com/49555674/215716521-fa649030-c887-4344-9c64-81ec3dd739e5.png">

### 1.3. 로그아웃 기능
- "로그인 유저 전용 홈페이지" 에서 "로그아웃" 버튼을 누르면 로그아웃됩니다.
<img width="711" alt="스크린샷 2023-01-31 오후 6 16 47" src="https://user-images.githubusercontent.com/49555674/215718703-5642bdbe-187d-4aee-8871-76ca3dac9dbb.png">

## 2.컨텐츠 관련 기능
### 2.1. 컨텐츠 조회 기능
- "로그인 유저 전용 홈페이지"에서 "컨텐츠 관리" 버튼을 눌러주세요.
<img width="667" alt="스크린샷 2023-01-31 오후 6 09 03" src="https://user-images.githubusercontent.com/49555674/215716861-0c0af17a-c712-43e2-862f-4dde16bc6112.png">

- "컨텐츠 목록" 페이지에 디폴트로 [미리 등록되어 있는 컨텐츠](https://github.com/PAIka2k/lms-basic/blob/master/src/main/java/com/example/contentservice/TestDataInit.java)가 존재합니다.
<img width="625" alt="스크린샷 2023-01-31 오후 6 10 22" src="https://user-images.githubusercontent.com/49555674/215717217-b8b81773-acee-43a3-9631-12435545557e.png">

- 개별 "컨텐츠명" 클릭 시 "컨텐츠 상세 페이지"를 확인할 수 있습니다.
<img width="923" alt="스크린샷 2023-01-31 오후 6 12 41" src="https://user-images.githubusercontent.com/49555674/215717741-95516965-29c8-499a-bc12-2f738ebf9dc7.png">

### 2.2. 컨텐츠 수정 기능
- "컨텐츠 상세 페이지"의 "컨텐츠 수정" 버튼을 눌러주세요.
<img width="552" alt="스크린샷 2023-01-31 오후 6 13 29" src="https://user-images.githubusercontent.com/49555674/215717930-fa62144b-6df6-4e47-9d36-601dddd65dbb.png">

- "컨텐츠 수정 폼"에 수정하고자 하는 내용을 입력하고 "저장" 버튼을 누르면, 컨텐츠 수정이 완료됩니다.
<img width="594" alt="스크린샷 2023-01-31 오후 6 14 08" src="https://user-images.githubusercontent.com/49555674/215718074-83042dc6-f81c-4b5c-a6f8-0a2e98bea46e.png">

### 2.3. 컨텐츠 등록 기능
- "컨텐츠 목록" 페이지의 "컨텐츠 등록" 버튼을 눌러주세요
<img width="657" alt="스크린샷 2023-01-31 오후 6 15 01" src="https://user-images.githubusercontent.com/49555674/215718271-f44dc0f9-4e9d-401d-9228-2e2d621a48d4.png">

- "컨텐츠 등록 폼" 페이지에 등록하고자 하는 내용을 입력하고 "컨텐츠 등록" 버튼을 누르면, 컨텐츠 등록이 완료됩니다.
<img width="577" alt="스크린샷 2023-01-31 오후 6 15 22" src="https://user-images.githubusercontent.com/49555674/215718356-8baf07e8-1987-43fb-a68e-2aacc4cdfda1.png">

