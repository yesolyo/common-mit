const fs = require("fs");
const path = require("path");

/**
 *
 * @param {*} directoryPath
 * 디렉토리에서 전체 파일 목록을 탐색하고, 각 파일 내용에 대한 sha256 해시 값을 출력한다
 */
function hash(directoryPath) {
  const files = fs.readdirSync(directoryPath);
  files.forEach((file) => {});
}

module.exports = { hash: hash };
