FROM nginx:alpine

RUN echo "<h1>Hello world!</h1>" > /etc/nginx/index.html;
RUN apk add openssl
RUN openssl req -x509 -nodes \
   -days 365 \
   -subj "/C=CA/ST=QC/O=Company, Inc./CN=mydomain.com" \
   -addext "subjectAltName=DNS:mydomain.com" \
   -newkey rsa:2048 \
   -keyout /etc/ssl/private/nginx-selfsigned.key \
   -out /etc/ssl/certs/nginx-selfsigned.crt;

COPY nginx.conf /etc/nginx/conf.d/nginx.conf