const fs = require("fs");
const path = require("path");
const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});

rl.on("line", (input) => {
    if (input.indexOf("mit list ") === 0) {
        const directoryPath = input.substring("mit list ".length);
        const files = fs.readdirSync(directoryPath);

        files.forEach((file) => {
            const filePath = path.join(directoryPath, file);
            const stats = fs.statSync(filePath);
            const fileSizeInBytes = stats.size;
            const fileSizeInKB = Math.round(fileSizeInBytes / 1024);
            console.log(`${file} ${fileSizeInKB}KB`);
        });

        rl.close();
    }
});

console.log('"mit list [디렉토리명]" 명령어를 입력해 원하는 디렉토리를 탐색할 수 있습니다"');
