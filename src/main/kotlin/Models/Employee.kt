package Models

import x
import y
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

    fun roundTwoDecimals(number: Double) = round(number * 100) / 100


    fun getMonthlySalary() = (GrossSalary / x)
    fun getMonthlyPRSI() = (GrossSalary / x / y * PRSI)
    fun getMonthlyPAYE() = GrossSalary / x * (PAYE / y)
    fun getGrossMonntlyPay() = GrossSalary / x + Bonus / x
    fun getTotalMonthlyDeductions() = round(PAYE + PRSI + CycleToWork)
    fun getNetMonthlyPay() = GrossSalary - CycleToWork

    fun getPayslip() =
        """"
        ----------------------------------------------------------------
                         Monthly Payslip
        -----------------------------------------------------------------
        Employee Name:  ${firstName.uppercase()}  ${Surname.uppercase()}  (${Gender.uppercase()}     Employee ID: ${EmployeeID}
       -----------------------------------------------------------------
        PAYMENT DETAILS       DEDUCTION TOTALS
        ----------------------------------------------------------------
        Bonus: ${round(Bonus / x)}
                                                 PAYE :  ${(PAYE)}
                                                 PRSI :  ${(PRSI)}
                                                 Cycle To Work: ${CycleToWork}
        ---------------------------------------------------------------
        Gross: ${round(GrossSalary)}      Total Deduction: ${(CycleToWork)}
        ----------------------------------------------------------------
        NET PAY : ${getNetMonthlyPay()}
        --------------------------------------------------------------- """



    override fun toString(): String {
        return "Employee(firstName='$firstName', Surname='$Surname', Gender=$Gender, EmployeeID=$EmployeeID, GrossSalary=$GrossSalary, PAYE=$PAYE, PRSI=$PRSI, Bonus=$Bonus, CycleToWork=$CycleToWork)"
    }

}