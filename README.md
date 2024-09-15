# CirclePe
-->About
   Its an Intergalaxy trade system.

-->Project Overview
The project requirments was to design and implement a backend system for an intergalactic trade network which will handle trade transactions, manage space cargo, and track space station inventory. 
The system needs to handle high throughput data and provide real-time updates on trade activities across multiple planets and space stations.

-->Project approach
* I've built two tables named transaction_tabel and shipment_tabel and associated the tables with trigger. In which i declared if the payment is done in transaction_tabel then it will provide 
   transaction_ID which will reflect shipment_status.
* Added some dependencies with the help of Spring Initializer.
* Database used (MySQL).
  
