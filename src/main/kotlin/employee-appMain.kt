
import kotlin.math.round


val x = 12
val y = 100

fun add() {

    print("Enter first name: ")
    val firstName = readLine().toString()
    print("Enter surname: ")
    val surname = readLine().toString()
    print("Enter gender (m/f): ")
    val gender = readLine()!!.toCharArray()[0]
    print("Enter employee ID: ")
    val employeeID = readLine()!!.toInt()
    print("Enter gross salary: ")
    val grossSalary = readLine()!!.toDouble()
    print("Enter PAYE %: ")
    val paye = readLine()!!.toDouble()
    print("Enter PRSI %: ")
    val prsi = readLine()!!.toDouble()
    print("Enter Annual Bonus: ")
    val Bonus= readLine()!!.toDouble()
    print("Enter Cycle to Work Deduction: ")
    val cycleToWork= readLine()!!.toDouble()

     employee = Employee(firstName,surname,gender,employeeID,grossSalary,paye,prsi,Bonus,cycleToWork)
}



fun main(args: Array<String>) {
    var input: Int
    do {

        input = menu()
        when (input) {
            1 -> {
                println("Monthly Salary: ${getMonthlySalary()}")
            }
            2 -> {
                println("Monthly PRSI:${employee.PRSI}")
            }
            3 -> {
                println("Monthly PAYE:${employee.PAYE}")
            }
            4 -> {
                println("Monthly Gross Pay: ${employee.GrossSalary}")
            }
            5 -> {
                println("Monthly Total Deductions: ${employee.CycleToWork}")
            }
            6 -> {
                println("Monthly Net Pay: ")
            }
            7 -> {
                println(employee.EmployeeID)
            }
            -1 -> {
                println("Exiting App")
            }
            else -> {
                println("Invaild Option")
            }

        }
        println()
    } while (input != -1)
}




fun menu(): Int {
    print(
        """
         Employee Menu for: ${getFullname()}
           1. Monthly Salary
           2. Monthly PRSI
           3. Monthly PAYE
           4. Monthly Gross Pay
           5. Monthly Total Deductions
           6. Monthly Net Pay
           7. Full Payslip
          -1. Exit
         Enter Option : """
    )
    return readLine()!!.toInt()
}






    fun roundTwoDecimals(number: Double) = round(number * 100) / 100

}