---
layout: post
title: Final Reflection, Thoughts, and Learnings on Deployment Quiz
description: A reflection on my learnings of deployment, what I could have done, and what I did wrong. 
toc: True
---

# Reflection on Deployment Quiz Failure

Today's deployment quiz was a humbling experience that highlighted several areas for improvement in my preparation and understanding of deployment concepts. This reflection aims to dissect the mistakes made and the lessons learned, hoping to provide insights for others and myself in the future.

## Preparation Oversights

One of the first lessons learned was the importance of being prepared with all necessary tools and backups. I overlooked the need for a VPN and hotspot, which seemed trivial at the time but proved crucial when connectivity issues arose. The first 5-10 minutes of my testing time evaporated as I scrambled to borrow a hotspot from peers. This experience underscores the need for thorough preparation, ensuring all tools and backups are ready to avoid unnecessary delays.

## Technical Missteps

Adjusting ports on three necessary Docker files was another area where efficiency could have been improved. Initially, I adjusted and rebuilt each file separately, which was time-consuming. A more streamlined approach, adjusting all necessary files at once before rebuilding, would have saved valuable time. Additionally, the choice of browser impacted my efficiency; using Chrome hindered my ability to copy and paste functions easily. Switching to Firefox, although a seemingly minor change, resulted in further time loss.

## Actions I took:

The first thought that occurred to me was to ask the students who excelled in this test. I asked Rachit, Orlando, and Shivansh of why this issue was happening. I realized that maybe it was fine to restart. I deleted and reinstalled nginx and repeated the process, but this didn't work out:

<img src="{{ site.baseurl }}/images/failure2.png" alt="wrong9">

The next step was to use a different file name, but the same happened: 

<img src="{{ site.baseurl }}/images/failure1.png" alt="wrong9">


## Fundamental Misunderstandings

Beyond these logistical and technical missteps, my fundamental misunderstanding of key deployment concepts was the most significant issue. Concepts such as NGINX, deployment strategies, Route 53, and others were not as clear to me as they should have been. To address this, let's define these essential terms:

- **NGINX**: An open-source web server that also serves as a reverse proxy, load balancer, mail proxy, and HTTP cache. It's known for its high performance, stability, rich feature set, simple configuration, and low resource consumption.
- **Deployment**: The process of making a software application available for use. This can involve various stages, including development, testing, staging, and production, with the aim of delivering the application to an end-user environment.
- **Route 53**: A scalable and highly available Domain Name System (DNS) web service provided by Amazon Web Services (AWS). It connects user requests to infrastructure running in AWS, such as Amazon EC2 instances, and can also be used to route users to external websites.
- **Certbot HTTPS**: A free, open-source software tool for automatically using Let’s Encrypt certificates to enable HTTPS on websites. It simplifies the process of obtaining and renewing certificates and configuring web servers to use them.
- **Docker**: A platform as a service (PaaS) product that uses OS-level virtualization to deliver software in packages called containers. Containers are isolated from one another and bundle their own software, libraries, and configuration files; they can communicate with each other through well-defined channels.
- **AWS (Amazon Web Services)**: A subsidiary of Amazon providing on-demand cloud computing platforms and APIs to individuals, companies, and governments, on a metered pay-as-you-go basis.

## The Importance of Deployment and Related Technologies

Working with peers like Yuri, Orlando, Shivansh, and Mati, I gained a deeper understanding of the deployment process and the critical role of AWS and related technologies. Deployment is not just about making an application available; it's about ensuring that this process is efficient, scalable, and secure. Tools and services like NGINX, Certbot HTTPS, Docker, and Route 53 are essential for modern web applications. They ensure applications are accessible, performant, and secure from threats.

AWS, with its comprehensive suite of services, plays a pivotal role in deployment by offering scalable resources, global distribution, and a robust ecosystem for managing complex applications. Understanding and leveraging these tools and services is crucial for any developer looking to deploy scalable and reliable applications.

## Conclusion

#### Although the curl was working and instance showed a deployed website running through nginx, it did not show on the teacher's computer, only mine. 

Today's quiz was a stark reminder of the importance of preparation, efficiency, and, most importantly, a solid understanding of the deployment ecosystem. The lessons learned from this experience will undoubtedly shape my approach to future projects and challenges. As I continue to delve deeper into these concepts, I hope to share my journey and insights, contributing to the broader community of learners and developers.

