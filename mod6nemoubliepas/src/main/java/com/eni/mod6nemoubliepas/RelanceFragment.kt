package com.eni.mod6nemoubliepas

import android.Manifest
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.Fragment

private const val TAG = "RelanceFragment"
class RelanceFragment : Fragment() {
    var tel = ""
    val singlePermission = registerForActivityResult(
        ActivityResultContracts.RequestPermission())
    { granted ->
        if(granted){
            sendSms()
        }
        else {
            // access to the camera is denied, the user has rejected the request
            Log.d("RelanceFragment", "La permission d'envoi SMS a été refusée ")
        }
    }
    val multiplePermissions = registerForActivityResult(
        ActivityResultContracts.RequestMultiplePermissions())
    { mapsPermissionsGranted : Map<String, Boolean> ->
        if(mapsPermissionsGranted[Manifest.permission.SEND_SMS] == true){
            sendSms()
        }
        else {
            // access to the camera is denied, the user has rejected the request
            Log.d("RelanceFragment", "La permission d'envoi SMS a été refusée ")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_relance, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.buttonRelance).setOnClickListener {
            //if (shouldShowRequestPermissionRationale(Manifest.permission.SEND_SMS)) {
            //    // access to the camera is prohibited, explain why the permission is required
            //} else {
            tel = view.findViewById<EditText>(R.id.editTextPhone).text.toString()
            singlePermission.launch(Manifest.permission.SEND_SMS)
            //multiplePermissions.launch(
            //    arrayOf(Manifest.permission.SEND_SMS,Manifest.permission.CALL_PHONE)
            //)
            //}
        }
        Log.i(TAG, "onCreate: FIn du onCreate")

    }
    private fun sendSms(){
        val intent = Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:$tel"))
        intent.putExtra("sms_body", "Je te relance")
        startActivity(intent)
    }
}