exahmple command:
```bash
podman run --name proxy --replace --network passchecker-net -e "PROXY_SERVERS=passchecker-backend1:8080,passchecker-backend2:8081" -dt -p 8083:8083/tcp localhost/reverse-proxy-java:latest

```
