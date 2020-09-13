package com.example.bluetoothbeacon

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class DeviceAdapter(context: Context, val devices: MutableList<Device>): BaseAdapter() {


    private val inflater: LayoutInflater
            = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    //1
    override fun getCount(): Int {
        return devices.size
    }

    //2
    override fun getItem(position: Int): Any {
        return devices[position]
    }

    //3
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val rowView = inflater.inflate(R.layout.device_item, parent, false)

        val device = devices[position]

        var deviceTextView = rowView.findViewById(R.id.textView) as TextView
        deviceTextView.text = device.toString()

        if(!device.isConnectable!!){
            deviceTextView.setTextColor(Color.LTGRAY)
        }



        return rowView
    }
}