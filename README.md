# FetchRewardsApplication
Instructions to Run the Application
Prerequisites
Docker: Assuming the docker is installed in your machine.

Steps:
Clone the Repository:
git clone https://github.com/mgampa30/FetchRewardsApplication.git
Navigate to the project directory:
cd FetchRewardsApplication

Run the Docker build command:
docker build -t fetch-rewards-app .
This will build the Docker image for the application.

Run the application in a Docker container:
docker run -d -p 8080:8080 fetch-rewards-app

This command will start the application in a Docker container and it will be accessible at http://localhost:8080

To stop the application, use:
docker ps  # Get the container ID
docker stop <container_id>






