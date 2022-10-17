import { TemplateLiteral } from '@angular/compiler';
import { Component } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { pet } from './pet.model';

@Component({
  selector: 'app-root',
  template: `
  <h1>Angular Router App</h1>

  `,
  templateUrl:'./app.component.html'
})
export class AppComponent {
  registerForm!:FormGroup
  submited=false;
  constructor(private formBuilder:FormBuilder){

  }
  ngOnInit(){
    //Validations
    this.registerForm=this.formBuilder.group({
      firstName:['',Validators.required, Validators.minLength(8)],
      lastName:['',Validators.required],
      email :['',Validators.required, Validators.email],
      password:['',Validators.required, Validators.minLength(8)],


    })
  }
  OnsubmitRegister(){
    this.submitted=true;
    if(this.registerForm.invalid){return}
    alert("Success");
  }
 

  name=new FormControl('');

  updateName(){
    this.name.setValue('Anything')
  }

  //Let's create the formgroup
  profileForm=new FormGroup({
    firstname:new FormControl(''),
    lastname:new FormControl(''), // 
    email:new FormControl(''),
    city:new FormControl(''),
    state:new FormControl('')
  })

  onSubmitform(){
    console.log(this.profileForm.value);
  }


  species=['fish','cat','dog'];
  model=new pet(1, 'Goldie',this.species[0]);
  submitted=false;

  onSubmit(){
    this.submitted=true;
  }

}
