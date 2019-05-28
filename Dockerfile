FROM xiancloud/alpine-jre8:1.0
RUN mkdir -p /data/workspace
COPY build/libs/ /data/workspace/
