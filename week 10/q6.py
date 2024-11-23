'''Consider two files that contain information about Employees and Departments in the
following parameters: Employee (Name, EId, Salary, DID), Department (DID,
DName, DLocation). Write a Python program to merge the content of both the file in
following format.: Emp_Dep(Ename, Eid, Esalary, EDID, DName,Dlocation) (Note:
Merging should follow the condition-DID of Employee file should be equal to
Department ID of department file)'''



import csv

def merge_employee_department(emp_file, dept_file, output_file):
    employees = {}
    with open(emp_file, mode='r') as emp_f:
        emp_reader = csv.DictReader(emp_f)
        for row in emp_reader:
            employees[row['DID']] = row

    merged_data = []
    with open(dept_file, mode='r') as dept_f:
        dept_reader = csv.DictReader(dept_f)
        for row in dept_reader:
            did = row['DID']
            if did in employees:
                emp_info = employees[did]
                merged_record = {
                    'Ename': emp_info['Name'],
                    'Eid': emp_info['EId'],
                    'Esalary': emp_info['Salary'],
                    'EDID': emp_info['DID'],
                    'DName': row['DName'],
                    'DLocation': row['DLocation']
                }
                merged_data.append(merged_record)

    with open(output_file, mode='w', newline='') as out_f:
        fieldnames = ['Ename', 'Eid', 'Esalary', 'EDID', 'DName', 'DLocation']
        writer = csv.DictWriter(out_f, fieldnames=fieldnames)
        
        writer.writeheader()
        for record in merged_data:
            writer.writerow(record)

    print(f'Merged data written to {output_file}')

emp_file = 'employees.csv'  
dept_file = 'departments.csv' 
output_file = 'merged_emp_dept.csv' 
merge_employee_department(emp_file, dept_file, output_file)








