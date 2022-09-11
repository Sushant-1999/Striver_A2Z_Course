//Below is the Pattern for the Right Pascal Star Pattern
package main

import "fmt"

func main() {
	var line int
	fmt.Println("Enter the no of lines want to print pattern")
	fmt.Scan(&line)

	for i := 0; i < line; i++ {
		for j := 0; j <= i; j++ {
			fmt.Print("*")
		}
		fmt.Println()
	}
	//Now printing the below part
	for i := line - 1; i >= 0; i-- {
		for j := 0; j <= i; j++ {
			fmt.Print("*")
		}
		fmt.Println()
	}
}
