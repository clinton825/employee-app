
import kotlin.math.round


val x = 12
val y = 100



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
                println("Monthly Total Deductions: ${employee.TotalDeduction}")
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

var employee = Employee("Clinton","Bempah",'m',6143,67543.21,38.5,5.2, 1450.50,54.33, 657.50)
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
    fun getNetMonthlyPay() = employee.GrossSalary - employee.TotalDeduction

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
        println("\t Gross: " + round(employee.GrossSalary) + "\t Total Deduction:" + round(employee.TotalDeduction))
        println("\n----------------------------------------------------------------")

    }

    fun roundTwoDecimals(number: Double) = round(number * 100) / 100

}