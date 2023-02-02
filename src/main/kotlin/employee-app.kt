import kotlin.math.round

val FirstName = "clinton"
val Surname = "bempah"
val Gender = "m"
val EmployeeID = 6143
val GrossSalary = 67_543.21
val PAYE = 38.5
val PRSI = 5.2
val Bonus = 1450.50
val CycleToWork = 54.33
val x = 12
val y = 100
val TotalDeduction =  (PAYE )+ PRSI + CycleToWork
val Net =  (GrossSalary) - TotalDeduction
fun main(args: Array<String>) {
    var input: Int
    do {

        input = menu()
        when (input) {
            1 -> println("Monthly Salary: ${getMonthlySalary()}")
            2 -> println("Monthly PRSI:${getMonthlyPRSI()}")
            3 -> println("Monthly PAYE:${getMonthlyPRSI()}")
            4-> println("Monthly Gross Pay: ${getGrossMonntlyPay()}")
            5-> println("Monthly Total Deductions: ${getTotalMonthlyDeductions()}")
             6-> println("Monthly Net Pay: ${getNetMonthlyPay()}")
             7-> println(getPayslip())
               -1 -> println("Exiting App")
               else -> println("Invaild Option")

        }
           println()
    }while (input != -1)
}

fun menu(): Int {
    print(
        """
         Employee Menu for ${getFullname()}
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
fun getMonthlySalary  () =  GrossSalary / x
fun getMonthlyPRSI () =  (GrossSalary / x) / y * PRSI
fun getMonthlyPAYE () =  (GrossSalary / x) * (PAYE / y)
 fun getGrossMonntlyPay() = GrossSalary / x + Bonus / x
fun getTotalMonthlyDeductions() =  roundTwoDecimals(PAYE + PRSI + CycleToWork)
fun getNetMonthlyPay() = GrossSalary - TotalDeduction

fun getPayslip() {

    println("\n----------------------------------------------------------------")
    println("                     Monthly Payslip")
    println("\n-----------------------------------------------------------------")
    println("\tEmployee Name:  ${FirstName.uppercase()}  ${Surname.uppercase()} (${Gender.uppercase()})      Employee ID: $EmployeeID ")
    println("\n-----------------------------------------------------------------")
    println("\tPAYMENT DETAILS       DEDUCTION TOTALS")
    println("\n----------------------------------------------------------------")
    println("  \tSalary :" + roundTwoDecimals(GrossSalary / x))
    println("\tBonus: " + roundTwoDecimals(Bonus / x))
    println("                                    \tPAYE : " + roundTwoDecimals(PAYE))
    println("                                      \tPRSI : " + roundTwoDecimals(PRSI))
    println("                                     \tCycle To Work: $CycleToWork")
    println("\n----------------------------------------------------------------")
    println("\t Gross: " + roundTwoDecimals(GrossSalary) + "\t Total Deduction:" + roundTwoDecimals(TotalDeduction))
    println("\n----------------------------------------------------------------")
    println("\t  NET PAY: " + roundTwoDecimals(Net))
}

fun roundTwoDecimals(number: Double) = round(number * 100) / 100

fun getFullname() = FirstName.uppercase() + "  " + Surname.uppercase()
