#!/bin/bash
myspark.sh stop
python ~/hadoop-2.6/shell/stop-hive.py
stop-yarn.sh
stop-dfs.sh
