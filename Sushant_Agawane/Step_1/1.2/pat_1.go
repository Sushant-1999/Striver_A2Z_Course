package main

import "fmt"

func main() {
	var row, col int
	fmt.Println("Enter the value of row and Col for Star pattern")
	fmt.Scan(&row, &col)

	for i := 0; i < row; i++ {
		for j := 0; j < col; j++ {
			fmt.Print("*")
		}
		fmt.Println()
	}
}
