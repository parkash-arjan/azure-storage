package com.ilab.azure.azurestorage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureStorageApplication {

    @Value("${azure.keyvault.client-id}")
    private String clientid;
    @Value("${azure.keyvault.client-key}")
    private String clientKey;
    @Value("${azure.keyvault.enabled}")
    private String isKeyEnabled;
    @Value("${azure.keyvault.tenant-id}")
    private String tenantId;
    @Value("${azure.keyvault.uri}")
    private String keyvaultUri;

    @Value("${connectionString}")
    private String connectionString;

    public static void main(String[] args) {
        SpringApplication.run(AzureStorageApplication.class, args);
    }


    @GetMapping("get")
    public String get() {
        return connectionString;
    }

    public void run(String... varl) throws Exception {

        System.out.println(String.format("\nConnection String stored in Azure Key Vault:\n%s\n", connectionString));
    }
}