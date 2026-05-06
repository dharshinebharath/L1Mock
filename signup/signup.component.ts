import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from "@angular/forms";

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css'],
})
export class SignupComponent implements OnInit {
submit() {
  console.log(this.form.value);
}
form: FormGroup;

  constructor(private fb:FormBuilder) { 
    this.form=this.fb.group(
      {
        username:['',Validators.required ],
        password:['', [Validators.required,   Validators.pattern(/.*[0-9].*/)
]],
        email:['', Validators.email],
        age:['', Validators.required],
        conditions:['', Validators.required]
      }
    )
  }

  ngOnInit(): void {
  }

}
