
var FirstName = "JOE"
var Surname = "SOAP"
var Gender = "M"
var EmployeeID = 6143
var GrossSalary = 67_543.21
var PAYE = 38.5
var PRSI = 5.2
var Bonus = 1450.50
var CycleToWork = 54.33
var x = 12
var y = 100
fun main() {
    println("Pay Slip Printer")
    payslip()
}
   fun payslip(){

PAYE = (GrossSalary / x) * (PAYE / y)
       PRSI= (GrossSalary / x) / y * PRSI
       var TotalDeduction = PAYE + PRSI + CycleToWork
       var Gross = GrossSalary / x + Bonus / x
       var Net = Gross-TotalDeduction

       println("\n----------------------------------------------------------------")
       println("                     Monthly Payslip")
       println("\n-----------------------------------------------------------------")
       println("\tEmployee Name:  $FirstName  $Surname ($Gender)      Employee ID: $EmployeeID ")
       println("\n-----------------------------------------------------------------")
       println("\tPAYMENT DETAILS       DEDUCTION TOTALS")
       println("\n----------------------------------------------------------------")
       GrossSalary / x
       println("  \tSalary : ${GrossSalary / x}")
       println("\tBonus: " + Bonus / x)
       println("                                    \tPAYE : " + PAYE )
       println("                                      \tPRSI : "+ PRSI)
       println("                                     \tCycle To Work: $CycleToWork")
       println("\n----------------------------------------------------------------")
       println("\t Gross: " + Gross + "\t Total Deduction:" + TotalDeduction)
       println("\n----------------------------------------------------------------")
       println("\t  NET PAY: " + Net)
   }



