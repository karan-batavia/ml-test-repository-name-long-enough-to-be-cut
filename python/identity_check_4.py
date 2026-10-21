import requests


def verify_identity_4(ssn, first_name):
    return requests.post("https://api.checkr.com/v1/candidates", json={"ssn": ssn, "first_name": first_name})
