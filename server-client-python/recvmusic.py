piimport socket
import time 
s=socket.socket(socket.AF_INET,socket.SOCK_STREAM)
hostip="127.0.0.1"
hostport=12344

s.bind((hostip,hostport))
s.listen()

conn,addr=s.accept()
f=open("new.mp3","wb+")
print("data is receiving...")
data=conn.recvfrom(500)
while data[0]!=b'':
    f.write(data[0])
    data=conn.recvfrom(500)
print("data copied..")
f.close()
s.close()