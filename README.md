# Fetch Rewards Application

This application processes receipts and calculates points based on specific criteria. It provides RESTful endpoints for receipt processing and points retrieval.


Note: We can use Lombok for the model class to reduce boilerplate code; however, I've been encountering issues with this in my Eclipse setup.

## Running the Application with Docker

Follow these instructions to clone the repository and run the application using Docker.

### Prerequisites

- **Docker:** Ensure that Docker is installed on your machine.

### Steps

1. **Clone the Repository:**

    ```bash
    git clone https://github.com/mgampa30/FetchRewardsApplication.git
    cd FetchRewardsApplication
    ```

    This will clone the repository and navigate to the project directory.

2. **Build the Docker Image:**

    Run the Docker build command to build the Docker image for the application:

    ```bash
    docker build -t fetch-rewards-app .
    ```

3. **Run the Docker Container:**

    Start the application in a Docker container:

    ```bash
    docker run -d -p 8080:8080 fetch-rewards-app
    ```

    The application will be accessible at [http://localhost:8080](http://localhost:8080).

4. **Stopping the Application:**

    To stop the application, use the following commands:

    ```bash
    docker ps  # Get the container ID
    docker stop <container_id>
    ```

    Replace `<container_id>` with the actual container ID.

## Accessing the Application

Open a web browser or use tools like cURL or Postman to access the application at [http://localhost:8080](http://localhost:8080).
