#!/bin/bash
home="/home/yanbin/hadoop-2.6"
cp -R $home/spark/conf ~/workspace/hadoopConf/spark.conf
cp -R $home/hbase/conf ~/workspace/hadoopConf/hbase.conf
cp -R $home/zookeeper/conf ~/workspace/hadoopConf/zookeeper.conf
cp -R $home/sqoop/conf ~/workspace/hadoopConf/sqoop.conf
sudo cp /etc/profile ~/workspace/hadoopConf/profile
sudo cp /etc/hosts ~/workspace/hadoopConf/hosts
