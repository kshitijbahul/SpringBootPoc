#Declaring the AWS Host Name
AWS_SSH_HOST="ubuntu@ec2-54-179-133-202.ap-southeast-1.compute.amazonaws.com"
AWS_CREDENTIAL_FILE="milescampawskeypair.pem"
ssh-keygen -t rsa -N "" -f ~/.ssh/id_rsa
cat ~/.ssh/id_rsa.pub |ssh -i $AWS_CREDENTIAL_FILE $AWS_SSH_HOST 'cat >> .ssh/authorized_keys'
ssh $AWS_SSH_HOST "pkill -9 java && sudo rm /home/ubuntu/SpringBootPoc.jar"
scp target/SpringBootPoc.jar $AWS_SSH_HOST:/home/ubuntu
ssh $AWS_SSH_HOST "java -jar SpringBootPoc.jar"