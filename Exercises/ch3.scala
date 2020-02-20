println("*" * 5)
println("Exercice 1")
println("*" * 5)

val string1: String = ""
val res = string1 match {
  case "" => "n/a"
  case x => x
}
println(res)

println("*" * 5)
println("Exercice 2")
println("*" * 5)

val amount = 0d
if (amount > 0) {
  println("Greater")
} else if (amount < 0) {
  println("lesser")
} else {
  println("same")
}

amount match {
  case a if a > 0 => println("Greater")
  case a if a < 0 => println("lesser")
  case a => println("same")
}

println("*" * 5)
println("Exercice 3")
println("*" * 5)

// Write an expression to convert one of the input values "cyan", "magenta", "yellow" to their 6-char hexadecimal equivalents in string form. What can you do to handle error conditions?

val color = "dadas"
color match {
  case "cyan" => "00FFFF"
  case "magenta" => "FF00FF"
  case "yellow" => "FFFF00"
  case x => println(f"Unkwown color $x")
            "n/a"
}

println("*" * 5)
println("Exercice 4")
println("*" * 5)

// 4) Print the numbers 1 to 100, with each line containing a group of 5 numbers. For example:
//
//   -------------------------------------------------------------------------------
// 1, 2, 3, 4, 5,
// 6, 7, 8, 9, 10
// ....
// -------------------------------------------------------------------------------

for (x <- 1 to 100 by 5) {
  for (j <- x to x + 4) print(f"$j,")
  println("")
}

println("*" * 5)
println("Exercice 5")
println("*" * 5)

// 5) There is a popular coding interview question I'll call "typesafe", in which the numbers 1 - 100 must be printed one per line.
// The catch is that multiples of 3 must replace the number with the word "type", while multiples of 5 must replace the number with the word "safe".
// Of course, multiples of 15 must print "typesafe".

for (x <- 1 to 100 by 5) {
  x match {
    case x if x % 15 == 0 => println("typesafe")
    case x if x % 5 == 0 => println("type")
    case x if x % 3 == 0 => println("safe")
    case x => println(x)
  }
}

println("*" * 5)
println("Exercice 6")
println("*" * 5)

// 6) Can you rewrite the answer to question 5 to fit on one line? It probably won't be easier to read, but reducing
// code to its shortest form is an art, and a good exercise to learn the language.

for (x <- 1 to 100 by 5; r = if (x % 15 == 0) "typesafe" else if (x % 5 == 0) "type" else if (x % 3 ==0) "safe" else x) println(r)