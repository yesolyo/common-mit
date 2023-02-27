# common-mit
CS16 공통 프로젝트 저장소

## git

### 저장소
* remote
  * `remote`는 말 그대로 리모트 서버 자체를 의미한다.<br>
    전 세계 어딘가에 있는 서버에 우리가 작성한 코드를 저장하는 것이다.
    이때 이 서버를 제공해주는게 `Github`와 같은 회사들이다.
  * git 을 사용할 때 어떤 리모트 서버에 변경사항을 저장해주어야 한다.<br>
    하나의 리모트 서버만 사용하는 것이 아니기 때문에 리모트 서버의 이름을 정해주는데 관례적인 이름이 `Origin`이다.
* local
  * `local`도 말 그대로 우리 로컬 환경을 의미한다. <br>
    우리가 컴퓨터에서 코드를 작성하는 공간이 로컬이다. 
* init
  * `git init`은 새로운 git 저장소를 만드는데 사용하는 명령어이다.<br>
    혹은 기존에 존재하는 저장소를 재초기화할 때도 사용한다.
* clone
  * `clone`은 리모트 서버의 저장소에서 클라이언트로 파일들을 복사/붙여넣기 하는 행위이다.<br>
    이때 어떤 저장소(repository)에서 파일들을 가져올 것인지에 대한 정보가 필요하다.
    이 정보는 url로 표현되며 아래와 같이 사용한다.
  * `$ git clone https://github.com/codesquad-members-2023/common-mit.git`

## 상태관리
* git repository
  * `repository`는 저장소를 의미하는데, 리모트 서버 내에서 구분되는 프로젝트 단위이다.
* staging area
  * `staging area`는 말 그대로 준비 영역에 해당한다.<br>
    즉, 커밋을 하기 위해 `$ git add`로 추가한 파일들이 모여 있는 공간으로 생각할 수 있다.
  * 스테이지에 있는 내용 전체를 이용해 트리를 생성하고 생성된 트리를 통해 커밋을 생성한다.
* working directory
  * `working directory`는 현재 로컬 공간이라고 생각할 수 있다.
    즉, 내가 작업하고 있는 프로젝트의 디렉토리로 생각하자.

## 파일관련
* Untracked
  * Working directory에 있는 파일이지만 git 으로 관리하지 않는 파일을 말한다.
* Unmodified
  * `$ git add`와 같은 명령어로 파일을 새롭게 추가했을 때 해당 상태가 된다.
* Modified
  * 파일이 `$ git add`와 같은 명령어로 추가된 이후 파일이 변경되었을 때의 상태를 말한다.
* Staged
  * 파일이 Staging area에 올라가 있는 상태를 말한다.
