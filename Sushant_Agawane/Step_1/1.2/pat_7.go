package main

import "fmt"

func main() {
	var line int
	fmt.Println("Enter the no of lines want to print pattern")
	fmt.Scan(&line)

	//Handling for space also
	odd := 1
	space := line
	for i := 0; i < line; i++ {
		//print space
		for k := 0; k < space; k++ {
			fmt.Print(" ")
		}
		for j := 1; j <= odd; j++ {
			fmt.Print("*")
		}
		odd = odd + 2
		space = space - 1
		fmt.Println()
	}
}
