# Tutorial
````
Create 2 other test plan for endpoints /all-student-name and /highest-gpa. Perform performance testing as has been done above. Take a screenshot of the results and place it in the README.md file
````
A. all-student-name
![alt text](static/image_1.png)
![alt text](static/image_2.png)
![alt text](static/image_3.png)
B. highest-gpa
![alt text](static/image_4.png)
![alt text](static/image_5.png)
![alt text](static/image_6.png)

````
Run both test plans that you have previously created (for endpoint /highest-gpa and /all-student-name) via the command line, take a screenshot of the results, and include them in the README.md file.
````
A. all-student
![alt text](static/image_7.png)
B. all-student-name
![alt text](static/image_8.png)
C. highest-gpa
![alt text](static/image_9.png)

````
After the profiling and performance optimization process is completed, perform a performance test again using JMeter, see the results, and compare with the first measurement. Is there an improvement from JMeter measurements? Write your conclusion in the README.md file
````
A. all-student
![alt text](static/image_10.png)
B. all-student-name
![alt text](static/image_11.png)
C. highest-gpa
![alt text](static/image_12.png)

After completing the profiling and performance optimization process, we conducted another performance test using JMeter. The results showed a significant improvement: response time decreased for every all-student, all-student-name and highest-gpa and throughput increased for every all-student, all-student-name and highest-gpa. These metrics confirm that our optimizations drastically enhanced the application's efficiency, making it significantly more performant and scalable.

# Reflection
````
1. What is the difference between the approach of performance testing with JMeter and profiling with IntelliJ Profiler in the context of optimizing application performance?
````

Performance testing with JMeter focuses on evaluating the overall system behavior under different load conditions. It simulates multiple users making requests to the application, measuring key performance metrics like response time, throughput, and resource utilization. This approach helps identify bottlenecks at a high level, such as slow API responses, database latency, or server capacity limits. JMeter is essential for assessing scalability and stability by applying real-world load scenarios, making it ideal for testing optimizations' effectiveness after code changes.

On the other hand, profiling with IntelliJ Profiler is a more in-depth, code-level analysis aimed at understanding how the application executes and utilizes system resources. It provides detailed insights into CPU usage, memory consumption, method execution time, and thread behavior. By identifying inefficient algorithms, memory leaks, and unnecessary computations, developers can optimize critical code sections before testing with JMeter. Profiling helps pinpoint exact performance issues at the code level, while JMeter ensures that the overall system improvements translate to better user experience under real-world conditions.

````
2. How does the profiling process help you in identifying and understanding the weak points in your application?
````
During this development, profiling providing me a general knowledge about how resource actually used or spend during user interaction. So i could analyze and see where actually my application malfunction or where i need to actually refactor for any given user interaction.

````
3. Do you think IntelliJ Profiler is effective in assisting you to analyze and identify bottlenecks in your application code?
````
Yes, IntelliJ Profiler is highly effective in analyzing and identifying bottlenecks in application code. It provides deep insights into CPU and memory usage, method execution times, and thread activity, allowing developers to pinpoint inefficient code sections, memory leaks, or performance-heavy operations. With real-time profiling and visual reports, it helps in understanding which parts of the code consume the most resources, making optimization more precise. By leveraging IntelliJ Profiler, developers can proactively resolve bottlenecks before conducting broader performance tests with tools like JMeter, ensuring a more efficient and scalable application.

````
4. What are the main challenges you face when conducting performance testing and profiling, and how do you overcome these challenges?
````
A key challenge in performance testing and profiling is the time required to complete the tests, especially when dealing with a large number of interactions or complex workflows. Running extensive load tests with JMeter or profiling an application with IntelliJ can be time-consuming, as they require sufficient execution time to gather meaningful data. To overcome this, we can optimize the testing process by running tests in parallel, using representative but smaller datasets for initial testing, and focusing on high-impact areas first. Additionally, automating test execution and profiling in a CI/CD pipeline can help reduce manual effort and ensure continuous performance monitoring.

````
5. What are the main benefits you gain from using IntelliJ Profiler for profiling your application code?
````
IntelliJ Profiler provides several key benefits for profiling application code, including detailed insights into CPU usage, memory consumption, and method execution times. It helps identify performance bottlenecks, such as inefficient algorithms, memory leaks, or expensive operations, allowing developers to optimize code more effectively. The real-time visualization and intuitive reports make it easier to understand application behavior and pinpoint issues quickly. Additionally, its seamless integration with IntelliJ IDEA enhances the debugging and optimization process, making performance tuning more efficient and improving overall application responsiveness and scalability.

````
6. How do you handle situations where the results from profiling with IntelliJ Profiler are not entirely consistent with findings from performance testing using JMeter?
````
When profiling results from IntelliJ Profiler do not align with performance testing findings from JMeter, the first step is to analyze the differences in testing conditions. JMeter simulates real-world user interactions under various loads, while IntelliJ Profiler focuses on code execution and resource usage in a more controlled environment. To reconcile discrepancies, I verify if the profiling tests were conducted under similar load conditions as JMeter and check for environmental differences such as hardware constraints or background processes.
If inconsistencies persist, I cross-check the bottlenecks identified by both tools, looking for hidden issues such as database slowdowns, network latency, or garbage collection overhead that may not be fully captured in one tool alone. Additionally, I use logs, monitoring tools, and additional profiling runs with different scenarios to pinpoint the root cause. By combining insights from both JMeter and IntelliJ Profiler, I ensure a more comprehensive performance optimization process.

````
7. What strategies do you implement in optimizing application code after analyzing results from performance testing and profiling? How do you ensure the changes you make do not affect the application's functionality?
````
My optimization strategy involves simplifying the program structure, analyzing the source code, and refactoring inefficient logic based on profiling and performance testing results. By reducing unnecessary computations, optimizing database queries, and improving algorithm efficiency, I ensure that the application runs faster and consumes fewer resources. Additionally, I conduct thorough testing after each optimization, including unit tests, integration tests, and regression tests, to verify that the changes do not alter the application's functionality. Automated tests and benchmarking tools also help confirm that performance gains are achieved without introducing new issues.

