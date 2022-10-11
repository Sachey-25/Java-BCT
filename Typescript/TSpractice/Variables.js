"use strict";
exports.__esModule = true;
var number = 10;
var y = 20;
var sum = number + y;
console.log(sum);
var title = "Welcome back! this is Typescript";
console.log(title);
//Declarations of typescript
var isBeginner = true;
var firstname = "Sachin";
var lastname = "Anil";
var fullname = (firstname + " " + lastname);
//Display the variable values.
var sentence = "My fullname is ".concat(fullname);
console.log(sentence);
var n = null;
var u = undefined;
var isNew = true;
var myName = 'Sachin';
var list = [1, 2, 3, 4, 5];
var listone = [1, 2, 3, 4, 5, 6];
var person = ["Sachin", 28];
var Color;
(function (Color) {
    Color[Color["Red"] = 0] = "Red";
    Color[Color["Green"] = 1] = "Green";
    Color[Color["Blue"] = 2] = "Blue";
})(Color || (Color = {}));
var c = Color.Green;
var d = Color.Red;
var e = Color.Blue;
console.log(c);
console.log(d);
console.log(e);
var greetings = "Sachin";
console.log(typeof greetings);
