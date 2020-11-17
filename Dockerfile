#指定基础镜像，在其上进行定制
FROM java:8
#FROM harbor.cn/base/java:8
#这里的 /tmp 目录就会在运行时自动挂载为匿名卷，任何向 /tmp 中写入的信息都不会记录进容器存储层
#VOLUME /tmp
#VOLUME /log
# 将工作目录切换为/pl-app-busi
#WORKDIR /pl-app-busi

#设置时区
RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
RUN echo 'Asia/Shanghai' >/etc/timezone


#复制上下文目录下的target/demo-1.0.0.jar 到容器里
#COPY target/*.jar app.jar
#COPY target/bin/start.sh start.sh
#RUN chmod 775 /start.sh

#ENV LANG zh_CN.UTF-8
#bash方式执行，使netty-test.jar可访问
#RUN新建立一层，在其上执行这些命令，执行结束后， commit 这一层的修改，构成新的镜像。
#RUN bash -c "touch /app.jar"

EXPOSE 9001
#指定容器启动程序及参数   <ENTRYPOINT> "<CMD>"
#ENTRYPOINT ["java","-Dfile.encoding=utf-8","-jar","pl-app-busi.jar"]
ENTRYPOINT ["java","-jar","demo-0.0.1-SNAPSHOT.jar","com.example.demo.DemoApplication"]
#CMD ["/start.sh"]