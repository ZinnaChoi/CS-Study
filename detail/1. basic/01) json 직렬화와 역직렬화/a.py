import json

x = '{"name" : "kundol"}'  # 딕셔너리

y = json.loads(x) # 역직렬화

print(y["name"])