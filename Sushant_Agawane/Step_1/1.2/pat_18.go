package main

import "fmt"

func main() {
	var line int
	fmt.Println("Enter the value of no of line")
	fmt.Scan(&line)
	val := line - 1
	temp := 'A' + (line - 1)
	for i := 0; i < line; i++ {
		val = val - 1
		for j := 0; j <= i; j++ {
			fmt.Printf("%c ", temp)
			temp = temp + 1
		}
		temp = 'A' + val
		fmt.Println()
	}
}
