const fs = require("fs");
const path = require("path");
const crypto = require("crypto");

/**
 *
 * @param {*} directoryPath
 * 디렉토리에서 전체 파일 목록을 탐색하고, 각 파일 내용에 대한 sha256 해시 값을 출력한다
 */
function hash(directoryPath) {
  const files = fs.readdirSync(directoryPath);

  files.forEach((file) => {
    const filePath = path.resolve(directoryPath, file);
    const hash = crypto.createHash("sha256").update(filePath).digest("hex");
    console.log(`${file} : ${hash}`);
  });
}

module.exports = { hash: hash };
