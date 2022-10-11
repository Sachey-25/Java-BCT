export {}
let number=10;
const y=20;

let sum=number+y;
console.log(sum);

const title="Welcome back! this is Typescript";
console.log(title);

//Declarations of typescript
let isBeginner:boolean = true;

let firstname:string="Sachin";

let lastname:string="Anil";

let fullname:string=(firstname+ " " + lastname);

//Display the variable values.
let sentence:string =`My fullname is ${fullname}`
console.log(sentence);

let n:null=null;
let u:undefined=undefined;

let isNew:boolean=true;
let myName:string='Sachin';

let list:number[]=[1,2,3,4,5];
let listone:Array<number>=[1,2,3,4,5,6];

let person:[string,number]=["Sachin",28];

enum Color {Red, Green, Blue}

let c: Color = Color.Green;
let d: Color = Color.Red;
let e: Color = Color.Blue;
console.log(c);
console.log(d);
console.log(e);

let greetings="Sachin";
console.log(typeof greetings);