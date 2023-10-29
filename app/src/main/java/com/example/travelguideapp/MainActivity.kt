package com.example.travelguideapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var current =0
    lateinit var image : ImageView
    var placesName= arrayOf("World of Wonder","DLF","Akshardhaam")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val prevButton=findViewById<ImageButton>(R.id.imageButton)
        val nextButton=findViewById<ImageButton>(R.id.imageButton2)
        val placeName=findViewById<TextView>(R.id.textPlaces)


        prevButton.setOnClickListener{

            //wanna get the previous image
            var idCurrentImageString="img$current"

         //to get integer address associated with each view
         var idCurrentImageInt=this.resources.getIdentifier(idCurrentImageString,"id",packageName)
         image=findViewById(idCurrentImageInt)
            image.alpha=0f

            //to bring the next image
            current=(3+current-1)%3
            var newImage="img$current"
            var newImageIntID=this.resources.getIdentifier(newImage,"id",packageName)
            image=findViewById(newImageIntID)
            image.alpha=1f
            placeName.text=placesName[current]
        }

        nextButton.setOnClickListener{

           //wanna get the next image
           var idCurrentImageString="img$current"
            var idCurrentImageInt=this.resources.getIdentifier(idCurrentImageString,"id",packageName)
          image=findViewById(idCurrentImageInt)
            image.alpha=0f

            current=(3+current+1)%3
            var newImage="img$current"
            var newImageInt=this.resources.getIdentifier(newImage,"id",packageName)
            image=findViewById(newImageInt)
            image.alpha=1f
            placeName.text=placesName[current]
       }
    }
}