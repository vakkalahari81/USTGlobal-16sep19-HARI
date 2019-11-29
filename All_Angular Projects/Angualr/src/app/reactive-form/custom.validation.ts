import { AbstractControl, ValidationErrors } from '@angular/forms';

export class CustomValidation{

    constructor(){}

    static unique(controls : AbstractControl): ValidationErrors | null{

        if (controls.value === 'hari@gmail.com') {
            return {unique: true};
        } else {
                    return  null;
        }
    }
}