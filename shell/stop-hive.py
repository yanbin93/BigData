#!/bin/usr/env python
# -*- coding:utf-8 -*-
import os
runjar=filter(lambda x:x.split(' ')[-1]=='RunJar\n',os.popen('jps').readlines())
jps=[int(x.split(" ")[0]) for x in runjar]
for i in  jps:
	os.popen('kill -9 '+ str(i))
	print "killed RunJar",i
