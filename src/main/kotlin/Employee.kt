import kotlin.math.round

class Employee(
    var firstName: String, var Surname: String, var Gender: Char, var EmployeeID: Int,
    var GrossSalary: Double, var PAYE: Double, var PRSI: Double, var Bonus: Double, var CycleToWork : Double,
) {

    fun getFullname() = when (Gender) {
        'm', 'M' -> "Mr.${firstName}  ${Surname}"
        'f', 'F' -> "Ms. ${firstName}  ${Surname}"
        else -> "${firstName}  ${Surname}"
    }


    fun getMonthlySalary() = (GrossSalary / x)
    fun getMonthlyPRSI() = (GrossSalary / x / y * PRSI)
    fun getMonthlyPAYE() = GrossSalary / x * (PAYE / y)
    fun getGrossMonntlyPay() = GrossSalary / x + Bonus / x
    fun getTotalMonthlyDeductions() = round(PAYE + PRSI + CycleToWork)
    fun getNetMonthlyPay() = GrossSalary - CycleToWork

    fun getPayslip() {

        println("\n----------------------------------------------------------------")
        println("                     Monthly Payslip")
        println("\n-----------------------------------------------------------------")
        println("\tEmployee Name:  ${firstName.uppercase()}  $Surname.uppercase()} (${Gender.uppercase()})      Employee ID: ${EmployeeID}")
        println("\n-----------------------------------------------------------------")
        println("\tPAYMENT DETAILS       DEDUCTION TOTALS")
        println("\n----------------------------------------------------------------")
        println("  \tSalary :" + round(GrossSalary / x))
        println("\tBonus: ${round(Bonus / x)}")
        println("                                    \tPAYE : " + round(PAYE))
        println("                                      \tPRSI : " + round(PRSI))
        println("                                     \tCycle To Work: ${CycleToWork}")
        println("\n----------------------------------------------------------------")
        println("\t Gross: " + round(GrossSalary) + "\t Total Deduction:" + round(CycleToWork))
        println("\n----------------------------------------------------------------")

    }

}