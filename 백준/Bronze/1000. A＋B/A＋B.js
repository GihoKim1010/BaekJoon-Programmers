const readline = require("readline");

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let input = [];

rl.on("line", (line) => {
  input.push(line);
});

rl.on("close", () => {
    const [num1, num2] = input[0].split(" ").map(Number);
    console.log(num1 + num2);
  });