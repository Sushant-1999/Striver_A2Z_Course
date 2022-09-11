package main

import "fmt"

func main() {
	var line int
	fmt.Println("Enter the value of no of line")
	fmt.Scan(&line)

	temp := 'A'
	for i := line - 1; i >= 0; i-- {
		for j := 0; j <= i; j++ {
			fmt.Printf("%c", temp)
			temp = temp + 1
		}
		temp = 'A'
		fmt.Println()
	}
}
