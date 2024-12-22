# DL2

Deep Learning Learning Platform

![Should be a system framework illustration](framework.png)

## Local Deployment

### System Requirements

1. MySQL or MariaDB w./ schema `dl2`, on `localhost:3306`: `systemctl enable --now mysqld`
2. Neo4j on `localhost:7474`: `<NEO4J_HOME>/bin/neo4j restart`

### Basic Services

1. User & paper service on `localhost:8080`: `cd UserService;./gradlew run`
2. Neo4j graph service on `localhost:8081`: `cd Neo4jService;./gradlew run`
3. Frontend service on `localhost:4200`: `cd frontend;ng serve`

### Intelligent Services

1. Vectorized search service w./ weaviate on Docker: `sudo docker run -d -p 8090:8090 -p 50051:50051 dl2-vectorized;cd SearchLambda;python serve_test.py`
2. Gemini-based GraphRAG: `cd DataAnalysis/llm;python graph_rag.py`
3. GAT-based paper recommendation: `cd DataAnalysis;python gat_pred.py`

### Crawler Services

1. Initialization w./ renowned PapersWithCode methods and tasks: `cd CrawlerService;npm run init`
2. Expand the graph w./ Neo4j uncharted papers, exported as CSVs: `npm run import`
3. Daily routine crawling w./ subscription to ArXiV: `npm run subscribe` 

