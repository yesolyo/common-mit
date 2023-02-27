const fs = require("fs");
const path = require("path");
const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});

rl.on("line", (input) => {
    if (input === "mit list directory") {
        const directoryPath = process.cwd();
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

console.log('Type "mit list directory" to list files in current directory.');

//현재 디렉토리 가능
