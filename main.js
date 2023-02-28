import readline from "readline";
import { stdin as input, stdout as output } from "process";
import {list} from './mint.js';
const rl=readline.createInterface({input,output});
let changeInput=[];
rl.on('line',(input)=>{
    changeInput = input.split(" ")
    if(changeInput[1]==="list"){
        list("."+changeInput[2]);
    }
    rl.close();
})

rl.on('close', ()=>{
    process.exit();
})