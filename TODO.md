proxy endpoints:
 "/": return the static build page(f.e.: vite build frontnend).
 "/api": redirect to server1 or server2

setup:
 config.yaml data on server endpoints (pods?) => where to redirect ahd what.
 X-forwardedfrom: ip of proxy
