import fs from "fs";

const list = (dir) => {
    const files = fs.readdirSync(dir);
    files.forEach((fileName,index) => {
        let fileSize = fs.statSync(dir+"/"+fileName).size;
        console.log(`${index+1}.${fileName} ${fileSize}KB`)
    })
}

export {list};