package main

import (
	"fmt"
	"time"
)

func main() {
	go sampleRoutine()
	fmt.Println("Started Main")
	time.Sleep(1 * time.Second)
	fmt.Println("Finished Main")
}

func sampleRoutine() {
	fmt.Println("Inside Sample Goroutine")
}
