## 시나리오

1. 전체 시나리오
- 총 5명의 캐릭터 중 플레이어 4명을 선택한다. (처음 2명: 팀1, 나중 2명: 팀2)
- 플레이어가 생성될 때 각자 무기를 2개씩 랜덤으로 획득한다. (모두 동일한 확률) 자신이
사용할 수 없는 무기를 획득하려고 시도할 경우 소유한 무기를 나타내는 ArrayList
<Weapon> ws에 add되지 못하며, 사용 가능할 경우 add된다. 수트를 가질 수 있는 플레
이어의 경우 80%의 확률로 획득할 수 있다.
- 획득 무기, 공격 방법, 수트 여부에 따라 hp와 power가 달라지기도 하며, 배틀 화면에서
팀정보확인 버튼을 통해 팀정보 view에서 확인할 수 있다.
- 공격하기 버튼을 누르면 공격팀에서 공격자 1명, 상대팀에서 타겟 1명을 랜덤을 선정하여
공격한다. 공격할 때 자신의 ws에서 랜덤으로 무기를 선택하여 공격한다. 소유한 무기가
없을 경우 때리기 메소드가 수행된다.
- 공격이 수행될 때마다 hp가 깎인 Player의 생사를 확인하며, 죽었을 경우 팀 ArrayList에
서 삭제하고, 메시지를 출력한다. 아닐 경우 현재 hp를 출력한다.
- 한 팀이 모두 죽어 우승팀이 결정되면 공격하기 버튼을 누를 수 없게 된다. 게임 종료 메
시지를 출력하고, 살아남은 Player를 보여준다. Log를 저장할 수 있다.

2. Player
- 모든 Player는 attackable함.

| Player | 기본 HP | Power | 사용가능한 무기 | 공격 방법 Interface | 특이사항 |
| --- | --- | --- | --- | --- | --- |
| 아이언맨 | 1200 | 50 | 권총, 샷건 | Hitable
Shootable | Player 생성시 80%의 확률로 수트 생성 (power+50, Hp
+200) |
| 토르 | 1600 | 80 | 망치, 권총, 샷건, 돌덩이 | Hitable
Shootable |  |
| 헐크 | 2000 | 150 | 망치, 권총, 샷건, 돌덩이 | Hitable
Throwable | Shootable한 무기도 던지기만 할 수 있음 |
| 스파이더맨 | 1200 | 50 | 권총, 샷건 | Hitable
Shootable | Player 생성시 80%의 확률로 수트 생성 Power+40, Hp+200 |
| 블랙위도우 | 1500 | 80 | 권총, 샷건 | Hitable
Shootable |  |
- Player가 때리면 자신의 power만큼 타겟의 hp가 감소
- Player가 무기를 이용하여 때리거나 총을 쏘면 자신의 power + 무기의 power만큼 타겟의
hp가 감소
- Player가 무기를 던지면 무기의 power만큼 타겟의 hp가 감소, 소유한 무기를 나타내는
ArrayList <Weapon> ws에서 해당 무기가 remove됨.

3. 무기
- 모든 무기는 Attackable함

| Weapon | power | Interface | 특이사항 |
| --- | --- | --- | --- |
| 망치 | 50 | Hitable
Throwable | 토르만 계속 사용 가능. 헐크는 던져버림. 나머지는 획득 불가(power=50) |
| 권총 | 총: 10
총알: 80 | Shootable
Throwable | 상위클래스: 총
총쏘기 power= Player power + 80
던지기: 10 |
| 샷건 | 총: 20
총알: 100 | Shootable
Throwable | 상위클래스: 총
총쏘기 power= Player power + 100
던지기: 20 |
| 돌덩이 | Weight * 50 | Throwable | Weight는 1~10사이에서 랜덤 생성됨
헐크만 획득 가능 |