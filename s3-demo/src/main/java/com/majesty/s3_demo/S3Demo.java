package com.majesty.s3_demo;

import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.GetObjectRequest;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;

import java.nio.file.Path;


public class S3Demo {

	private static final String BUCKET = "majesty-bucket";

	public static void main(String[] args) {

		try (var client = S3Client.builder().region(Region.US_EAST_2).build()) {
			//write
			var putRequest = PutObjectRequest.builder()
					.bucket(BUCKET)
					.key("public/hello.txt")
					.build();
			client.putObject(putRequest, Path.of("hello.txt"));

			//read
			var getRequest = GetObjectRequest.builder()
					.bucket(BUCKET)
					.key("public/hello.txt")
					.build();
			client.getObject(getRequest, Path.of("hello.txt"));

		}

	}

}
