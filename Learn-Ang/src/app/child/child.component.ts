import { Component, OnInit,Input,Output,EventEmitter } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls:['./child.component.css' ]

})
export class ChildComponent implements OnInit {
  //Child interface 
  @Input() childMessage:string | undefined;
  //Parent interface
  @Output() messaegeEvent=new EventEmitter<string>();
  //EventEmitter is always works with the function implementation.
  message='Message from Child! My name is youngerOne'

  constructor() { }

  ngOnInit(): void {
  }
  sendMessage(){
    //if any infromation/data needs to passed via emited we need to initialize the data
    this.messaegeEvent.emit('Hello from Child');
  }
}
