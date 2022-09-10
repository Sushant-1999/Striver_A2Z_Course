package main

import "fmt"

func main() {
	var line int
	fmt.Println("Enter the no of lines want to print pattern")
	fmt.Scan(&line)

	for i := 0; i < line; i++ {
		for j := 0; j <= i; j++ {
			fmt.Printf("%d", i+1)
		}
		fmt.Println()
	}
}
