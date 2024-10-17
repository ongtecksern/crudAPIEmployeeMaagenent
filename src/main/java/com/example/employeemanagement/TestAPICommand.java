//List all employees
//===================
//curl -X GET http://localhost:8080/api/employees
//
//
//List specify employee with id
//================================
//curl -X GET http://localhost:8080/api/employees/1
//
//
//Create new employee
//======================
//curl -X POST http://localhost:8080/api/employees \
//-H "Content-Type: application/json" \
//-d '{
//      "name": "John Doe",
//      "department": "HR",
//      "salary": 50000
//    }'
//
//Update existing employee
//=============================
//curl -X PUT http://localhost:8080/api/employees/1 \
//-H "Content-Type: application/json" \
//-d '{
//      "name": "Jane Doe",
//      "department": "IT",
//      "salary": 60000
//    }'
//
//
//Delete existing employee
//=========================
//curl -X DELETE http://localhost:8080/api/employees/1
//

