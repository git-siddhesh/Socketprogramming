import socket
import time 
s=socket.socket(socket.AF_INET,socket.SOCK_STREAM)
hostip="127.0.0.1"
hostport=12344
s.connect((hostip,hostport))

f=open("song.mp3","rb")
print("data is sending...")
data=f.read(500)
while data:
    s.sendall(data)
    data=f.read(500)
print("data sent..")
time.sleep(3)
f.close()
s.close()