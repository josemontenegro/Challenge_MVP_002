package com.example.admin.challenge_mvp_002;

public class PassValue {

    private PassCallback callback;

    public PassValue(PassCallback callback) {
        this.callback = callback;
    }

    public void validate(String value){

        if (value.trim().length() > 0){

            if (value.trim().length() > 7){

                value = String.valueOf( " Pasword Valida" );


                callback.passResult(value);

            }else{
                value = String.valueOf( " Password muy corta" );


                callback.passResult(value);
            }



        }else{
            callback.blankInput();
        }


    }
}




