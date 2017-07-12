#!/bin/bash
hadoop_home=$HADOOP_HOME
hadoop=/home/yanbin/hadoop-2.6
read -p "Are you sure to bulid hadoop to ha集群分布式?yes/no?  " wheather
if	[ "$wheather"x != "yes"x ]&&[ "$wheather"x != "no"x ]	; then 
read -p "Are you sure to bulid hadoop to ha集群分布式?yes/no?  " wheather	
if	[ "$wheather"x != "yes"x ]&&[ "$wheather"x != "no"x ]	; then 
exit 1
fi
fi
case $wheather in 
"yes")
echo "It is going to 搭建ha集群分布式!"
#read -p "Input username!  " username
#read -p "Input host!  " host
#ssh $yanbin@$host "test -d ~/test || mkdir test_new" 
#[result] && echo "exit" || echo "not exist"
echo "使用方法：./scp.sh <username> <本地hadoop-2.6路径/home/yanbin/hadoop-2.6>  <节点hostname:node1 node2 node3... >  <目标hadoop-2.6路径/home/yanbin>"
#./scp.sh $username /home/$username/hadoop-2.6 $node /home/$username/
#scp $hadoop/hbase/conf/dfs/* $hadoop/hbase/conf/
#scp $hadoop/hive/conf/dfs/* $hadoop/hive/conf/
#scp $hadoop/spark/conf/dfs/* $hadoop/spark/conf/
#echo "完成ha集群分布式搭建！！！"
#read -p "输入start开始启动hadoop集群，输入其他将退出" start if [  "$start"x == "start"x ] ; then ./ssh.sh yanbin zkServer.sh_start node1 node3 node4 start-dfs.sh start-yarn.sh start-hbase.sh else exit 1 fi ;; "no") echo "exit!" exit 1
;; 
esac
