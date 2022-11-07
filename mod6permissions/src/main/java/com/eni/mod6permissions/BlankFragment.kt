package com.eni.mod6permissions

import android.Manifest
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.Fragment



class BlankFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    val singlePermission = registerForActivityResult(ActivityResultContracts.RequestPermission())
    { granted ->
        when {
            granted -> {
                // access to the camera is allowed, open the camera
            }
            //!shouldShowRequestPermissionRationale(Manifest.permission.SEND_SMS) -> {
            //    // access to the camera is denied, the user has checked the Don't ask again.
            //}
            else -> {
                // access to the camera is denied, the user has rejected the request
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        vButtonPermission.setOnClickListener {
            if (shouldShowRequestPermissionRationale(Manifest.permission.SEND_SMS)) {
                // access to the camera is prohibited, explain why the permission is required
            } else {
                singlePermission.launch(Manifest.permission.SEND_SMS)
            }
        }

    }
}