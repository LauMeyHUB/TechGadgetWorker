package io.camunda.getstarted.tutorial;

import java.util.HashMap;
import java.util.Map;

import io.camunda.zeebe.spring.client.annotation.JobWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.camunda.zeebe.client.api.response.ActivatedJob;

@SpringBootApplication
public class Worker {

  public static void main(String[] args) {
    SpringApplication.run(Worker.class, args);
  }
  
  @JobWorker(type = "orderProcess_worker")
  public Map<String, Object> orderProcess(final ActivatedJob job) {

      // Do the business logic
      System.out.println("Order process sum-up : " + job.getVariables());

      // Probably add some process variables
      HashMap<String, Object> variables = new HashMap<>();
      variables.put("resultValue1", 42);
      return variables;
  }

    @JobWorker(type = "arrangeShipment_worker")
    public Map<String, Object> arrangeShipment(final ActivatedJob job) {

        // Do the business logic
        System.out.println("Shipment Arrangement sum-up : " + job.getVariables());

        // Probably add some process variables
        HashMap<String, Object> variables = new HashMap<>();
        variables.put("resultValue1", 42);
        return variables;
    }

}
