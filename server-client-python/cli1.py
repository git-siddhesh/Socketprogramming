import socket
hostip='127.0.0.1'
hostport=2222
s=socket.socket(socket.AF_INET,socket.SOCK_STREAM)
s.connect((hostip,hostport))
print("Alert! message length should not be exceeded more than 150 characters\n otherwise the conversation cn be trapped")
print("\nEnter 'exit' to end the chat!\n")
print("THE UNKNOWN:\n Welcome, \nhii i am server and BEAWARE!  only i can start the conversation\n\n ")