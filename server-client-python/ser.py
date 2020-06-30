import socket

hostip='127.0.0.1'
hostport=1234
s=socket.socket(socket.AF_INET,socket.SOCK_DGRAM)
s.bind((hostip,hostport))
s.listen()
conn,addr=s.accept()
while True:
    data=s.recvfrom(100)
    print(data)
    data2=input("Enter data")
    s.sendall(data2)