package main

import "fmt"

func main() {
	var line int
	fmt.Println("Enter the no of lines want to print pattern")
	fmt.Scan(&line)

	for i := line; i > 0; i-- {
		for j := i; j > 0; j-- {
			fmt.Print("*")
		}
		fmt.Println()
	}
}
