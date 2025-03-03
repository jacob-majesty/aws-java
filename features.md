* AWS Books: https://drive.google.com/drive/folders/19D5Uoafi9hmAy6E3ivAN7rR0vbg4_SN3
* AWS CLI Command Reference: https://docs.aws.amazon.com/cli/latest/#

---

I - **Amazon EC2 (Elastic Compute Cloud)** is a core service provided by **Amazon Web Services (AWS)** that allows you to launch and manage **virtual servers** (called instances) in the cloud. It provides resizable compute capacity, meaning you can easily scale up or down based on your application's needs.

### Key Features of EC2:
1. **Virtual Servers**: Run Linux, Windows, or other operating systems on virtual machines.
2. **Scalability**: Easily add or remove instances to handle changes in workload.
3. **Flexibility**: Choose from a wide range of instance types optimized for compute, memory, storage, or GPU workloads.
4. **Pay-as-you-go**: Pay only for the compute time you use.
5. **Security**: Control access using security groups and key pairs.

### Practical Use Cases:
- Hosting web applications or backend services.
- Running batch processing or data analysis jobs.
- Deploying development or testing environments.

### Example for Java Developers:
You can deploy a **Java Spring Boot application** on an EC2 instance by:
1. Launching an EC2 instance.
2. Installing Java and Maven.
3. Cloning your Spring Boot project.
4. Building and running the app with `mvn spring-boot:run`.

EC2 is a foundational AWS service that provides the compute power needed to run your Java applications in the cloud. 🌐💻
Commit

---


---

II - Amazon S3 (Simple Storage Service) is a cloud storage service provided by Amazon Web Services (AWS). It allows users to store and retrieve any amount of data from anywhere on the internet. S3 is designed to be highly scalable, secure, and durable, making it suitable for a wide range of applications, including data backup, archival, big data analytics, and content distribution.

### Key Features of Amazon S3:
1. **Scalability**: S3 can store an unlimited amount of data, scaling automatically to meet your storage needs.
2. **Durability**: S3 is designed for 99.999999999% (11 nines) durability, meaning your data is highly protected against loss.
3. **Availability**: S3 offers high availability, with a service level agreement (SLA) for 99.99% availability.
4. **Security**: S3 provides robust security features, including encryption, access control policies, and integration with AWS Identity and Access Management (IAM).
5. **Data Management**: S3 offers features like versioning, lifecycle policies, and cross-region replication to help manage your data effectively.
6. **Performance**: S3 supports various storage classes optimized for different use cases, such as frequent access, infrequent access, and archival storage.

### Common Use Cases:
- **Data Backup and Recovery**: S3 is often used for backing up critical data and disaster recovery.
- **Static Website Hosting**: S3 can host static websites, serving HTML, CSS, and JavaScript files.
- **Big Data Analytics**: S3 is commonly used as a data lake for storing and analyzing large datasets.
- **Content Distribution**: S3 integrates with Amazon CloudFront to distribute content globally with low latency.
- **Data Archiving**: S3 Glacier and S3 Glacier Deep Archive are cost-effective options for long-term data archiving.

### Storage Classes:
- **S3 Standard**: For frequently accessed data.
- **S3 Intelligent-Tiering**: Automatically moves data to the most cost-effective tier based on access patterns.
- **S3 Standard-IA (Infrequent Access)**: For data that is accessed less frequently but requires rapid access when needed.
- **S3 One Zone-IA**: For infrequently accessed data that doesn't require multiple Availability Zone resilience.
- **S3 Glacier**: For long-term archival with retrieval times ranging from minutes to hours.
- **S3 Glacier Deep Archive**: For archival data that is rarely accessed, with retrieval times of 12 hours or more.

Amazon S3 is a foundational service in the AWS ecosystem and is widely used by businesses of all sizes for various storage needs.

---

**AWS Identity and Access Management (IAM)** is a web service provided by Amazon Web Services (AWS) that helps you securely control access to AWS resources. IAM allows you to manage users, security credentials (like access keys), and permissions that control which AWS resources users and applications can access.

### Key Features of AWS IAM:
1. **Users and Groups:**
   - Create and manage **IAM users** (individuals or applications that interact with AWS).
   - Organize users into **IAM groups** to assign permissions to multiple users at once.

2. **Permissions and Policies:**
   - Define **permissions** using JSON-based policies that specify what actions are allowed or denied on which AWS resources.
   - Policies can be attached to users, groups, or roles.

3. **Roles:**
   - Create **IAM roles** to delegate access to AWS services or resources without sharing long-term credentials.
   - Roles are often used by applications, AWS services, or federated users.

4. **Multi-Factor Authentication (MFA):**
   - Add an extra layer of security by requiring users to provide a second form of authentication (e.g., a code from a mobile device) in addition to their password.

5. **Access Keys and Credentials:**
   - Generate **access keys** (access key ID and secret access key) for programmatic access to AWS services.
   - Rotate credentials regularly for enhanced security.

6. **Federated Access:**
   - Allow users to sign in to AWS using existing identities (e.g., corporate directories or third-party identity providers like Google, Facebook, or Microsoft Active Directory).

7. **Fine-Grained Access Control:**
   - Define precise permissions for specific AWS services, resources, and actions (e.g., allowing a user to read files in an S3 bucket but not delete them).

8. **Auditing and Monitoring:**
   - Use **AWS CloudTrail** to log and monitor IAM actions for security and compliance purposes.

### Common Use Cases for IAM:
- Granting employees access to AWS resources based on their job roles.
- Allowing applications running on EC2 instances to access other AWS services securely.
- Enabling third-party vendors to access specific AWS resources without sharing your AWS account credentials.
- Implementing least privilege access to minimize security risks.

### Example IAM Policy:
Here’s an example of an IAM policy that allows a user to read objects in a specific S3 bucket:

```json
{
  "Version": "2012-10-17",
  "Statement": [
    {
      "Effect": "Allow",
      "Action": "s3:GetObject",
      "Resource": "arn:aws:s3:::example-bucket/*"
    }
  ]
}
```

### Best Practices for IAM:
1. **Use the Principle of Least Privilege:** Only grant the permissions necessary to perform a task.
2. **Enable MFA for Root and IAM Users:** Protect your AWS account with multi-factor authentication.
3. **Rotate Credentials Regularly:** Periodically change access keys and passwords.
4. **Monitor IAM Activity:** Use AWS CloudTrail to track changes and access to your IAM resources.
5. **Avoid Using the Root Account:** Use IAM users and roles instead of the root account for day-to-day tasks.

IAM is a foundational service for AWS security and is essential for managing access to your cloud resources effectively.
