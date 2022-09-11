package main

import "fmt"

func main() {
	var line int
	fmt.Println("Enter the no of lines want to print pattern")
	fmt.Scan(&line)

	space := line
	for i := 0; i < line; i++ {
		for j := 0; j <= i; j++ {
			fmt.Printf("%d", j+1)
		}
		//Now printing space
		for k := 0; k < 2*(space-1); k++ {
			fmt.Print(" ")
		}

		for l := i; l >= 0; l-- {
			fmt.Print(l + 1)
		}
		space = space - 1
		fmt.Println()
	}
}
