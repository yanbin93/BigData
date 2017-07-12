hadoop_home=$HADOOP_HOME
if [ "$#" -lt 1 ] ; then
echo "Usage:<replace/nonreplace>"
exit 1
fi
echo "hadoop_home is $hadoop_home"
if [ "$1" == "replace" ] ; then
mv -i $hadoop_home/etc/hadoop.ha $hadoop_home/etc/hadoop
echo "replace hadoop.ha >> hadoop"
else
echo "replace nothing!!!"
fi
./ssh.sh yanbin zkServer.sh_start node1 node2 node3
start-dfs.sh
start-yarn.sh
jps

