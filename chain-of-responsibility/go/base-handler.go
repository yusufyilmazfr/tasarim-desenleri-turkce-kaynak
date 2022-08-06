package main

type BaseHandler interface {
	SetNextHandler(nextHandler BaseHandler)
	HandleRequest(img Image)
}
