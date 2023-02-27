this.readline = require("readline");
this.stdio = this.readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

console.log("> 명령어를 입력해 주세요.");
this.stdio.on("line", (cmd) => {
  if (cmd === "exit") {
    this.stdio.close();
  }
});
