const axios = require("axios");
const url = "https://api.upbit.com/v1/market/all?isDetails=false";

axios
  .get(url)
  .then(function (response) {
    let data = response.data;
    console.log(data);
  })
  .catch(function (error) {
    console.log(error);
  })
  .finally(function () {
    console.log("I always execued");
  });
