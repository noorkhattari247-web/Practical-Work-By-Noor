| Method | URL | Params | Response | Status |
|----------|----------|----------|----------|----------|
| GET | /api/students | name,email,max,offset | Student List | 200 |
| GET | /api/students/{id} | id | Student | 200,404 |
| POST | /api/students | JSON Body | Student | 201,400 |
| PUT | /api/students/{id} | JSON Body | Updated Student | 200 |
| DELETE | /api/students/{id} | id | No Content | 204 |
| GET | /api/students/{id}/gpa | id | GPA | 200,404 |
