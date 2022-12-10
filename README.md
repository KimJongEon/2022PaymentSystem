# POS 시스템 (2022PaymentSystem)
> 프로젝트 개발 배경

- RestAPI와 React를 사용해보기 위해 웹으로 POS 시스템을 만들어 보았습니다.

<br/>

☞ 리액트 깃허브 주소 (React Repository) : https://github.com/KimJongEon/frontend


## 1. 주문(홈 화면)
> 주문(메뉴 선택) : 해당 메뉴 클릭 시 테이블에 추가 됩니다.

<img width="1440" alt="image" src="https://user-images.githubusercontent.com/45247057/206096654-2f376048-0a86-4995-b62a-901c09706bd8.png">

<hr/>

> 상품 수량 변경 : + 혹은 - 버튼 클릭 시 수량을 변경 할 수 있습니다.

<img width="1440" alt="image" src="https://user-images.githubusercontent.com/45247057/206096603-f81533e8-3539-469b-a723-870efd460886.png">

- 결제 금액은 실시간으로 자동 합산

<hr/>

> 결제 : 현금 혹은 카드 결제로 구분되어 결제됩니다. 결제 완료 후 주문 내역이 추가 됩니다.

<img width="1440" alt="image" src="https://user-images.githubusercontent.com/45247057/206096684-cfea1829-7966-4ca7-9bb5-4621e4028468.png">

- 초기화 버튼 클릭 시 테이블에 있는 선택 한 모든 상품 리스트에서 삭제


## 2. 주문 내역 확인
> 주문 리스트 : 최근 주문 내역을 상단에 배치

<img width="1440" alt="image" src="https://user-images.githubusercontent.com/45247057/206098699-10f22a55-812c-4ad9-bb94-7f6173b3981f.png">

<hr/>

> 상세 주문 내역 : 해당 주문 선택시 상세 내역 확인 할 수 있습니다.

<img width="1440" alt="image" src="https://user-images.githubusercontent.com/45247057/206099095-9b9cffd2-e91a-4c77-8fe1-971b2f3dcd6c.png">

## 3. 메뉴 관리
> 메뉴 추가 : 상품 이름, 가격 입력 후 완료 시 메뉴에 추가 됩니다. 

<img width="1440" alt="image" src="https://user-images.githubusercontent.com/45247057/206099442-eccb6288-5772-4212-aaaf-497e645d3653.png">
<img width="1440" alt="image" src="https://user-images.githubusercontent.com/45247057/206099461-d24c186b-a241-441c-9893-6dea0f9617e7.png">

<hr/>

> 메뉴 삭제

<img width="1440" alt="image" src="https://user-images.githubusercontent.com/45247057/206099600-e6e2ccee-bd10-4229-963b-f535c23aac7a.png">
<img width="1440" alt="image" src="https://user-images.githubusercontent.com/45247057/206099622-3d37753b-2155-48d4-887f-bb0e3720cf8b.png">

## 프로젝트 구조
> 기술

- Java 11
- Spring 4.14.1, Spring Boot 2.7.4
- React
- MariaDB


> React에서 data를 저장 및 활용하는 구조
- 컴포넌트 안에서 useEffect에서 비동기(axios) 요청
- 데이터 가져오기 성공하면 store.js에 저장하라고 dispatch
<br/>
☞ 리액트 깃허브 (React Repository) : https://github.com/KimJongEon/frontend


## API

![image](https://user-images.githubusercontent.com/45247057/206825334-cd14668a-3403-41a1-9382-c98b3bc7a832.png)


- API 참고 URL : https://documenter.getpostman.com/view/24826100/2s8YzQXPvT







