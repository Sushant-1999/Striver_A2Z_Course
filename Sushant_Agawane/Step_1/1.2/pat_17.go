package main

import "fmt"

func main() {
	var line int
	fmt.Println("Enter the value of no of line")
	fmt.Scan(&line)

	temp := 'A'
	space := line - 1
	odd := 1
	for i := 0; i < line; i++ {
		//Handling space first
		for k := space; k >= 0; k-- {
			fmt.Print(" ")
		}
		for j := 0; j <= i; j++ {
			fmt.Printf("%c", temp)
			temp = temp + 1
		}
		temp = temp - 2
		for k := 0; k < i; k++ {
			fmt.Printf("%c", temp)
			temp = temp - 1
		}

		space = space - 1
		odd = odd + 2
		temp = 'A'
		fmt.Println()
	}
}
