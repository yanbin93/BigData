#!/bin/bash
if [ "$#" -lt 3 ] ;  then
echo  "Usage:user remote_cmd(zkServer.sh_start/zkServer.sh_stop/rm/poweroff) host1 host2 host3..."
exit 1
fi
user=$1
echo "user is $user!!!"
shift
remote_cmd=$1
shift
case $remote_cmd in
 "rm")
for ip in "$@"
do  	
read -p "lt is goint to delete HADOOP_HOME/tmp! Input yes to 继续/else to exit" sure
if  [ "$sure"x == "yes"x  ] ;then
ssh $user@$ip << remotessh           
rm -rf "/home/yanbin/hadoop-2.6/tmp"
echo "$ip finished!"
exit 
remotessh
else 
exit 1
fi
done
;;
"zkServer.sh_start")
for ip in "$@"
do  	
ssh $user@$ip << remotessh           
zkServer.sh start
echo "$ip finished!"
exit 
remotessh
done
echo "$* has zkServer.sh start"
;;
"zkServer.sh_stop")
for ip in "$@"
do  	
ssh $user@$ip << remotessh           
zkServer.sh stop
echo "$ip finished!"
exit 
remotessh
done
echo "$* has zkServer.sh stop"
;;
"poweroff")
for ip in "$@"
do  	
ssh $user@$ip << remotessh           
echo "0000"|sudo -S poweroff
echo "$ip finished!"
exit 
remotessh
done
echo "$* has poweroff"
;;
esac
