package main

import "fmt"

func main() {
	var line int
	fmt.Println("Enter the value of no of line")
	fmt.Scan(&line)

	temp := 1
	for i := 0; i < line; i++ {
		for j := 0; j <= i; j++ {
			fmt.Printf("%d ", temp)
			temp = temp + 1
		}
		fmt.Println()
	}
}
