# CS16. mit 명령어

## zlib

자바의 `Class Deflater`는 ZLIB 압축 라이브러리를 사용하여 범용 압축을 지원한다.  
처음에 ZLIB 압축 라이브러리는 PNG 그래픽 표준의 일부로 개발되었다.

`Deflater` 및 `Inflater`를 사용하여 문자열을 간단하게 압축 및 압축 해제하는 방법은 아래와 같다.

``` java
try { 
     // 문자열을 바이트열로 인코딩 
     String inputString = "blahblahblah";
     byte[] input = inputString.getBytes("UTF-8");

     // 바이트 압축 
     byte[] output = new byte[100]; 
     Deflater compresser = new Deflater();
     compresser.setInput(input);
     compresser.finish();
     int compressedDataLength = compresser.deflate(output);
     compresser.end();

     // 바이트 압축 해제 
     Inflater decompresser = new Inflater();
     decompresser.setInput(output, 0, compressedDataLength);
     byte[] result = new byte[100];
     int resultLength = decompresser.inflate(result);
     decompresser.end();

     // 바이트를 String으로 디코딩
     outputString = new String(result, 0, resultLength, "UTF-8"); 
 } catch(java.io.UnsupportedEncodingException ex) { 
     // 처리 
 } catch(java.util.zip.DataFormatException ex) { 
     // 처리 
 }
```

## sha

`SHA(Secure Hash Algorithm)`는 암호화 해시 함수 중 하나이다.

SHA-256 알고리즘은 거의 고유한 **고정 크기 256비트(32바이트) 해시를 생성**하며,
단방향 함수이므로 결과를 원래 값으로 다시 해독할 수 없다.

현재 SHA 해싱은 암호화 분야에서 가장 안전한 해싱 알고리즘으로 간주되어 널리 사용되고 있다.

Java는 SHA-256 해싱을 위한 `Class MessageDigest`를 제공한다.

``` java
final MessageDigest digest = MessageDigest.getInstance("SHA3-256");
final byte[] hashbytes = digest.digest(
  originalString.getBytes(StandardCharsets.UTF_8));
String sha3Hex = bytesToHex(hashbytes);
```

> JDK 9부터 내장 SHA3-256 알고리즘을 간단하게 사용할 수 있다.

## 용어

### 저장소 관련

- remote : 일반적으로 `remote repository`는 원격 저장소를 의미한다.
- local : 일반적으로 `local repository`는 개인 PC에 있는 저장소를 의미한다.
- init : `git`을 통해 관리하고 싶은 프로젝트 디렉토리로 가서 `git init` 명령어를 실행하면 git 저장소가 생기고 프로젝트를 버전 관리할 수 있다.
- clone : `git clone` 명령어는 사실 다른 명령어를 몇 개 실행한다. 1. 디렉토리를 만들고 2. 디렉토리로 들어가서 3. `git init` 명령으로 빈 git 저장소를 만든다. 4. 그 다음 입력한 URL을 `origin`이라는 이름의 리모트로 추가하고 `git remote add` 5. `git fetch` 명령으로 리모트 저장소에서 데이터를 가져온다. 6. 마지막으로 최종 커밋을 워킹 디렉토리에 `git checkout` 한다. 

### 상태 관리

- git repository : `git repository`는 저장소로 , 말그대로 파일이나 폴더를 저장해 두는 곳을 말한다.
- staging area : `commit`을 실행하기 전, 저장소와 작업 트리 사이에 존재하는 공간을 **인덱스**라고 하며, 이곳에 파일 상태를 기록하는데 이를 `staging`한다고 표현한다. `Index` 대신 `Staging Area`라는 용어를 써도 상관 없다.
- working directory : `git`에서는 폴더를 작업 트리 `Work Tree`라고 부른다.

### 파일 관련

- Untracked : `git`에 의해 추적 및 관리되지 않는 상태를 말한다.
- Unmodified : `git`에 의해 관리되고 있으며 파일의 변경사항이 없음을 의미한다.
- Modified : `git`에 의해 관리되고 있으며 파일의 내용이 변경되었음을 의미한다.
- Staged : `commit`을 하기 위해 `stage area`에 파일이 올라가있음을 의미한다.