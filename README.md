# Google Cloud Demo

## Create project

https://console.cloud.google.com/

## Create .jar

Add build plugin into maven.

```
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-jar-plugin</artifactId>
    <version>3.2.0</version>
</plugin>
```

Execute maven command

```
mvn clean package
```

## Configurate billing account

https://console.cloud.google.com/billing

## Enable Cloud Build API Plugin en

https://console.cloud.google.com/apis/api/cloudbuild.googleapis.com

### - Prices (27/05/2023)

FREE First 0-120 minutes of build of day

0.002706899€ latest +120 minutes of build of day

## Install CLI gcloud

[Download gcloud](https://cloud.google.com/sdk/docs/install?hl=es-419)

```
gcloud init
```

Link your local project to Google Cloud project and deploy

```
gcloud config set project <project-name>
gcloud app deploy <dir-jar>
```

Example

```
gcloud config set project matiesmengo-demo
gcloud app deploy target/googlecloud-0.0.1-SNAPSHOT.jar
```

After deployment, you will be able to use the link to use your server.

## Testing the application

Local

```
http://localhost:8080/translate/ca?text=hello%20world
```

Cloud

```
https://matiesmengo-demo.lm.r.appspot.com/translate/ca?text=hello%20world
```

## Google Cloud services using after deploy:

### Google Cloud Build:

Google Cloud Build es el servicio principal que estás utilizando. Permite automatizar y gestionar la construcción,
prueba y despliegue de tus aplicaciones en Google Cloud.

### Google Cloud Storage:

Google Cloud Storage se utiliza para almacenar los archivos y recursos necesarios para la construcción y despliegue de
tu proyecto. Esto puede incluir archivos de código fuente, configuraciones de construcción, dependencias, archivos de
configuración, etc.

### Google Container Registry:

Si estás construyendo y desplegando imágenes de contenedor, es probable que Google Container Registry se utilice para
almacenar y administrar esas imágenes de contenedor.

### Google Cloud IAM

Google Cloud Identity and Access Management (IAM) se utiliza para gestionar los permisos y roles asociados con el
proyecto y los recursos utilizados en Google Cloud Build.

### Google Cloud Pub/Sub

Google Cloud Pub/Sub puede utilizarse para configurar notificaciones y desencadenar acciones específicas en respuesta a
eventos relacionados con la construcción y despliegue de tu proyecto.

### Google Cloud Logging

Te permite ver y analizar los registros generados durante el proceso de construcción y despliegue de tu proyecto.

You could see your logs  [here](https://console.cloud.google.com/logs)
