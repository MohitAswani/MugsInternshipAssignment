package com.example.mugsinternshipassignment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.mugsinternshipassignment.databinding.ItemMonthBinding

class MonthAdapter : RecyclerView.Adapter<MonthAdapter.MonthViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewCategory: Int): MonthViewHolder {
        val itemIssuesBinding = ItemMonthBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return MonthViewHolder(itemIssuesBinding)
    }

    override fun onBindViewHolder(holder: MonthViewHolder, position: Int) {
        holder.setMonth(differ.currentList[position])
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    inner class MonthViewHolder(private val binding: ItemMonthBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun setMonth(month: Month) {
            binding.itemMonthName.text=month.monthName
            binding.itemCard.setOnClickListener {
                onMonthClickListener?.let {
                    it(month)
                }
            }
        }
    }

    private var onMonthClickListener: ((Month) -> Unit)? = null

    fun setOnMonthClickListener(listener: (Month) -> Unit) {
        onMonthClickListener = listener
    }


    private val differCallback = object : DiffUtil.ItemCallback<Month>() {
        override fun areItemsTheSame(
            oldItem: Month,
            newItem: Month
        ): Boolean {
            return oldItem.monthName == newItem.monthName
        }

        override fun areContentsTheSame(
            oldItem: Month,
            newItem: Month
        ): Boolean {
            return oldItem == newItem
        }
    }

    val differ = AsyncListDiffer(this, differCallback)
}