#!/bin/bash
read -p "输入singal完成伪分布模式部署/输入cluster进行ha完全分布式部！ " which
if      [ "$which"x != "singal"x ]&&[ "$which"x != "cluster"x ]   ; then
read -p "输入singal完成伪分布模式部署/输入cluster进行ha完全分布式部！ " which
if      [ "$which"x != "singal"x ]&&[ "$which"x != "cluster"x ]   ; then
exit 1
fi
fi
case $which in
"singal")
read -p "即将开始伪分布式部署......输入yes确认" sure
if 	[ "$sure"x == "yes"x ]  ; then
./to_singal.sh
else
exit 1
fi
;;
"cluster")
read  -p "即将开始ha完全分布式部署......输入yes确认" sure1
if ["$sure1"x == "yes"x] ; then
./to_cluster.sh
else
exit 1
fi
;;
esac

