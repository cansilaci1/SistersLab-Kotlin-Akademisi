package com.example.firebaseauthentication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.firebaseauthentication.databinding.ActivitySignInBinding
import com.google.firebase.auth.FirebaseAuth

class SignInActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignInBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        binding.textView.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
            finish()
        }

        binding.button2.setOnClickListener{
            val email = binding.etMail.text.toString()
            val pass = binding.etPassword.text.toString()

            if (email.isNotEmpty() && pass.isNotEmpty()){


                    firebaseAuth.signInWithEmailAndPassword(email, pass)
                        .addOnCompleteListener {
                            if (it.isSuccessful){
                                val intent = Intent(this, MainActivity::class.java)
                                startActivity(intent)
                                finish()
                            }else{
                                Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()
                            }
                        }
                }else{
                    Toast.makeText(this,"Empty Fields Are not Allowed !", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
