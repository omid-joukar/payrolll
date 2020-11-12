# Build
mvn clean package && docker build -t com.pedantic/payroll .

# RUN

docker rm -f payroll || true && docker run -d -p 8080:8080 -p 4848:4848 --name payroll com.pedantic/payroll 