import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Employee } from './employee';

@Injectable({
  providedIn: 'root'
})

export class EmployeeService {

  // From localhost:4200 ---> localhost:8080 ===> grab employeeDetails
  private baseURL="http://localhost:8080/api/v1/employees"

  constructor(private httpClient: HttpClient) { }

  getEmployeesList(): Observable<Employee[]>{
    return this.httpClient.get<Employee[]>(`${this.baseURL}`);
  }
  //Create/add Employee
  createEmployee(employee:Employee):Observable<Object>{
    return this.httpClient.post(`${this.baseURL}`, employee);
  }
  getEmployeeById(id:number):Observable<Employee>{
    return this.httpClient.get<Employee>(`${this.baseURL}/${id}`)
  }
  updateEmployee(id:number):Observable<Employee>{
    return this.httpClient.put<Employee>(`${this.baseURL}/${id}`, Employee);
  }
}
