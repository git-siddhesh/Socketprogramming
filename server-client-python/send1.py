import socket 
s=socket.socket(socket.AF_INET,socket.SOCK_STREAM)
hostip="127.0.0.1"
hostport=2222
s.bind((hostip,hostport))
s.listen()
conn,addr=s.accept()
print("Alert! message length should not be exceeded more than 150 characters otherwise the conversation cn be trapped")
print("Enter 'exit' to end the chat!\n")
data=input("Enter  the secret message:")
while data!='exit':
    if data.length()>150: 
        print("I warned you, stupid")
    else:
        s.sendall(data.encode('ascii'))
        data2=s.recvfrom(500)
        data=data2[0].decode('ascii') 