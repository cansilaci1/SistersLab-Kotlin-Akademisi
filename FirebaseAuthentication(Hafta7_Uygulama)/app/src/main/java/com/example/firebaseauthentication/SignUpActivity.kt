package com.example.firebaseauthentication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.firebaseauthentication.databinding.ActivitySignUpBinding
import com.google.firebase.auth.FirebaseAuth

class SignUpActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        binding.textView2.setOnClickListener{
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
            finish()
        }

        binding.btnSignUp.setOnClickListener {
            val email = binding.etMail2.text.toString()
            val pass = binding.etPassword2.text.toString()
            val confirmPass = binding.etPassword3.text.toString()

            if (email.isNotEmpty() && pass.isNotEmpty() && confirmPass.isNotEmpty()){
                if (pass == confirmPass){

                    firebaseAuth.createUserWithEmailAndPassword(email, pass)
                        .addOnCompleteListener {
                            if (it.isSuccessful){
                                val intent = Intent(this, SignInActivity::class.java)
                                startActivity(intent)
                                finish()
                            }else{
                                Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()
                            }
                        }
                }else{
                    Toast.makeText(this,"Password is not matching !", Toast.LENGTH_SHORT).show()
                }
            }else{
                Toast.makeText(this,"Empty Fields Are not Allowed !", Toast.LENGTH_SHORT).show()
            }
        }
    }
}