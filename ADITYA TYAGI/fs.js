// const fs =require('fs');
// const first = fs.readFileSync('./content/subfolder/test.txt','utf-8');
// const second = fs.readFileSync('./demo.txt','utf-8');

// console.log(first,second)

// fs.writeFileSync('./content/subfolder/result.txt',`hello here is the result: ${first} ,${second}`,{flag: 'a'})

const fs = require('fs');
console.log("start")
fs.readFile('./content/subfolder/test.txt','utf-8',(error,result)=>{
    if(error){
        console.log(error)
        return;
    }
    const first=result;
    fs.readFile('./content/subfolder/demo.txt','utf-8',(error,result)=>{
        if(error){
            console.log(error)
            return;
        }
        const second= result;
        fs.writeFile('./content/subfolder/async.txt',`hey buddy this is the output in the file ${first} , ${second}`,{flag: 'a'},(err)=>{
            if(err){
                console.log(err);
            }
            console.log("your program has been successfully now yoyu c ")
        });
    })
})
console.log("ending")