// Global Scope
let globalVar = "I'm global";

function exampleFunction() {
  // Local Scope
  var localVar = "I'm function Scoped";
  console.log(localVar);  // Accessible
  // console.log(blockVar);  // Error - blockVar is not defined here
}

exampleFunction();
console.log(globalVar); // Accessible
// console.log(localVar);  // Error - localVar is not defined here



