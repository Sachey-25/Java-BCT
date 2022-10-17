// we need to import the component from angular. 
import { Component } from '@angular/core'

@Component({
    selector:'app-hello-world' ,  
    template:'<h2>{{ title }}</h2>',
    styles:[`
        h2 {
            text-align:center;
            color:blue;
            }
    `]
})
export class HelloWorldComponent{
    title="Hello World";
}