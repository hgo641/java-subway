## 기능 목록

### 역 관리 기능
- [x] 역 등록 기능 
- [x] 역 삭제 기능 
  - [ ] 노선에 등록된 역은 삭제 불가능하다.
- [x] 역 이름 조회 기능

### 노선 관리 기능
- [ ] 노선 등록 기능
  - 상행 종점역과 하행 종점역을 입력받는다.
- [ ] 노선 삭제 기능
  - 노선의 이름을 입력받아 해당 노선을 삭제한다.
- [ ] 노선 조회 기능


### 구간 관리 기능
- [ ] 구간 등록 기능
  - 노선과 역 이름과 역의 순서를 입력받는다.
- [ ] 구간 삭제 기능
  - 노선과 역 이름을 입력받는다.


### 지하철 노선도 출력 기능
- [ ] 노선별로 상행부터 하행까지 출력

### 프로그램 관리 기능
- [ ] 메인 화면에 기능 출력 및 기능별 번호 설정
- [ ] 상세 화면에서 메인화면으로 돌아가는 기능 구현
- [ ] 프로그램 종료 기능 구현


## 예외 처리
- [ ] `[ERROR]`가 붙은 에러 문구를 출력하고 에러 전에 시도한 기능을 재시도한다.

### 역
- [ ] 중복인 지하철 역 이름 불가능
- [ ] 지하철역 이름은 두 글자 이상이어야 함

### 노선
- [ ] 중복인 지하철 노선 이름 불가능
- [ ] 지하철 노선 이름은 두 글자 이상이어야 함
- [ ] 지하철 노선은 두 개 이상의 역이 필요함

### 구간
- [ ] 갈래길 생성 불가능