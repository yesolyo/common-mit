# common-mit
CS16 공통 프로젝트 저장소

# mit 명령어
## mit 명령어 - 기능 요구 사항
- 파일들의 버전 관리를 위한 mit 명령어 구현

### mit 명령어 형식
```shell
$ mit 명령어 디렉토리명

$ mit list /Work/Masters/
$ mit list /Work/Masters
$ mit hash /Work/Masters/
$ mit zlib /Work/Masters/
```

### mit 명령어 종류
- `list` : 해당 디렉토리의 파일 목록을 출력
- `hash` : 해당 디렉토리의 파일들의 hash를 출력
- `zlib` : 해당 디렉토리의 파일들을 zlib로 압축

## mit 명령어 - 프로그래밍 요구 사항
- 디렉토리명은 디렉토리이름으로 끝나거나 `/`로 끝날 수 있습니다.
  - 예를 들어 `/Work/Masters/` 또는 `/Work/Masters`가 디렉토리명이 될 수 있습니다.
- mit 명령어의 디렉토리 입력이 파일인 경우 "경고 메시지"를 출력후 다시 입력하게 합니다.