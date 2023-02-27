const fs = require("fs");
const path = require("path");

function list(directoryPath) {
  const files = fs.readdirSync(directoryPath);
  files.forEach((file) => {
    const filePath = path.resolve(directoryPath, file);
    const stats = fs.statSync(filePath);
    const fileSize = (stats.size / 1024).toFixed(1);
    console.log(`${file} : ${fileSize}KB`);
  });
}

module.exports = { list: list };
