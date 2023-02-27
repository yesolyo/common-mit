// 129KB 크기의 데이터를 생성합니다.
const data = new Uint8Array(129 * 1024);
for (let i = 0; i < data.length; i++) {
  data[i] = Math.floor(Math.random() * 256);
}

// 데이터를 파일로 저장합니다.
const fs = require('fs');
fs.writeFileSync('random_data.js', data);
