```shell
docker pull fronted-cn-beijing.cr.volces.com/container/apache/eventmesh:v1.11.0
docker run -d --name eventmesh \
  -p 10000:10000 \
  -p 10105:10105 \
  -p 10205:10205 \
  -p 10106:10106 \
  --link rmqnamesrv:namesrv -t \
  -v `pwd`/eventmesh.properties:/data/app/eventmesh/conf/eventmesh.properties \
  -v `pwd`/rocketmq-client.properties:/data/app/eventmesh/conf/rocketmq-client.properties \
  fronted-cn-beijing.cr.volces.com/container/apache/eventmesh:v1.11.0



docker pull fronted-cn-beijing.cr.volces.com/container/apache/rocketmq:4.9.4


docker run -d -p 9876:9876 \
  -v `pwd`/data/namesrv/logs:/root/logs \
  -v `pwd`/data/namesrv/store:/root/store \
  --name rmqnamesrv \
  fronted-cn-beijing.cr.volces.com/container/apache/rocketmq:4.9.4 \
  sh mqnamesrv
  
docker run -d -p 10911:10911 -p 10909:10909 \
  -v `pwd`/data/broker/logs:/root/logs \
  -v `pwd`/data/broker/store:/root/store \
  --name rmqbroker \
  --link rmqnamesrv:namesrv \
  -e "NAMESRV_ADDR=namesrv:9876" \
  fronted-cn-beijing.cr.volces.com/container/apache/rocketmq:4.9.4 \
  sh mqbroker -c ../conf/broker.conf
  
docker run -d --name rocketmq-dashboard -e "JAVA_OPTS=-Drocketmq.namesrv.addr=rmqnamesrv:9876" --link rmqnamesrv:namesrv  -p 8080:8080 -t fronted-cn-beijing.cr.volces.com/container/apacherocketmq/rocketmq-dashboard:1.0.0

```