package com.example.lab6

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lab6.constants.Constants
import com.example.lab6.model.Question

class CustomAdapter(private val data: List<Question>) :
    RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val rowItem: View =
            LayoutInflater.from(parent.context).inflate(R.layout.list_item_view, parent, false)
        return ViewHolder(rowItem)
    }

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {
        //putting data for the specific boxes
        holder.resName.text = data[position].question
        holder.resAddress.text = "single answer"
        holder.resPrice.text = Constants.findCorrectAnwer(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

    class ViewHolder(view: View) :
        RecyclerView.ViewHolder(view), View.OnClickListener {
        val resName: TextView
        val resAddress: TextView
        val resPrice: TextView
        val btn1: Button
        val btn2: Button
        override fun onClick(view: View) {
            //sending restaurant data to the detail fragment


        }

        init {
            view.setOnClickListener(this)
            resName = view.findViewById(R.id.rName)
            resAddress = view.findViewById(R.id.rAddress)
            resPrice = view.findViewById(R.id.rPrice)
            btn1 = view.findViewById(R.id.btn_delete)
            btn2 = view.findViewById(R.id.btn_details)


        }

    }
}