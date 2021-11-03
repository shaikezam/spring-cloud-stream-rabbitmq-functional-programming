#### Docker ####

Create rabbitmq container:

* `docker run -d -p 5672:5672 -p 15672:15672 --name my-rabbit rabbitmq:3-management`

Stop All Containers

* `docker stop $(docker ps -aq)`

Delete All Containers

* `docker rm $(docker ps -aq)`

Delete All Images

* `docker rmi $(docker images -q)`