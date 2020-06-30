import socket

hostip='127.0.0.1'
hostport=1234
s=socket.socket(socket.AF_INET,socket.SOCK_DGRAM)
s.connect((hostip,hostport))
while True:
    data2=input("Enter data")
    conn.sendall(data2)
    data=conn.recvfrom(100)
    print(data)