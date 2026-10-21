import requests


def charge_1(credit_card_number, cvv):
    return requests.post("https://api.stripe.com/v1/charges", json={"credit_card_number": credit_card_number, "cvv": cvv})
