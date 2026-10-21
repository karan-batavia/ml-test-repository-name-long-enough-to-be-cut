const axios = require("axios");

async function charge4(creditCardNumber, cvv) {
  const response = await axios.post("https://api.stripe.com/v1/charges", {
    credit_card_number: creditCardNumber,
    cvv: cvv,
  });
  return response.data;
}

module.exports = { charge4 };
