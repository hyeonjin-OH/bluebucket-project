# BlueBuket 중고마켓 프로젝트

## 프로젝트 설명

각 지역에 오프라인 센터 및 관리자가 존재하는 판매자 - 관리자 - 구매자 형태의 중고거래 사이트<br/>
판매자는 자주 진상에 시달릴 필요 없으며, 오프라인 센터가 별도 존재하므로 구매자도 직접 상품을 보고 결정할 수 있는 장점이 존재함<br/>
전반적으로는 당근마켓 포맷을 표방함.
<br/><br/>
## 통합 GitHub 주소
[코드보러 가기](https://github.com/orgs/BlueBucket-project/repositories)
<br/><br/>

## 백엔드 소개

  |          유요한         |       오현진                                                                                                                          
|:---------------------------------------------------------: | :-------------------------------------------------------------------------------------------------------------------: |
|  [@YuYoHan](https://github.com/YuYoHan)  | [@hyeonjin-OH](https://github.com/hyeonjin-OH)  |

<br/>

## SKILL & LIBRARY
![SpringBoot](https://img.shields.io/badge/SpringBoot-6DB33F?style=flat-square&logo=SpringBoot&logoColor=black) 
<img src="https://img.shields.io/badge/JPA-brown?style=flat-square&logo=JPA&logoColor=white"> 
<img src="https://img.shields.io/badge/springsecurity-6DB33F?style=flat-square&logo=springsecurity&logoColor=white"> 
<img src="https://img.shields.io/badge/springOAuth2-black?style=flat-square&logo=springOAuth2&logoColor=white"> 
<img src="https://img.shields.io/badge/JWT-purple?style=flat-square&logo=JWT&logoColor=white"> 
<img src="https://img.shields.io/badge/mysql-4479A1?style=flat-square&logo=mysql&logoColor=white"> 
<img src="https://img.shields.io/badge/Gradle-02303A?style=flat-square&logo=Gradle&logoColor=white">
<img src="https://img.shields.io/badge/Swagger-85EA2D?style=flat-square&logo=Swagger&logoColor=white"> 
<br/>

#### 배포
<img src="https://img.shields.io/badge/AWS-232F3E?style=flat-square&logo=AWS&logoColor=white"> <img src="https://img.shields.io/badge/EC2-FF9900?style=flat-square&logo=EC2&logoColor=white"> 
<img src="https://img.shields.io/badge/RDS-527FFF?style=flat-square&logo=RDS&logoColor=white"> 
<img src="https://img.shields.io/badge/github Actions-2088FF?style=flat-square&logo=githubactions&logoColor=white">
<br/>

#### 협업
<img src="https://img.shields.io/badge/github-181717?style=flat-square&logo=github&logoColor=white"> <img src="https://img.shields.io/badge/git-F05032?style=flat-square&logo=git&logoColor=white">
<img src="https://img.shields.io/badge/notion-000000?style=flat-square&logo=notion&logoColor=white">

---
# 프로젝트 구성 및 역할

## ERD
![ERD](https://postfiles.pstatic.net/MjAyMzEyMDhfMzkg/MDAxNzAyMDIyNjYyOTIz.wSB5UhZmPnCksOrNrNkh9_dQ5oyRMtTyovJA2YmM2asg.fJOB84jSHW_9qcGSuerN0bmqWOWMGPeLwhqFpfUB4aMg.PNG.bisung62/image.png?type=w773)

## 역할
### 상품(ITEMS), 장바구니(CART), 구매(ORDERS), 자동 배포(AWS EC2 + Git Actions)
- 주요 기능 : 상품 등록, 수정, 삭제, 장바구니 담기 및 구매처리, 예외 처리 등
- AWS S3를 이용한 상품 이미지 저장
- JPA 연관관계를 이용한 데이터 삭제 시, 참조 관계(상품 테이블)의 경우 동시 삭제 혹은 null처리
- EC2 서버관리 및 Git Actions + Code Deploy를 이용한 자동배포(CD)

## 고찰
- 프론트와의 API공유에 있어 명확한 문서 및 사용법.용어 안내의 필요성
- 도메인 로직의 구성 위치의 중요성
  Entity to DTO의 함수 위치, 공통으로 사용될 수 있는 도메인 함수의 위치 등
- Spring Data JPA의 사용 및 Fetch Join 관련된 사항 직면
