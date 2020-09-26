# /usr/bin/env python
# Download the twilio-python library from twilio.com/docs/libraries/python
from twilio.rest import Client

# Find these values at https://twilio.com/user/account
account_sid = "AC17d71ab004573f3a9e914621ae22f3bb"
auth_token = "e1d4b1520e02d11b53dbfc65de293d1f"

client = Client(account_sid, auth_token)

client.api.account.messages.create(
    to="+7706534954",
    from_="+2677133350",
    body="Your order has been placed (Your order ID is 2495830473) ")
