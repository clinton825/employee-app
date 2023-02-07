var lastId = 0
internal fun getId(): Int {

    return lastId++
}

class EmployeeAPI {
    private val employees = ArrayList<Employee>()

    fun findAll() : List<Employee>{
        return employees
    }

    fun findOne(id:Int): Employee? {
        return employees.find { p -> p.EmployeeID == id }
    }

    fun create(employee: Employee){
        employee.EmployeeID = getId()
        employees.add(employee)

    }

}