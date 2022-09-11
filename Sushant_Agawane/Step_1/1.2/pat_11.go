package main

import "fmt"

func main() {
	var line int
	fmt.Println("Enter the no of lines want to print pattern")
	fmt.Scan(&line)

	for i := 0; i < line; i++ {
		if i%2 == 0 {
			for j := 0; j <= i; j++ {
				if j%2 == 0 {
					fmt.Print(1)
				} else {
					fmt.Print(0)
				}
			}
			fmt.Println()
		} else {
			for k := 0; k <= i; k++ {
				if k%2 == 0 {
					fmt.Print(0)
				} else {
					fmt.Print(1)
				}
			}
			fmt.Println()
		}
	}
}
