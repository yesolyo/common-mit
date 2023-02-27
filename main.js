import readline from "readline";
import list from "./mit_list.js";

const r = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

r.setPrompt("> ");
r.prompt();

r.on("line", function (line) {
  let [command, option, url] = line.split(" ");
  if (command !== "mit") {
    console.log("없는 명령어 입니다.");
    r.prompt();
    return;
  }

  switch (option) {
    case "list":
      list(url);
      break;
  }

  r.prompt();
});

r.on("close", function () {
  process.exit();
});
