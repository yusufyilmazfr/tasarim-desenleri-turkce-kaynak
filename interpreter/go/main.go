package main

import "fmt"

func main() {
	ctx := NewContext()
	ctx.Formula = "GGML"

	jobManager := NewJobManager()
	if err := jobManager.RunExpression(ctx); err != nil {
		fmt.Println(err)
	}

	fmt.Printf("%s :> %d\n", ctx.Formula, ctx.TotalPoint)
	// output: GGML :> 18000
}
