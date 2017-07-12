#!/bin/bash
if [ $# -lt  2 ]    ;then
echo "Usage:<user> <local address> <host1> <host2>... <goal address>"
exit 1
fi
user="$1"
shift
address="$1"
shift
INDEX=2
for param in $@;do
if [ $INDEX -le "$#" ]; then  
scp -r "$address" yanbin@"$param":"${!#}"
echo "have copyed $address to $param:${!#}" 
fi  
INDEX=$[ $INDEX+1 ]  
done


