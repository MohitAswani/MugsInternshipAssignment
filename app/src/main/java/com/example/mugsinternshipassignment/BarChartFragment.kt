package com.example.mugsinternshipassignment

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mugsinternshipassignment.databinding.FragmentBarChartBinding
import com.github.mikephil.charting.charts.BarChart
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import com.github.mikephil.charting.utils.ColorTemplate
import java.util.*
import kotlin.collections.ArrayList

class BarChartFragment : Fragment() {

    private lateinit var barChart: BarChart
    private lateinit var binding: FragmentBarChartBinding
    private lateinit var monthAdapter: MonthAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBarChartBinding.inflate(inflater);

        barChart = binding.barChart

        setUpRecyclerView()
        setUpMonthData()


        return binding.root
    }

    private fun setUpMonthData()
    {
        val monthData= mutableListOf<Month>()

        monthData.add(Month("January", arrayListOf(
            BarEntry(1.toFloat(),Random().nextFloat()),
            BarEntry(2.toFloat(),Random().nextFloat()),
            BarEntry(3.toFloat(),Random().nextFloat()),
            BarEntry(4.toFloat(),Random().nextFloat()),
            BarEntry(5.toFloat(),Random().nextFloat()),
            BarEntry(6.toFloat(),Random().nextFloat()),
            BarEntry(7.toFloat(),Random().nextFloat()),
            BarEntry(8.toFloat(),Random().nextFloat()),
            BarEntry(9.toFloat(),Random().nextFloat()),
            BarEntry(10.toFloat(),Random().nextFloat()),
            BarEntry(11.toFloat(),Random().nextFloat()),
            BarEntry(12.toFloat(),Random().nextFloat()),
        )))

        monthData.add(Month("February", arrayListOf(
            BarEntry(1.toFloat(),Random().nextFloat()),
            BarEntry(2.toFloat(),Random().nextFloat()),
            BarEntry(3.toFloat(),Random().nextFloat()),
            BarEntry(4.toFloat(),Random().nextFloat()),
            BarEntry(5.toFloat(),Random().nextFloat()),
            BarEntry(6.toFloat(),Random().nextFloat()),
            BarEntry(7.toFloat(),Random().nextFloat()),
            BarEntry(8.toFloat(),Random().nextFloat()),
            BarEntry(9.toFloat(),Random().nextFloat()),
            BarEntry(10.toFloat(),Random().nextFloat()),
            BarEntry(11.toFloat(),Random().nextFloat()),
            BarEntry(12.toFloat(),Random().nextFloat()),
        )))

        monthData.add(Month("March", arrayListOf(
            BarEntry(1.toFloat(),Random().nextFloat()),
            BarEntry(2.toFloat(),Random().nextFloat()),
            BarEntry(3.toFloat(),Random().nextFloat()),
            BarEntry(4.toFloat(),Random().nextFloat()),
            BarEntry(5.toFloat(),Random().nextFloat()),
            BarEntry(6.toFloat(),Random().nextFloat()),
            BarEntry(7.toFloat(),Random().nextFloat()),
            BarEntry(8.toFloat(),Random().nextFloat()),
            BarEntry(9.toFloat(),Random().nextFloat()),
            BarEntry(10.toFloat(),Random().nextFloat()),
            BarEntry(11.toFloat(),Random().nextFloat()),
            BarEntry(12.toFloat(),Random().nextFloat()),
        )))

        monthData.add(Month("April", arrayListOf(
            BarEntry(1.toFloat(),Random().nextFloat()),
            BarEntry(2.toFloat(),Random().nextFloat()),
            BarEntry(3.toFloat(),Random().nextFloat()),
            BarEntry(4.toFloat(),Random().nextFloat()),
            BarEntry(5.toFloat(),Random().nextFloat()),
            BarEntry(6.toFloat(),Random().nextFloat()),
            BarEntry(7.toFloat(),Random().nextFloat()),
            BarEntry(8.toFloat(),Random().nextFloat()),
            BarEntry(9.toFloat(),Random().nextFloat()),
            BarEntry(10.toFloat(),Random().nextFloat()),
            BarEntry(11.toFloat(),Random().nextFloat()),
            BarEntry(12.toFloat(),Random().nextFloat()),
        )))

        monthData.add(Month("May", arrayListOf(
            BarEntry(1.toFloat(),Random().nextFloat()),
            BarEntry(2.toFloat(),Random().nextFloat()),
            BarEntry(3.toFloat(),Random().nextFloat()),
            BarEntry(4.toFloat(),Random().nextFloat()),
            BarEntry(5.toFloat(),Random().nextFloat()),
            BarEntry(6.toFloat(),Random().nextFloat()),
            BarEntry(7.toFloat(),Random().nextFloat()),
            BarEntry(8.toFloat(),Random().nextFloat()),
            BarEntry(9.toFloat(),Random().nextFloat()),
            BarEntry(10.toFloat(),Random().nextFloat()),
            BarEntry(11.toFloat(),Random().nextFloat()),
            BarEntry(12.toFloat(),Random().nextFloat()),
        )))

        monthData.add(Month("June", arrayListOf(
            BarEntry(1.toFloat(),Random().nextFloat()),
            BarEntry(2.toFloat(),Random().nextFloat()),
            BarEntry(3.toFloat(),Random().nextFloat()),
            BarEntry(4.toFloat(),Random().nextFloat()),
            BarEntry(5.toFloat(),Random().nextFloat()),
            BarEntry(6.toFloat(),Random().nextFloat()),
            BarEntry(7.toFloat(),Random().nextFloat()),
            BarEntry(8.toFloat(),Random().nextFloat()),
            BarEntry(9.toFloat(),Random().nextFloat()),
            BarEntry(10.toFloat(),Random().nextFloat()),
            BarEntry(11.toFloat(),Random().nextFloat()),
            BarEntry(12.toFloat(),Random().nextFloat()),
        )))

        monthData.add(Month("July", arrayListOf(
            BarEntry(1.toFloat(),Random().nextFloat()),
            BarEntry(2.toFloat(),Random().nextFloat()),
            BarEntry(3.toFloat(),Random().nextFloat()),
            BarEntry(4.toFloat(),Random().nextFloat()),
            BarEntry(5.toFloat(),Random().nextFloat()),
            BarEntry(6.toFloat(),Random().nextFloat()),
            BarEntry(7.toFloat(),Random().nextFloat()),
            BarEntry(8.toFloat(),Random().nextFloat()),
            BarEntry(9.toFloat(),Random().nextFloat()),
            BarEntry(10.toFloat(),Random().nextFloat()),
            BarEntry(11.toFloat(),Random().nextFloat()),
            BarEntry(12.toFloat(),Random().nextFloat()),
        )))

        monthData.add(Month("August", arrayListOf(
            BarEntry(1.toFloat(),Random().nextFloat()),
            BarEntry(2.toFloat(),Random().nextFloat()),
            BarEntry(3.toFloat(),Random().nextFloat()),
            BarEntry(4.toFloat(),Random().nextFloat()),
            BarEntry(5.toFloat(),Random().nextFloat()),
            BarEntry(6.toFloat(),Random().nextFloat()),
            BarEntry(7.toFloat(),Random().nextFloat()),
            BarEntry(8.toFloat(),Random().nextFloat()),
            BarEntry(9.toFloat(),Random().nextFloat()),
            BarEntry(10.toFloat(),Random().nextFloat()),
            BarEntry(11.toFloat(),Random().nextFloat()),
            BarEntry(12.toFloat(),Random().nextFloat()),
        )))

        monthData.add(Month("September", arrayListOf(
            BarEntry(1.toFloat(),Random().nextFloat()),
            BarEntry(2.toFloat(),Random().nextFloat()),
            BarEntry(3.toFloat(),Random().nextFloat()),
            BarEntry(4.toFloat(),Random().nextFloat()),
            BarEntry(5.toFloat(),Random().nextFloat()),
            BarEntry(6.toFloat(),Random().nextFloat()),
            BarEntry(7.toFloat(),Random().nextFloat()),
            BarEntry(8.toFloat(),Random().nextFloat()),
            BarEntry(9.toFloat(),Random().nextFloat()),
            BarEntry(10.toFloat(),Random().nextFloat()),
            BarEntry(11.toFloat(),Random().nextFloat()),
            BarEntry(12.toFloat(),Random().nextFloat()),
        )))

        monthData.add(Month("October", arrayListOf(
            BarEntry(1.toFloat(),Random().nextFloat()),
            BarEntry(2.toFloat(),Random().nextFloat()),
            BarEntry(3.toFloat(),Random().nextFloat()),
            BarEntry(4.toFloat(),Random().nextFloat()),
            BarEntry(5.toFloat(),Random().nextFloat()),
            BarEntry(6.toFloat(),Random().nextFloat()),
            BarEntry(7.toFloat(),Random().nextFloat()),
            BarEntry(8.toFloat(),Random().nextFloat()),
            BarEntry(9.toFloat(),Random().nextFloat()),
            BarEntry(10.toFloat(),Random().nextFloat()),
            BarEntry(11.toFloat(),Random().nextFloat()),
            BarEntry(12.toFloat(),Random().nextFloat()),
        )))

        monthData.add(Month("November", arrayListOf(
            BarEntry(1.toFloat(),Random().nextFloat()),
            BarEntry(2.toFloat(),Random().nextFloat()),
            BarEntry(3.toFloat(),Random().nextFloat()),
            BarEntry(4.toFloat(),Random().nextFloat()),
            BarEntry(5.toFloat(),Random().nextFloat()),
            BarEntry(6.toFloat(),Random().nextFloat()),
            BarEntry(7.toFloat(),Random().nextFloat()),
            BarEntry(8.toFloat(),Random().nextFloat()),
            BarEntry(9.toFloat(),Random().nextFloat()),
            BarEntry(10.toFloat(),Random().nextFloat()),
            BarEntry(11.toFloat(),Random().nextFloat()),
            BarEntry(12.toFloat(),Random().nextFloat()),
        )))

        monthData.add(Month("December", arrayListOf(
            BarEntry(1.toFloat(),Random().nextFloat()),
            BarEntry(2.toFloat(),Random().nextFloat()),
            BarEntry(3.toFloat(),Random().nextFloat()),
            BarEntry(4.toFloat(),Random().nextFloat()),
            BarEntry(5.toFloat(),Random().nextFloat()),
            BarEntry(6.toFloat(),Random().nextFloat()),
            BarEntry(7.toFloat(),Random().nextFloat()),
            BarEntry(8.toFloat(),Random().nextFloat()),
            BarEntry(9.toFloat(),Random().nextFloat()),
            BarEntry(10.toFloat(),Random().nextFloat()),
            BarEntry(11.toFloat(),Random().nextFloat()),
            BarEntry(12.toFloat(),Random().nextFloat()),
        )))

        monthAdapter.differ.submitList(monthData)
    }

    private fun setUpRecyclerView() {
        monthAdapter = MonthAdapter()
        binding.monthRecyclerView.apply {
            adapter = monthAdapter
            layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)
        }

        monthAdapter.setOnMonthClickListener { month ->
            setUpBarChat(month.monthName,month.barEntries)
        }
    }

    private fun setUpBarChat(monthName:String,barEntries:ArrayList<BarEntry>)
    {
        val barDataSet = BarDataSet(barEntries, "Bar Chart")
        val colors = mutableListOf<Int>()
        ColorTemplate.JOYFUL_COLORS.forEach { it ->
            colors.add(it)
        }
        barDataSet.colors = colors
        barDataSet.setDrawValues(true)
        barDataSet.valueTextColor=Color.WHITE
        barChart.data = BarData(barDataSet)
        barChart.animateY(2000)
        barChart.description.textSize=16F
        barChart.description.text = monthName
        barChart.description.textColor = Color.BLUE

    }


}