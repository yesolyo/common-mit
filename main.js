const { list } = require("./list.js");

this.readline = require("readline");
this.stdio = this.readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

console.log("> 명령어를 입력해 주세요.");
console.log("형식 : mit ");

this.stdio.on("line", (cmd) => {
  if (cmd === "exit") {
    this.stdio.close();
  }

  const [commandName, subCommand, path] = cmd.split(" ");

  if (commandName === "mit") {
    switch (subCommand) {
      case "list":
        list(path);
        break;
      case "hash":
        break;
      case "zlib":
        break;
    }
  }
});
