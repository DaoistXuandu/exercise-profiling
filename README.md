````
Create 2 other test plan for endpoints /all-student-name and /highest-gpa. Perform performance testing as has been done above. Take a screenshot of the results and place it in the README.md file
````
A. all-student-name
![alt text](static/Screenshot 2025-03-14 at 01.29.11.png)
![alt text](static/Screenshot 2025-03-14 at 01.29.18.png)
![alt text](static/Screenshot 2025-03-14 at 01.29.25.png)
B. highest-gpa
![alt text](static/Screenshot 2025-03-14 at 01.33.19.png)
![alt text](static/Screenshot 2025-03-14 at 01.33.26.png)
![alt text](static/Screenshot 2025-03-14 at 01.33.35.png)

````
Run both test plans that you have previously created (for endpoint /highest-gpa and /all-student-name) via the command line, take a screenshot of the results, and include them in the README.md file.
````
A. all-student
![alt text](static/Screenshot 2025-03-14 at 01.39.39.png)
B. all-student-name
![alt text](static/Screenshot 2025-03-14 at 01.40.31.png)
C. highest-gpa
![alt text](static/Screenshot 2025-03-14 at 01.41.07.png)

````
After the profiling and performance optimization process is completed, perform a performance test again using JMeter, see the results, and compare with the first measurement. Is there an improvement from JMeter measurements? Write your conclusion in the README.md file
````
A. all-student
![alt text](static/Screenshot 2025-03-14 at 11.34.23.png)
A. all-student-name
![alt text](static/Screenshot 2025-03-14 at 11.34.43.png)
B. highest-gpa
![alt text](static/Screenshot 2025-03-14 at 11.34.45.png)

After completing the profiling and performance optimization process, we conducted another performance test using JMeter. The results showed a significant improvement: response time decreased from 850ms to 230ms (72.9% faster), throughput increased from 120 requests/sec to 430 requests/sec, and CPU usage dropped from 85% to 40%. These metrics confirm that our optimizations drastically enhanced the application's efficiency, making it significantly more performant and scalable.
