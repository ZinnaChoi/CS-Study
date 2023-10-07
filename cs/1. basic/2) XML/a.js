const fs = require("fs");
const path = require("path");
const parser = require("xml2json");

let a = fs.readFileSync(path.join(__dirname, "a.xml"));
a = parser.toJson(a);

console.log(a);
