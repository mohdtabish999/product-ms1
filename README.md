"# product-ms1" 
docker build -t mohdtabish999/product-ms1:1.0 . <br/>
docker run -p 8080:8080 mohdtabish999/product-ms1 <br/>
docker exec -it <containerid> sh <br/>
go to browser https://localhost:8080 <br/>

In openshift change service target port 
OR
change pod, deployment, service, router object port in yaml 
