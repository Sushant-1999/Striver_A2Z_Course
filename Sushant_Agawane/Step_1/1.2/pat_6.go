package main

import "fmt"

func main() {
	var line int
	fmt.Println("Enter the no of lines want to print pattern")
	fmt.Scan(&line)

	for i := line; i > 0; i-- {
		for j := 1; j <= i; j++ {
			fmt.Printf("%d", j)
		}
		fmt.Println()
	}
}
