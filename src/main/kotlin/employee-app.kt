
var FirstName = "clinton"
var Surname = "bempah"
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
          GrossSalary / x
PAYE = (GrossSalary / x) * (PAYE / y)
       PRSI= (GrossSalary / x) / y * PRSI
       var TotalDeduction = PAYE + PRSI + CycleToWork
       var Gross = GrossSalary / x + Bonus / x
       var Net = Gross-TotalDeduction

       println("\n----------------------------------------------------------------")
       println("                     Monthly Payslip")
       println("\n-----------------------------------------------------------------")
       println("\tEmployee Name:  ${FirstName.uppercase()}  ${Surname.uppercase()} ($Gender)      Employee ID: $EmployeeID ")
       println("\n-----------------------------------------------------------------")
       println("\tPAYMENT DETAILS       DEDUCTION TOTALS")
       println("\n----------------------------------------------------------------")
       println("  \tSalary :" + "%.2f".format( GrossSalary / x))
       println("\tBonus: " + "%.2f".format(Bonus / x))
       println("                                    \tPAYE : " + "%.2f".format (PAYE ))
       println("                                      \tPRSI : "+ "%.2f".format(PRSI))
       println("                                     \tCycle To Work: $CycleToWork")
       println("\n----------------------------------------------------------------")
       println("\t Gross: " + "%.2f".format(Gross) + "\t Total Deduction:" + "%.2f".format(TotalDeduction))
       println("\n----------------------------------------------------------------")
       println("\t  NET PAY: " + "%.2f".format(Net))
   }



