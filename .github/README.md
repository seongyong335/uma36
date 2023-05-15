
<!-- Shared HTML Code -->

<div align="center">
  <a href="https://github.com/UMA-SAHMYOOK"><img src="https://capsule-render.vercel.app/api?type=waving&height=200&section=header&text=UMA36&fontAlign=80&fontAlignY=40&color=gradient"/> 
</div>
  <h1 align="center">TEAM MEMBER</h1>
<div align="center">
  <a href="https://github.com/seongyong335"><img src="https://img.shields.io/badge/최성용-FAD0C9?style=for-the-badge&logo=github&logoColor=6E6E6D" />
  <a href="https://github.com/asm2005"><img src="https://img.shields.io/badge/안성민-FF9900?style=for-the-badge&logo=github&logoColor=white" />
  <a href="https://github.com/jongkyuh"><img src="https://img.shields.io/badge/함종규-181717?style=for-the-badge&logo=github&logoColor=white" />
  <a href="https://github.com/kmc6381"><img src="https://img.shields.io/badge/강민철-181717?style=for-the-badge&logo=github&logoColor=white" />
  <a href="https://github.com/OneReal3203"><img src="https://img.shields.io/badge/양한진-181717?style=for-the-badge&logo=github&logoColor=white" />
</div>

<h2>📑요구사항 정의</h2>
<ol>
  <li>경마에 참여하는 말의 마리수는 9마리로 정한다.</li>
  <li>게임프로그램이 완전 종료 되기전까지는 최고점수를 저장하고, 출력한다.</li>
  <li>각각의 9마리의 말은 출발선에서 도착선까지 움직이는 모습이 보여야 한다. </li>
  <li>말이 달리는 그 모션을 정확히 어떤 방식으로 출력할지를 정하고 구현해야한다. </li>
  <li>시작할때 score 10000점을 가지고 시작한다. </li>
  <li>마권은 score를 1000점을 소모하여 구매할 수 있다. </li>
  <li>마권은 한 회차당 10개까지 사용할 수 있다. </li>
  <li>모든 마권에는 회차가 존재한다. </li>
  <li>모든 말의 승률을 확인할 수 있어야 한다. </li>
  <li>마권을 걸지 않더라도 경기는 볼 수 있다. </li>
  <li>말의 공통속성을 가진 클래스가 있어야 하며, 또 개별적인 특성을 가진다. </li>
  <!-- ... -->
</ol>

<h2>🏇개발에서 필요한 역할</h2>
<ul>
  <li>말 - 종규</li>
    - 말의 상속 클래스 (달리기, 속도 등의 속성을 포함)
    - 말의 인터페이스
    - 경기 수, 우승 횟수, top3 횟수 등의 정보 관리
 <li>경마 경기 - 성용</li>
    - 경마 경기 화면 출력
    - 실시간 말의 움직임 표시
    - 턴 기능 구현
    - 1번마 표시
  <li>배당 - 민철</li>
    - 새로운 회차마다 배당 계산
    - 승률 기반 배당 적용
    - 시간이 남는다면 승률 통계 기능 추가
  <li>점수 - 한진</li>
    - 점수 시스템 구현
    - 마권 구매 및 베팅 기능 추가
  <li>메뉴 - 성민</li>
    - 깔끔한 인터페이스 구현
    - 화면 전환 시 이전 화면 유지 방지
    - 화면 크기에 맞춰 꾸미기
  <li>저장</li>
    - 게임 진행 상태 저장 및 불러오기 기능 구현
</ul>
이 외에 추가해야 할 내용이 있으면 알려주세요.

<h2>🔒규칙</h2>
<ol>
  <li>생성한 변수는 노션에 기재합니다.</li>
  <li>리뷰어는 1~2명으로 제한하고, Pull Request 후에는 디스코드 방에 즉시 알립니다.</li>
  <li>코드 작성은 테스트(Tests) 폴더에서 시작하며, Pull Request하기 전에는 main 브랜치에 적용하고 테스트 폴더를 비웁니다. 
  <li>풀리퀘스트할 때 하나의 기능 완성할 때 마다 PR을 합니다.</li>
  <li>한 기능이 15줄 이상이 되면 메소드로 분리합니다.</li>
  <li>각자의 진행 상황은 매일 업데이트합니다.</li>
  <li>서로 모르는 것은 물어보는 것을 부끄러워하지 않습니다.</li>
  <li>코드마다 용도를 주석으로 남깁니다.</li>
  <li>구체적인 목표를 이슈에 미리 작성하여 각자 만들고자 하는 것을 명확히 합니다.</li>
  <li>로그를 남깁니다.</li>
</ol>

<h2>💻경마장 출력화면 순서</h2>
<p>A. 경마장 입장 및 퇴장</p>
<ol>
<pre class="notranslate"><code>
  <li>경마장에 입장하셨습니다.</li>
</code></pre>
  </ol>

<p>B. 입장 메뉴</p>
<ol>
  <pre class="notranslate"><code>
   <li>경마 시작</li>
  <li>경마 승리 확률 및 배당 확인</li>
  <li>마권 사기</li>
  <li>경마장 퇴장</li>
</code></pre>
</ol>
<p>C. 경마 시작 시 출력되는 화면</p>
<ol>
<pre class="notranslate"><code>
  <li>경마 게임을 시작하였습니다.</li>
</code></pre>
  </ol>

<p>D. 경마 승리 확률 및 배당 확인</p>
<ol>
<pre class="notranslate"><code>
 <p>1번마 승리 확률: ____, 배당 확률: ____</p>
<p>2번마 승리 확률: ____, 배당 확률: ____</p>
<p>3번마 승리 확률: ____, 배당 확률: ____</p>
<p>4번마 승리 확률: ____, 배당 확률: ____</p>
<p>5번마 승리 확률: ____, 배당 확률: ____</p>
<p>6번마 승리 확률: ____, 배당 확률: ____</p>
<p>7번마 승리 확률: ____, 배당 확률: ____</p>
<p>8번마 승리 확률: ____, 배당 확률: ____</p>
<p>9번마 승리 확률: ____, 배당 확률: ____</p>

</code></pre>
  </ol>



  
<p>E. 마권 사기 
  <ol>
  <pre class="notranslate"><code>
   마권을 최대 10개까지 구매할 수 있습니다. (입력 필요)
</code></pre>
</ol>



<!-- ... -->
