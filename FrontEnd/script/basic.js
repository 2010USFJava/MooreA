// not compliled
// prototype- based, multi-paradigm, single threaded, 
//dynamic language, supporting object-oriented, imperative
//amd declaritive (eg functional programing) styles

var a=10;
console.log(a);
a="chaos";
console.log(a);

//datatypes 6()
//6 data types that are primitives and 
//can be checked by the type of operator
/*
-undefined
-boolean
        -true and false
        -truthy and falsey
        -truthy
            -true
            -1
            -object
           Falsey
            -0
            -  -0 
            -undefined
            -null
            -false
            -""
            -NaN
-number
-string
-ES6
    -BigInt
    -symbol
  -not primitives
    -null- typeof is object
    -object - type of object
    -function - non data structure, give typeof is function
     -NaN - not a number - typeof is number


*/

var b, c, d, e, f, g, h,e;
b="10";
c=true;
d={};// not an object
e=null;
g=(0/0);
h=[];
i=function(){};

console.log(5==5);
console.log(5== '5');
console.log(5==='5');

console.log(0===-0);

console.log(7+7+7);
console.log(7+7+"7");
console.log("7"+7+7);
console.log(7+"7"+7);

//objects in JS
/*
property value pairs
    
*/
var person={
    "name":"jimmy",
    "age":74
};

function Human(name,age){
    this.name=name;
    this.age=age;
}

//maker function
function makePerson(name,age){
    var p={};
    p.name=name;
    p.age=age;
    return p;
}

function makePerson2(name,age){
    var p={
        "name":name,
        "age":age
    } 
}

var myArray=[10,20,30];
myArray[9]="footballbat";
myArray[32]=["pink",new Human("Greg",24),12];


function divideByZero(kitty, kat){
    console.log("hey kitty");
    return (kitty+kat);
}
    var conFunc = function(a,b){
        return a*b;
    }

   Human.getInfo=function(){
        return this.age;
    }

let funstuff=fuction(a,b){
    var c,d;
    let e,f;
    var g=4;
    if(a>b){
        var g=3;
        let h=10;
        i;
    }
}