import readline from "readline";
import { stdin as input, stdout as output } from "process";
import {list} from './mint.js';
const rl=readline.createInterface({input,output});
let changeInput=[];
rl.on('line',(input)=>{
    changeInput = input.split(" ")
    switch (changeInput[1]){
        case "list":
            list("."+changeInput[2]);
            break;
        case "hash":
            break;
        case "map":
            break;
    }
    rl.close();
})

rl.on('close', ()=>{
    process.exit();
})

