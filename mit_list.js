import fs from "fs";

const list = (url) => {
  const files = fs.readdirSync(url);
  url = url[url.length - 1] !== "/" ? url + "/" : url;

  files.forEach((e) => {
    const stat = fs.statSync(url + e);
    console.log(`${e} ${(stat.size / 1024).toFixed(2)}KB`);
  });
};

export default list;
