
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





var employee = Employee("Clinton","Bempah",'m',6143,67543.21,38.5,5.2, 1450.50,54.33)
fun getFullname() = when (employee.Gender ) {
    'm', 'M' -> "Mr.${employee.firstName}  ${employee.Surname}"
    'f', 'F' -> "Ms. ${employee.firstName}  ${employee.Surname}"
    else -> "${employee.firstName}  ${employee.Surname}"
}


fun getMonthlySalary() = {
    employee.GrossSalary / x
    fun getMonthlyPRSI() = employee.GrossSalary / x / y * employee.PRSI
    fun getMonthlyPAYE() = employee.GrossSalary / x * (employee.PAYE / y)
    fun getGrossMonntlyPay() = employee.GrossSalary / x + employee.Bonus / x
    fun getTotalMonthlyDeductions() = round(employee.PAYE + employee.PRSI + employee.CycleToWork)
    fun getNetMonthlyPay() = employee.GrossSalary - employee.CycleToWork

    fun getPayslip() {

        println("\n----------------------------------------------------------------")
        println("                     Monthly Payslip")
        println("\n-----------------------------------------------------------------")
        println("\tEmployee Name:  ${employee.firstName.uppercase()}  ${employee.Surname.uppercase()} (${employee.Gender.uppercase()})      Employee ID: ${employee.EmployeeID}")
        println("\n-----------------------------------------------------------------")
        println("\tPAYMENT DETAILS       DEDUCTION TOTALS")
        println("\n----------------------------------------------------------------")
        println("  \tSalary :" + round(employee.GrossSalary / x))
        println("\tBonus: ${round(employee.Bonus / x)}")
        println("                                    \tPAYE : " + round(employee.PAYE))
        println("                                      \tPRSI : " + round(employee.PRSI))
        println("                                     \tCycle To Work: ${employee.CycleToWork}")
        println("\n----------------------------------------------------------------")
        println("\t Gross: " + round(employee.GrossSalary) + "\t Total Deduction:" + round(employee.CycleToWork))
        println("\n----------------------------------------------------------------")

    }

    fun roundTwoDecimals(number: Double) = round(number * 100) / 100

}