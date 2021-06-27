FROM alpine:3.14.0
COPY . /producer
RUN apk update && apk add \
	&& apk add openjdk11 \
	&& apk add maven