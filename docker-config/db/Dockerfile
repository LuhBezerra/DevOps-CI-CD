FROM mysql:5.7

RUN printf ${MYSQL_PASSWORD} | docker secret create db_password -
RUN printf ${MYSQL_ROOT_PASSWORD} | docker secret create db_root_password -