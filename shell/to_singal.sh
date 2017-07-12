#!/bin/bash
hadoop_home=$HADOOP_HOME
hadoop=/home/yanbin/hadoop-2.6
read -p "Are you sure to tranform hadoop to 伪分布式?yes/no?  " wheather
if	[ "$wheather"x != "yes"x ]&&[ "$wheather"x != "no"x ]	; then 
read -p "Are you sure to tranform hadoop to 伪分布式?yes/no?  " wheather	
if	[ "$wheather"x != "yes"x ]&&[ "$wheather"x != "no"x ]	; then 
exit 1
fi
fi
case $wheather in 
"yes")
echo "It is going to 部署伪分布式!"
cp $hadoop_home/etc/hadoop.alone/* $hadoop_home/etc/hadoop/
cp $hadoop/hbase/conf/alone/* $hadoop/hbase/conf/
cp $hadoop/hive/conf/alone/* $hadoop/hive/conf/
cp $hadoop/spark/conf/alone/* $hadoop/spark/conf/
echo "完成伪分布部署！！！"
read -p "输入start开始启动hadoop集群，输入其他将退出" start
if [  "$start"x = "start"x ] ; then
start-dfs.sh
start-yarn.sh
start-hbase.sh
else 
exit 1
fi
;;
"no")
echo "exit!"
exit 1
;;
esac
